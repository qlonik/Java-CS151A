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
        
        Student st = new Student("John Don", "jdon@upei.ca", "7658544");
        gr1.setStudent(1, st);
        st = new Student("Donna Klark", "dklark@upei.ca", "7658492");
        gr1.setStudent(2, st);
        st.setName("Dillan Joe");
        st.setEmail("djoe@upei.ca");
        st.setPhone("1239875");
        gr1.setStudent(3, st);
        System.out.println("Group 1:\n" + gr1);
        
        Student st1 = new Student("Bob Kelso", "bkelso@upei.ca", "8765432");
        Student st2 = new Student("Alex Stone", "astone@upei.ca", "6574883");
        Student st3 = new Student("B.O.B", null, null);
        gr2.setStudent(1, st1);
        gr2.setStudent(2, st2);
        gr2.setStudent(3, st3);
        System.out.println("Group 2:\n" + gr2);
    }
}
