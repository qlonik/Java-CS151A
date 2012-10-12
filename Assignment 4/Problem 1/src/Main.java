/**
 * Main.java    Author: Nikita Volodin (127196)
 * CS151A,      Assignment 4 - Problem #1
 * 
 * This class tests classes group.java and student.java
 */
public class Main {

    /**
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Group gr1 = new Group();
        Group gr2 = new Group();
        
        gr1.setStudentInfo(1, "John Don", "jdon@upei.ca", "7658544");
        gr1.setStudentInfo(2, "Donna Klark", "dklark@upei.ca", "7658492");
        gr1.setStudentInfo(3, "Dillan Joe", "djoe@upei.ca", "1239875");
        System.out.println("Group 1:\n" + gr1);
        
        gr2.setStudentInfo(1, "Bob Kelso", "bkelso@upei.ca", "8765432");
        gr2.setStudentInfo(2, "Alex Stone", "astone@upei.ca", "6574833");
        gr2.setStudentInfo(3, "B.O.B", null, null);
        System.out.println("Group 2:\n" + gr2);
    }
}
