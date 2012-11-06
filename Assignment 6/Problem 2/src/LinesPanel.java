
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.JPanel;

/**
 * LinesPanel.java       Author: Nikita Volodin (127196)
 * CS151A,          Assignment 6 - Problem #2
 * 
 * This class is an extention of JPanel class. It reads input file and draw lines
 * that are specified in the input file
 */
public class LinesPanel extends JPanel{
    
    private ArrayList<Integer[]> linesArrayList = new ArrayList<Integer[]>();

    //constructor
    /**
     * Constructor creates ArrayList of Integer[7]. Each element from ArrayList
     * is a line from file
     * @throws Exception If file not found throws exception
     */
    public LinesPanel() throws Exception {
        //reads file
        Scanner file = new Scanner(new File("input.txt"));
        
        while (file.hasNext()) {
            //reads line from a file
            Scanner line = new Scanner(file.nextLine());
            
            //new array where we store elements of a string
            Integer[] arr = new Integer[7];
            while (line.hasNext()) {
                for (int i = 0; i < 7; i++) {
                    arr[i] = line.nextInt();
                }
            }
            linesArrayList.add(arr);
        }
        
        file.close();
    }
    
    /**
     * Draws lines from file. Acts as paint method in JApplet
     * @param page Inputed by system. Place where method draws
     */
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        
        for (int i = 0; i < linesArrayList.size(); i++) {
            page.setColor(new Color(linesArrayList.get(i)[4], linesArrayList.get(i)[5], linesArrayList.get(i)[6]));
            page.drawLine(linesArrayList.get(i)[0], linesArrayList.get(i)[1],
                    linesArrayList.get(i)[2], linesArrayList.get(i)[3]);
        }
    }
}
