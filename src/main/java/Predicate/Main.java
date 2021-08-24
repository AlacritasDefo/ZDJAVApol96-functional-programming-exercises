package Predicate;

import exercise.Book;
import pl.sda.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/*Stwórz predykat sprawdzający czy użytkownik urodził się po roku 2000 a następnie w pętli dla
kilku użytkowników wywołaj to sprawdzenie w klauzuli if. Jeśli użytkownik urodził się po roku 2000
to wyświetl jego dane w konsoli.*/
public class Main {
    public static void main(String[] args) {
        Predicate<User> after2000 = user -> user.getRokurodzenia()>2000;

        User user1 = new User(1, "Damian", "Szczepaniak", "3663633636", 2002 );
        User user2 = new User(2, "Robert", "Lewandowski", "9484734849", 1985 );
        User user3 = new User(3, "Piotr", "Polak", "82828938483", 2010 );

        List<User> listAfter2000 = new ArrayList<>();

        listAfter2000.add(user1);
        listAfter2000.add(user2);
        listAfter2000.add(user3);

        for (User user : listAfter2000){
            if (after2000.test(user)){
                System.out.println(user);
            }
        }
    }


}
