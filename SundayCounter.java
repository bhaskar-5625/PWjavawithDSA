import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class SundayCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start date (yyyy-MM-dd): ");
        String startDateStr = scanner.next();
        LocalDate startDate = LocalDate.parse(startDateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.println("Enter end date (yyyy-MM-dd): ");
        String endDateStr = scanner.next();
        LocalDate endDate = LocalDate.parse(endDateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        long numOfSundays = calculateSundays(startDate, endDate);
        System.out.println("Number of Sundays between " + startDate + " and " + endDate + ": " + numOfSundays);

        scanner.close();
    }

    public static long calculateSundays(LocalDate startDate, LocalDate endDate) {
        long numOfDays = ChronoUnit.DAYS.between(startDate, endDate);
        long numOfSundays = 0;

        for (int i = 0; i < numOfDays; i++) {
            if (startDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
                numOfSundays++;
            }
            startDate = startDate.plusDays(1);
        }

        return numOfSundays;
    }
}
