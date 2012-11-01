
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.*;
import javax.swing.*;

/**
 * AccountPanel.java
 * @author Nikita Volodin
 */
public class AccountPanel extends JPanel{
    JPanel input;
    JTextField field;
    JLabel introField, firstHalf, secondHalf;
    JButton total;
    ArrayList<Person> poor, rich;
    
    //constructor
    public AccountPanel() {
        //first panel
        input = new JPanel();
        introField = new JLabel("Type a name of a person");
        field = new JTextField(20);
        field.addActionListener(new FieldListener());
        
        input.add(introField);
        input.add(field);
        
        //second panel
        total = new JButton("Total");
        firstHalf = new JLabel("");
        secondHalf = new JLabel("");
        
        total.addActionListener(new ButtonListener());
        
        //add input panel and other things on main panel
        add(input);
        add(total);
        add(firstHalf);
        add(secondHalf);
        
        //ArrayList with people
        poor = new ArrayList<>();
        rich = new ArrayList<>();
        
    }
    
    private class FieldListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            Person person = new Person(field.getText());
            if (person.getMoney() <= 500000) {
                poor.add(person);
            } else {
                rich.add(person);
            }
            field.setText("");
        }
    }
    
    private class ButtonListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            double sumPoor = 0, sumRich = 0;
            
            for (int i = 0; i < poor.size(); i++) {
                sumPoor += poor.get(i).getMoney();
            }
            
            for (int i = 0; i < rich.size(); i++) {
                sumRich += rich.get(i).getMoney();
            }
            
            NumberFormat fmt = NumberFormat.getCurrencyInstance();
            firstHalf.setText("Sum money of those who have less than $500'000: " + fmt.format(sumPoor));
            secondHalf.setText("Sum money of those who have more than $500'000: " + fmt.format(sumRich));
            
            System.out.println("People that have less than $500'000:");
            for (int i = 0; i < poor.size(); i++) {
                System.out.println(poor.get(i));
            }
            System.out.println("People that have more than $500'000:");
            for (int i = 0; i < rich.size(); i++) {
                System.out.println(rich.get(i));
            }
        }
    }
}
