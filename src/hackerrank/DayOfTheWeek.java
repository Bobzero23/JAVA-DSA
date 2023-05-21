package hackerrank;

import java.time.LocalDate;

public class DayOfTheWeek {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020, 9, 30);
        String myBirthDay = localDate.getDayOfWeek().name();
        System.out.println(myBirthDay);
    }
}
