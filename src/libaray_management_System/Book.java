package libaray_management_System;

import java.io.Serializable;

public class Book implements Serializable {


      private  int id ;
      private String title ;
      private String author ;
      private boolean issued ;
      public Book(int id , String title , String author ) {
          this.id = id  ;
          this.title = title ;
          this.author = author ;
          this.issued = false ;
      }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }
     public void display () {
         System.out.println( " I.D" + id + ", Title" + title + " ,author" + author + " , Issued: " + (issued ? "YES" : "NO"));
     }
}
