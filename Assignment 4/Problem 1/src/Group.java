/**
 * Group.java   Author: Nikita Volodin (127196)
 * CS151A,      Assignment 4 - Problem #1
 * 
 * This class represents group of three students, this class has getStudentInfo
 * setStudentInfo and toString methods
 */
public class Group {

    private Student st1, st2, st3;

    //constructor
    public Group() {
        st1 = null;
        st2 = null;
        st3 = null;
    }

    /**
     * Method reads number of student and returns object that represents student
     * 
     * @param student Number of student: 1, 2 or 3
     * @return Objacet that represent a student
     */
    public Student getStudent(int student) {
        Student st = null;

        if (student == 1) {
            st = st1;
        } else if (student == 2) {
            st = st2;
        } else if (student == 3) {
            st = st3;
        }

        return st;
    }

    /**
     * Method sets object student to specified student (st1, or st2, or st3)
     * 
     * @param student Number of student (1st, 2nd, or 3rd)
     * @param stInput Input object that represents Student
     */
    public void setStudent(int student, Student stInput) {
        if (student == 1) {
            st1 = stInput;
        } else if (student == 2) {
            st2 = stInput;
        } else if (student == 3) {
            st3 = stInput;
        }
    }
    
    /**
     * 
     * @return String representation of a Group.java class
     */
    public String toString() {
        return "Student 1: " + st1.toString() + "\nStudent 2: " + st2.toString() +
                "\nStudent 3: " + st3.toString();
    }
}
