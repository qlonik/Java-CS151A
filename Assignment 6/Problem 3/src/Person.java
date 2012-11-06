
import java.text.NumberFormat;
import java.util.Random;


/**
 * Person.java      Author: Nikita Volodin (127196)
 * CS151A,          Assignment 6 - Problem #3
 * 
 * Class represents a person with name and money
 */
public class Person {
    private String name;
    private double money;
    
    public Person (String inputName) {
        name = inputName;
        money = genMoney();
    }
    
    private double genMoney() {
        Random rnd = new Random();
        return (rnd.nextDouble() * 999999 + 1);
    }
    
    public String getName() {
        return name;
    }
    
    public double getMoney() {
        return money;
    }
    
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return getName() + "\t" + fmt.format(getMoney());
    }
}
