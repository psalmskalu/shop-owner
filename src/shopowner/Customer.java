package shopowner;
import java.util.Scanner;

public class Customer {
    private String customerID;
    private String firstname;
    private String surname;
    private String sex;
    private String address; 
    private String email;
    private String phone;
    
    /**
     * 
     * SETTER METHODS
     */
    public void setCustomerID(String customerID){
        this.customerID = customerID;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;    
    }  
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setAddress(String address){
        this.address = address;  
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    /**
     * 
     * GETTER METHODS 
     */
   public String getCustomerID(){
        return this.customerID;
    }
    public String getFirstname(){
        return this.firstname ;    
    }  
    public String getSurname(){
        return this.surname;
    }
    public String getSex(){
        return this.sex ;
    }
    public String getAddress(){
      return this.address;  
    }
    public String getEmail(){
       return  this.email;
    }
    public String getPhone(){
       return  this.phone;
    } 
    
    public static void main(String[] args){
        
    }
}
