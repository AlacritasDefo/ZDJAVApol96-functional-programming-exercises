package exercise;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("ksiazka1", 29.99, 2018,1);
        Book book2 = new Book("ksiazka2", 39.99, 1999,2);
        Book book3 = new Book("ksiazka3", 49.99, 2008,3);

        BookService listaKsiazek = new BookService();

        listaKsiazek.addBook(book3);
        listaKsiazek.addBook(book2);
        listaKsiazek.addBook(book1);

        System.out.println(listaKsiazek.getAll());

        listaKsiazek.removeBook(2);

        System.out.println(listaKsiazek.getAll());

        listaKsiazek.addBook(book2);
        List<Book> filtered = listaKsiazek.getFiltered(book -> book.getYearOfPublish() > 2007);
        System.out.println(filtered);

        Optional<Book> byID = listaKsiazek.getByID(2);
        System.out.println(byID);




    }
}
