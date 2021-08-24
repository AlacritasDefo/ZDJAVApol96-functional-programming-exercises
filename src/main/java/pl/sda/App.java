package pl.sda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Comparator<User> comparator = (o1, o2) -> o1.getId() - o2.getId();


       User user1 = new User(1, "Damian", "Szczepaniak", "3663633636", 1993 );
       User user2 = new User(2, "Robert", "Lewandowski", "9484734849", 1985 );
       User user3 = new User(3, "Piotr", "Polak", "82828938483", 1970 );

        List<User> ListaPracownikow = new ArrayList<>();
        ListaPracownikow.add(user2);
        ListaPracownikow.add(user1);
        ListaPracownikow.add(user3);

        System.out.println(ListaPracownikow);

        ListaPracownikow.sort(comparator);

        System.out.println(ListaPracownikow);

        Comparator<User> comparator2 = Comparator.comparingInt(User::getRokurodzenia);

        ListaPracownikow.sort(comparator2);
        System.out.println(ListaPracownikow);
    }


}
