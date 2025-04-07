package libaray_management_System;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class library {
    private ArrayList<Book> book = new ArrayList<>() ;
    private static final String fileName = "book_data.txt" ;
    Scanner sc = new Scanner(System.in) ;
    public library () {
        loadBooksFromFile() ;
    }
        // libaries me book ko add kiya
    public void addbook () {
        System.out.println("Enter the book I.D : ");
        int id = sc.nextInt() ;
        sc.nextLine() ; // buffer clear karta h
        System.out.println(" Enter the book title : ");
        String title = sc.nextLine() ;
        System.out.println("Enter the Author name : ");
        String author = sc.nextLine() ;
        book.add(new Book(id ,title , author)) ;
        saveBookToFile () ;
        System.out.println( "Book added Succesfully ");
    }
    // Available book ko check karna
    public void viewbook () {
        if ( book.isEmpty()) {
            System.out.println(" OOPS! Book you are searching for, curently not available");
            return;
        }
        for ( Book b : book ) {
            b.display();
        }
    }
    // Now Book issue karna h
    public void issuebook () {
        System.out.println(" Enter the book I.D to issue : " );
        int id = sc.nextInt() ;
        for ( Book b : book ) {
           if ( b.getId() == id && !b.isIssued() ) {
               b.setIssued(true);
               saveBookToFile () ;
               System.out.println(" Book is issued successfully!");
               return;
           }
           else {
               System.out.println( "Book not found or already issued");
               return ;
           }
        }

    }
    // book ko return karna
    public void returnbook () {
        System.out.println("Enter the book Id : ");
        int id = sc.nextInt() ;
        for ( Book b : book) {
            if ( b.getId() == id && b.isIssued()) {
                b.setIssued(false);
                saveBookToFile () ;
                System.out.println("Book returned Succesfully !");
                return ;
            }
            System.out.println("⚠\uFE0FInvalid Id");
        }
    }
    // book ko file me save karunga
    private void saveBookToFile() {
        try {
            FileOutputStream fos = new FileOutputStream(fileName) ;
            try {
                ObjectOutputStream oos = new ObjectOutputStream(fos) ;
                oos.writeObject(book);

            } catch (IOException e) {

                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            System.out.println("⚠️ Error saving books to file.");
            throw new RuntimeException(e);
        }
    }
    // file ko load karna ka h
    private void loadBooksFromFile() {
        File file = new File(fileName) ;
        if (!file.exists()) {
            return ;
        }
        try {
            FileInputStream fis = new FileInputStream(fileName) ;
            try {
                ObjectInputStream ois = new ObjectInputStream(fis) ;
                try {
                  book = (ArrayList<Book>) ois.readObject() ;
                } catch (ClassNotFoundException e) {
                    System.out.println("⚠️ Error loading books from file.");
                    throw new RuntimeException(e);
                }
            } catch (IOException e) {
                System.out.println("⚠️ Error loading books from file.");
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            System.out.println("⚠️ Error loading books from file.");
            throw new RuntimeException(e);
        }
    }

}
