import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookShelf {
    List<Book> listOfBook = new ArrayList<>();

    public BookShelf() {
        Book book1 = new Book("Book 1", "DBP", LocalDate.of(2013, Month.DECEMBER, 10),"joe");
        Book book2 = new Book("Book 2", "DBP", LocalDate.of(2013, Month.DECEMBER, 11),"joe");

        listOfBook.add(book1);
        listOfBook.add(book2);
    }

    public List<Book> getListOfBook() {
        return listOfBook;
    }

    public void setListOfBook(List<Book> listOfBook) {
        this.listOfBook = listOfBook;
    }

    @Override
    public String toString() {
        String s = listOfBook.stream().map(Object::toString).collect(Collectors.joining(",\n "));
        return "BookShelf{\n" +
                "listOfBook= [\n" + s+
                "]\n}";
    }
}
