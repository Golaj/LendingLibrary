package vpp_lendinglibrary;

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
    }
    
    public String getMailingName(){
        String mailingName = title + " " + firstName.substring(0, 1) + " " + surname;
        return mailingName;
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

}
