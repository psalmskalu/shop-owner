/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopowner;
import java.util.Scanner;

/**
 *
 * @author User
 */

import java.util.Date;

public class Sales {
    protected String productID;
    protected String salesID;
    protected String customerID;
    protected double amount; 
    protected Date date;

public void setproductname(String product){
    this.productID = product;
}
public void setsalesname(String sales){
    this.salesID = sales;
}
public void setcustomername(String customer){
    this.customerID = customer;
}
public void setamountname(double amount){
    this.amount = amount;
}
public String getsetproductname(){
    return this. productID;
}
public String getsalesname(){
    return this.salesID;
}
public String setcustomername(){
    return this.customerID;
}
public double setamountname(){
    return this.amount;
}
}