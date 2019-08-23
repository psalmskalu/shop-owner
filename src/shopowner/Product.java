/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopowner;

import java.util.Date;

/**
 *
 * @author Ashpot
 */
public class Product {
    private String productID;
    private String productName;
    private String categoryID;
    private int quantity;
    private double amount;
    private  Date expiryDate;
    
    /**
     * set methods
     */
    
    public void setProductID(String productID){
        this.productID = productID;
    }
    
    public void setProductName(String productName){
        this.productName = productName;
    }
    
    public void setCategoryID(String categoryID){
        this.categoryID = categoryID;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public void setAmount(double amount){
        this.amount = amount;
    }
    
    public void setExpiryDate(Date expiryDate){
        this.expiryDate = expiryDate;
    }
    
    /**
     * get methods
     */
    
    public String getProductID(){
        return this.productID;
    }
    
    public String getProductName(){
        return this.productName;
    }
    
    public String getCategoryID(){
        return this.categoryID;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public double getAmount(){
        return this.amount;
    }
    
    public Date getExpiryDate(){
        return this.expiryDate;
    }
}
