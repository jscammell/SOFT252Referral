/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author Josh
 */
public class Doctor extends Users{
    private String first_Name;
    private String last_Name;
    private int ratingsLength;
    private int[] ratings = new int[ratingsLength];
    private String[] description = new String[ratingsLength];
    
    public Doctor (String userId, String password, String first_Name, String last_Name, int ratingsLength, int[] ratings, String[] description) {
        this.userId = userId;
        this.password = password;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.ratingsLength = ratingsLength;
        this.ratings = ratings;
        this.description = description;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public int getRatingsLength() {
        return ratingsLength;
    }

    public void setRatingsLength(int ratingsLength) {
        this.ratingsLength = ratingsLength;
    }

    public int[] getRatings() {
        return ratings;
    }

    public void setRatings(int[] ratings) {
        this.ratings = ratings;
    }

    public String[] getDescription() {
        return description;
    }

    public void setDescription(String[] description) {
        this.description = description;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
