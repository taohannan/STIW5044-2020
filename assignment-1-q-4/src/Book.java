import java.time.Instant;
import java.time.LocalDate;

public class Book {

    String title;
    String publisher;
    LocalDate datePublish;
    String author;

    public Book(String title, String publisher, LocalDate datePublish, String author) {
        this.title = title;
        this.publisher = publisher;
        this.datePublish = datePublish;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getDatePublish() {
        return datePublish;
    }

    public void setDatePublish(LocalDate datePublish) {
        this.datePublish = datePublish;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", datePublish=" + datePublish +
                ", author='" + author + '\'' +
                '}';
    }
}
