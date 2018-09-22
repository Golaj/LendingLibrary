package models;

import java.util.Date;
import java.util.GregorianCalendar;
import utilities.LoanStatus;

public class Loan {
    
    private int id;
    private Customer customer;
    private Book book;
    private Date startDate;
    private Date dueDate;
    private Date returnDate;
    private LoanStatus status;

    public Loan(int id, Customer customer, Book book) {
        this.id = id;
        this.customer = customer;
        this.book = book;
        
        GregorianCalendar gCal = new GregorianCalendar();
        this.startDate = gCal.getTime();
        gCal.add(GregorianCalendar.DAY_OF_MONTH, 14);
        this.dueDate = gCal.getTime();
        this.status = LoanStatus.CURRENT;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Book getBook() {
        return book;
    }

    public void getDueDate() {
        System.out.println("Loan " + id + "'s due date is: " + dueDate);
    }

    public int getId() {
        return id;
    }
    
    public void endLoan(){
        returnDate = new Date();
        System.out.println("Loan " + id + " of the book " + book + " has been returned on following date: " + returnDate);
        status = LoanStatus.HISTORIC;
    }

    @Override
    public String toString() {
        return "Loan ID: " + id + " Customer: " + customer.getMailingName() + " Book on loan: " + book.getTitle();
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
        final Loan other = (Loan) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
   

}
