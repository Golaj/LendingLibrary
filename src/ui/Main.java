package ui;

import models.Book;
import models.BookCatalog;
import models.BookNotFoundException;
import models.Customer;
import models.DVD;
import models.Loan;
import models.LoanAlreadyExistsException;
import models.LoanRegistry;
import utilities.GenderType;
// kan importera allt från ett packages med import models.*;

public class Main {

    public static void main(String[] args) {

        BookCatalog bookCatalog = new BookCatalog();

        Book book1 = new Book(1, "An intro to Java", "Matt Greencroft", "12345", "Anytown Branch", 400);
        Book book2 = new Book(2, "Better Java", "Joe Le Blanc", "23456", "Anytown Branch", 150);
        DVD dvd1 = new DVD(3, "An Epic Film About Java", "Anytown Branch", "Steven Speilberg", "99887", 150);
        DVD dvd2 = new DVD(3, "An Epic Film About Java", "Anytown Branch", "Steven Speilberg", "99887", 150);

        System.out.println(dvd1.getTitle());
        book1.relocate("My City Branch");

        bookCatalog.addBook(book1);
        bookCatalog.addBook(book2);

        UI ui = new UI();
        ui.printHeader();
        ui.printBookCatalog(bookCatalog.getBookArray());

        Customer customer = new Customer("Mr", "Michael", "Smith", "The High Street", "1234", "Michale@Smitsh.com", GenderType.MALE);

        Loan loan1 = new Loan(1, customer, book1);
        Loan loan2 = new Loan(2, customer, book2);
        Loan loan3 = new Loan(3, customer, book1);
        Loan loan4 = new Loan(4, customer, book1);

        LoanRegistry loanRegistry = new LoanRegistry();

        try {
            loanRegistry.addLoan(loan1);
        } catch (LoanAlreadyExistsException e) {
            System.out.println("Loan alredy exist");
        }
        loan1.getDueDate();
        System.out.println(loan1);
        try {
            loanRegistry.addLoan(loan2);
        } catch (LoanAlreadyExistsException e) {
            System.out.println("Loan alredy exist");
        }
        try {
            loanRegistry.addLoan(loan3);
        } catch (LoanAlreadyExistsException e) {
            System.out.println("Loan alredy exist");
        }
        try {
            loanRegistry.addLoan(loan4);
        } catch (LoanAlreadyExistsException e) {
            System.out.println("Loan alredy exist");
        }
        loan1.endLoan();
        try {
            loanRegistry.addLoan(loan1);
        } catch (LoanAlreadyExistsException e) {
            System.out.println("Loan alredy exist");
        }
        loan3.endLoan();
        System.out.println(loanRegistry.isBookOnLoan(book1.getID()));
        loan4.endLoan();
        System.out.println(loanRegistry.isBookOnLoan(book1.getID()));
        

    }

}
