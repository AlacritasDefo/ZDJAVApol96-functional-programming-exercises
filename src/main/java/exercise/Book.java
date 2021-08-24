package exercise;

import java.util.Objects;

public class Book {
    private String title;
    private double price;
    private int yearOfPublish;
    private int id;

    public Book(String title, double price, int yearOfPublish, int id) {
        this.title = title;
        this.price = price;
        this.yearOfPublish = yearOfPublish;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && yearOfPublish == book.yearOfPublish && id == book.id && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, yearOfPublish, id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", yearOfPublish=" + yearOfPublish +
                ", id=" + id +
                '}';
    }
}

