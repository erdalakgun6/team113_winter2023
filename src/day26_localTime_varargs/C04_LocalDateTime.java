package day26_localTime_varargs;

import java.time.LocalDateTime;

public class C04_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt= LocalDateTime.now();
        System.out.println(ldt ); // 2023-03-12T15:27:10.665670100

        System.out.println(ldt.toLocalDate()); // 2023-03-12
        System.out.println(ldt.toLocalTime()); // 15:29:16.669584500

    }
}
