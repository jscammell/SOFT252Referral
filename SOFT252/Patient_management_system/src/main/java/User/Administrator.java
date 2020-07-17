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
public class Administrator extends Users{
    private String first_Name;
    
    public Administrator(String userId, String password, String first_Name) {
        this.userId = userId;
        this.password = password;
        this.first_Name = first_Name;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }
    
    
}