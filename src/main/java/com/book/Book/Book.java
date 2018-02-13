package com.book.Book;
@Entity
public class Book {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    protected String title;
    @Column
    protected String author;
    @Column
    protected float price;
 
    public Book() {
    }
 
    public Book(Integer id) {
        this.id = id;
    }
 
    public Book(Integer id, String title, String author, float price) {
        this(title, author, price);
        this.id = id;
    }
     
    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
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
 
    public float getPrice() {
        return price;
    }
 
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "id: "+id+"title: "  +title+ "author: " +author+  "price: "+price;
    }
}