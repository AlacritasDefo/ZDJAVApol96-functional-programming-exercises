package Supplier;
/*
Stwórz obiekt Suppliera, który będzie zwracać aktualną datę z wykorzystaniem
LocalDateTime.now().
 */

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<LocalDateTime> actTime = LocalDateTime::now;
        System.out.println(actTime.get());
    }
}
