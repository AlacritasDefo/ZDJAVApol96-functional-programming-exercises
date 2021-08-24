package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BookService {
    private List<Book> listOfBooks = new ArrayList<>();

    public void addBook(Book book){
        listOfBooks.add(book);
    }
    public void removeBook(int id){
        Book tmp = null;
        for (Book book : listOfBooks){
            if (book.getId() == id){
                tmp = book;
                break;
            }
        }listOfBooks.remove(tmp);
    }

    public List<Book> getAll() {
        return listOfBooks;
    }

    public List<Book> getFiltered(Predicate<Book> predicate) {
        List<Book> tmp = new ArrayList<>();
        for (Book book : listOfBooks) {
            if (predicate.test(book)) {
                tmp.add(book);
            }
        }
        return tmp;
    }
}
