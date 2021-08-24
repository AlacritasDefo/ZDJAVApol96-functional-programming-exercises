package Optional;

import pl.sda.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "Damian", "Szczepaniak", "3663633636", 1993 );
        User user2 = new User(2, "Robert", "Lewandowski", "9484734849", 1985 );
        User user3 = new User(3, "Piotr", "Polak", "82828938483", 1970 );

        List<User> ListaPracownikow = new ArrayList<>();
        ListaPracownikow.add(user2);
        ListaPracownikow.add(user1);
        ListaPracownikow.add(user3);

        System.out.println(findUser(ListaPracownikow,1));

        System.out.println(findUser(ListaPracownikow,5));

    }
    public static Optional<User> findUser (List<User>listOfUsers, int id){
        for(User user : listOfUsers ){
            if (user.getId() == id){
                return Optional.of(user);
            }
        }
        return  Optional.empty();
    }
}
