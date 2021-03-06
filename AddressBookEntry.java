package demo;

import java.util.LinkedList;
import java.util.Scanner;

public class AddressBookEntry {
    private String fname;
    private String lname;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private int mobile;
    private String email;

    public AddressBookEntry(){

    }
    public AddressBookEntry(String fname, String lname, String address, String city, String state, int zipCode, int mobile,String email) {
        this.fname = fname;
        this.lname = lname;
        this.address= address;
        this.city = city;
        this.state = state;
        this.zipCode =zipCode;
        this.mobile= mobile;
        this.email =email;
        }
public String getFname() {
        return fname;
    }
public void setFname(String fname) {

        this.fname = fname;
}
public String getLname() {

        return lname;
}
public void setLname(String lname){

        this.lname=lname;
}
public String getAddress(){
        return address;
}
public void setAddress(String address){
        this.address=address;
}
public String getCity(){
        return city;
}
public void setCity(String city){
        this.city= city;
}
public String getState(){
        return state;
}
public void setState(String state){
        this.state= state;
}
public int getZipCode(){
        return zipCode;
}
public void setZipCode(int zipCode){
        this.zipCode=zipCode;
}
public int getMobile(){
        return mobile;
}
public void setMobile(int mobile){

        this.mobile=mobile;
}
public String getEmail(){
        return email;
}
public void setEmail(String email){

        this.email=email;
}

public String toString() {
        return "First Name: " + fname + ",\n Last Name: " + lname + ",Address: " + address + ", City: " + city + ", State: " + state + ",Zipcode: " + zipCode + ", Mobile: " + mobile + ",Email: " + email;
}
    }



