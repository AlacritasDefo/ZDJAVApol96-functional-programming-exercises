package Consumer;

import pl.sda.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Consumer<User> daneUsera = user -> {
            System.out.println(user.toString());
        };

        User user1 = new User(1, "Damian", "Szczepaniak", "3663633636", 1993 );
        User user2 = new User(2, "Robert", "Lewandowski", "9484734849", 1985 );
        User user3 = new User(3, "Piotr", "Polak", "82828938483", 1970 );

        List<User> listOfUsers = new ArrayList<>();
        listOfUsers.add(user1);
        listOfUsers.add(user2);
        listOfUsers.add(user3);


        for (User user : listOfUsers) {
            daneUsera.accept(user);
        }
    }
}
