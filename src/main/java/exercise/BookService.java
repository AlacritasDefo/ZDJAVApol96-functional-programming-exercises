package exercise;

import java.util.ArrayList;
import java.util.List;

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
}
