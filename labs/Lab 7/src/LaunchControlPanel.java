
import java.awt.event.*;
import javax.swing.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qlonik
 */
public class LaunchControlPanel extends JPanel{
    private JButton arm1, arm2, arm3, launch;
    private JLabel label;
    private JPanel buttons;
    
    public LaunchControlPanel() {
        //creating elements
        arm1 = new JButton("ARM 1");
        arm2 = new JButton("ARM 2");
        arm3 = new JButton("ARM 3");
        launch = new JButton("LAUNCH");
        label = new JLabel("Launch Control System Idle");
        buttons = new JPanel();
        
        //disabling buttons
        arm2.setEnabled(false);
        arm3.setEnabled(false);
        launch.setEnabled(false);
        
        //adding elements to panel
        buttons.add(arm1);
        buttons.add(arm2);
        buttons.add(arm3);
        buttons.add(launch);
        add(buttons);
        add(label);
        
        //creating listeners
        ButtonListener listener = new ButtonListener();
        arm1.addActionListener(listener);
        arm2.addActionListener(listener);
        arm3.addActionListener(listener);
        launch.addActionListener(listener);
    }
    
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == arm1) {
                arm1.setEnabled(false);
                arm2.setEnabled(true);
                label.setText("Stage 1 ARM");
            } else if (event.getSource() == arm2) {
                arm2.setEnabled(false);
                arm3.setEnabled(true);
                label.setText("Stage 2 ARM");
            } else if (event.getSource() == arm3) {
                arm3.setEnabled(false);
                launch.setEnabled(true);
                label.setText("Stage 3 ARM");
            } else if (event.getSource() == launch) {
                launch.setEnabled(false);
                label.setText("LAUNCH");
            }
        }
    }
}
