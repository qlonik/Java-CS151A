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
     * Method reads number of student and returns its data
     * 
     * @param student Number of student: 1, 2 or 3
     * @return All data of that student
     */
    public String getStudentInfo(int student) {
        Student st = null;

        if (student == 1) {
            st = st1;
        } else if (student == 2) {
            st = st2;
        } else if (student == 3) {
            st = st3;
        }

        return st.toString();
    }

    /**
     * Method sets data for specified student
     * 
     * @param student Number of student: 1, 2 or 3
     * @param nameInput Name that should be set for student
     * @param emailInput Email that should be set for student
     * @param phoneInput Phone number that should be set for student
     */
    public void setStudentInfo(int student, String nameInput, String emailInput,
            String phoneInput) {
        Student st = new Student(nameInput, emailInput, phoneInput);

        if (student == 1) {
            st1 = st;
        } else if (student == 2) {
            st2 = st;
        } else if (student == 3) {
            st3 = st;
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
