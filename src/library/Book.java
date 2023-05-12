package library.management.system.pkg1;

import java.util.ArrayList;

public class Book implements Comparable<Object>{

    private String author;
    private String title;
    private String publisher;
    private String Code;
    private int quantity;
    public Book(String author, String title, String publisher, String Code) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.Code = Code;
    }

   
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    
   
    
    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        return ((Book) o).getCode().equals(this.Code);
    }

    @Override
    public int compareTo(Object t) {
       
      return ((Book)t).getTitle().compareTo(this.title);
    }

    @Override
    public String toString() {
        if(quantity==0)
            return Code+"\t"+title+"\t"+ author +"\t" + publisher+"\t"+"NOT AVAILABLE";
        else
            return Code+"\t"+title+"\t"+ author +"\t" + publisher+"\t"+quantity+" Book";
    }
    public String getBookInfo() {
        return "Title: " + title + " , Code: " + Code + " , Publisher: " + publisher ; 
    }

}
