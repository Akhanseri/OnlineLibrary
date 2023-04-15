package kz.ali.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Book {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotEmpty(message ="Tittle should not be empty")
    @Size(min = 2,max = 100,message = "Tittle should be from 2 to 100 letters")
    private String title;
    @NotEmpty(message ="Author should not be empty")
    @Size(min = 2,max = 100,message = "Author name should be from 2 to 100 letters")
    private String author;
    @Min(value = 1500,message = "Min year of book should be 1500")
    private int year;

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book(){}
}
