package Function;

import pl.sda.Person;
import pl.sda.User;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Damian", "Szczepaniak", "3663633636", 1993 );

        Function<User, Person> userToPerson = user -> new Person(user.getImie(), user.getNazwisko(),user.getPesel(),user.getRokurodzenia());

        System.out.println(userToPerson.apply(user1));


    }
}
