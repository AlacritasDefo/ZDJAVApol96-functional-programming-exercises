package Supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<LocalDateTime> actTime = LocalDateTime::now;
        System.out.println(actTime.get());

    }
}
