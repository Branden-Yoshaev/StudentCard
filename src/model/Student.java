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
     * @param listOfFavActivities - example Dancing, running, golfing
     */

    public Student(String firstName, String lastName, String listOfFavActivities, int studentNum)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setValidlistOfFavActivities(listOfFavActivities);
        setStudentNum(studentNum);
        setImage(image);
    }

    /**
     * Set methods for first and last name
     * and validates the first name
     * @param firstName
     */

    private void setFirstName(String firstName) {
        if (firstName.length() >= 2)
            this.firstName = firstName;
        else
                throw new IllegalArgumentException(firstName + " is not a valid first name, must have at least 2 letters" );
    }

    private void setLastName(String lastName) {
        if (lastName.length() >= 2)
            this.lastName = lastName;
        else
            throw new IllegalArgumentException(lastName + " is not a valid last name, must have at least 2 letters" );
    }


    /**
     * Returning valid lst for favourite activities
     * @return
     */
    private static List<String> getValidlistOfFavActivities() {

        return Arrays.asList("Dancing", "Running", "Golfing");
    }

        private void setStudentNum(int studentNum) {
        if (studentNum >= 1000000 && studentNum <= 9999999)
            this.studentNum = studentNum;
        else
            throw new IllegalArgumentException(studentNum + "this student number is not valid, must be in the range of 1000000 -> 9999999");
    }
}
