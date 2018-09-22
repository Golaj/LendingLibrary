package models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;
import utilities.GenderType;

public class Customer {
    
    private String title;
    private String firstName;
    private String surname;
    private String adress;
    private String phoneNumber;
    private String email;
    private int customerNumber;
    private GenderType gender;
    private boolean isValid;
    private Date expiryDate;
    
    private int nID = 1;
    
    public Customer (String title, String firstName, String surname, String adress, 
            String phoneNumber, String email, GenderType gender){
        setName(title, firstName, surname);
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        isValid = true;
        customerNumber = nID;
        nID++;
        
        GregorianCalendar gCal = new GregorianCalendar();
        gCal.add(GregorianCalendar.YEAR, 1);
        expiryDate = gCal.getTime();
        
    }
    
    public String getMailingName(){
        StringBuilder sb = new StringBuilder(title);
        sb.append(" ");
        sb.append(firstName.substring(0,1));
        sb.append(" ");
        sb.append(surname);
        
        return sb.toString();
    }
        
    private void setName(String title, String firstName, String surname){
        this.title = title;
        this.firstName = firstName;
        this.surname = surname;
    }
 
    public String getFirstName() {
        return firstName;
    }


    public String getSurname() {
        return surname;
    }
    
    public GenderType getGender(){
        return gender;
    }
    
    public Date getExpiryDate(){
        return expiryDate;
    }
    
    @Override
    public String toString(){
        return getMailingName();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if (this.customerNumber != other.customerNumber) {
            return false;
        }
        if (this.isValid != other.isValid) {
            return false;
        }
        if (this.nID != other.nID) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        if (!Objects.equals(this.adress, other.adress)) {
            return false;
        }
        if (!Objects.equals(this.phoneNumber, other.phoneNumber)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (this.gender != other.gender) {
            return false;
        }
        if (!Objects.equals(this.expiryDate, other.expiryDate)) {
            return false;
        }
        return true;
    }
    
    

}
