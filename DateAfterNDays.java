import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAfterNDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input date
        System.out.print("Enter the date (YYYY-MM-DD): ");
        String dateString = scanner.nextLine();

        // Parse input date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateString, formatter);

        // Input number of days
        System.out.print("Enter the number of days to add: ");
        int n = scanner.nextInt();

        // Calculate and print date after n days
        LocalDate newDate = date.plusDays(n);
        System.out.println("The date after " + n + " days from " + date + " is " + newDate);
        scanner.close();
    }
}
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAfterNDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input date
        System.out.print("Enter the date (YYYY-MM-DD): ");
        String dateString = scanner.nextLine();

        // Parse input date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateString, formatter);

        // Input number of days
        System.out.print("Enter the number of days to add: ");
        int n = scanner.nextInt();

        // Calculate and print date after n days
        LocalDate newDate = date.plusDays(n);
        System.out.println("The date after " + n + " days from " + date + " is " + newDate);
        scanner.close();
    }
}


