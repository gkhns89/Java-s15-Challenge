package com.angel.library.model;

import com.angel.library.enums.BookCategories;

import java.util.Objects;

public class Book {
    private int id;
    private String name;
    private String author;
    private BookCategories categories;
    private double price;
    private boolean status;

    public Book(int id, String name, String author, BookCategories categories, double price, boolean status) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.categories = categories;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookCategories getCategories() {
        return categories;
    }

    public void setCategories(BookCategories categories) {
        this.categories = categories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", categories=" + categories +
                ", price=" + price +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return getId() == book.getId() && Double.compare(getPrice(), book.getPrice()) == 0 && isStatus() == book.isStatus() && Objects.equals(getName(), book.getName()) && Objects.equals(getAuthor(), book.getAuthor()) && getCategories() == book.getCategories();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAuthor(), getCategories(), getPrice(), isStatus());
    }
}
