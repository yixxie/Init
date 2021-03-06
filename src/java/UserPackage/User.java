/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserPackage;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author yixxie
 */
@Entity
@Table
public class User implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    //private String userId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private int role;
    
    /**
    public void setUserId(String userId){
        this.userId=userId;
    }
    public String getUserId(){
        return userId;
    }*/
    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getUserName(){
        return userName;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setRole(int role){
        this.role=role;
    }
    public int getRole(){
        return role;
    }
    
           
    
}
