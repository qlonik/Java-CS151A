/**
 * Student.java     Author: Nikita Volodin (127196)
 * CS151A,          Assignment 4 - Problem #1
 * 
 * This class represents student, it has set methods and get methods for all fields
 * and toString method that returns string representation of class
 */
public class Student {
    private String name, email, phone;
    
    //empty constructor
    public Student() {
        name = "";
        email = "";
        phone = "";
    }
    
    /**
     * Constructor that specifies name, email and phone of student
     * @param nameInput Name of a student
     * @param emailInput Email of a student
     * @param phoneInput Phone of a student
     */
    public Student(String nameInput, String emailInput, String phoneInput) {
        name = nameInput;
        email = emailInput;
        phone = phoneInput;
    }
    
    /**
     * Getter for name
     * @return Name of a student
     */
    public String getName() {
        return name;
    }
    
    /**
     * Getter for email
     * @return Email of a student
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Getter for phone
     * @return Phone of a student
     */
    public String getPhone() {
        return phone;
    }
    
    /**
     * Setter for name
     * @param nameInput Name of a student to set
     */
    public void setName(String nameInput) {
        name = nameInput;
    }
    
    /**
     * Setter for email
     * @param emailInput Email of a student to set
     */
    public void setEmail(String emailInput) {
        email = emailInput;
    }
    
    /**
     * Setter for phone number
     * @param phoneInput Phone number of a student to set
     */
    public void setPhone(String phoneInput) {
        phone = phoneInput;
    }
    
    /**
     * 
     * @return String representation of a Student.java class
     */
    public String toString() {
        return "Name: " + name + "\tEmail: " + email + "\tPhone: " + phone;
    }
}