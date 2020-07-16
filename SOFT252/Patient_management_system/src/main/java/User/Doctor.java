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
    
}
