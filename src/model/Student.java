package model;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Student {

    //Private variables for Student class
    private String firstName;
    private String lastName;
    private int studentNum;
    private String listOfFavActivities;
    private Image image;

    /**
     * @param firstName - example Branden
     * @param lastName - example Yoshaev
     * @param studentNum - example 1137913
     * @param listOfFavActivities - example Dancing, running, golfing, Skydiving, Surfing, Traveling
     */

    public Student(String firstName, String lastName, String listOfFavActivities, int studentNum)
    {
        setFirstName(firstName);
        setLastName(lastName);
//        setlistOfFavActivities(listOfFavActivities);
        setStudentNum(studentNum);
        setImage(image);
    }



    /**
     * Set methods for first name
     * and validates the first name and makes first letter of the name to be capital as well as throws an exception if it doesn't have at least 2 characters
     * @param firstName
     */

    private void setFirstName(String firstName) {
        if (firstName.length() >= 2)
            if (Character.isUpperCase(firstName.charAt(0)))
                 this.firstName = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1);
        else
                throw new IllegalArgumentException(firstName + " is not a valid first name, must have at least 2 letters" );
    }

    /**
     *
     * @return firstname
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set methods for last name
     * and validates the last name, first letter of the lastname is a capital as well it throws an exception if doesn't have least 2 characters
     * @param lastName
     */
    private void setLastName(String lastName) {
        if (lastName.length() >= 2)
            if (Character.isUpperCase(lastName.charAt(0)))
                this.lastName = Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1);
        else
            throw new IllegalArgumentException(lastName + " is not a valid last name, must have at least 2 letters" );
    }

    /**
     *
     * @return lastname
     */
    public String getLastName() {
        return lastName;
    }

//    private void setListOfFavActivities(String listOfFavActivities) {
//
//    }

    /**
     * Returning valid list for favourite activities
     * @return
     */
    public static List<String> getListOfFavActivities() {

        return Arrays.asList("Dancing", "Running", "Golfing", "Skydiving", "Surfing", "Traveling");
    }

    /**
     * Make sure the number is between 1000000 and 9999999 if not throws an exception argument
     * @param studentNum
     */
        private void setStudentNum(int studentNum) {
        if (studentNum >= 1000000 && studentNum <= 9999999)
            this.studentNum = studentNum;
        else
            throw new IllegalArgumentException(studentNum + "this student number is not valid, must be in the range of 1000000 -> 9999999");
    }

    public int getStudentNum() {
        return studentNum;
    }

    private void setImage(Image image) {
        String filePath = String.format("image/Branden Picture.png");
        this.image = new Image(filePath);
    }

    public Image getImage() {
        return image;
    }
}