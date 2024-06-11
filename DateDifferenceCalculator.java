// import java.time.LocalDate;
// import java.time.Period;
// import java.time.format.DateTimeFormatter;
// import java.util.Scanner;

// public class DateDifferenceCalculator {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input first date
//         System.out.print("Enter the first date (YYYY-MM-DD): ");
//         String firstDateString = scanner.nextLine();
//         LocalDate firstDate = LocalDate.parse(firstDateString);

//         // Input second date
//         System.out.print("Enter the second date (YYYY-MM-DD): ");
//         String secondDateString = scanner.nextLine();
//         LocalDate secondDate = LocalDate.parse(secondDateString);

//         // Calculate difference
//         Period period = Period.between(firstDate, secondDate);
//         int days = period.getDays();
//         int months = period.getMonths();
//         int years = period.getYears();

//         // Print difference
//         System.out.println("Difference: " + years + " years, " + months + " months, " + days + " days");

//         scanner.close();
//     }
// }


//For dd-mm-yyyy pattern
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateDifferenceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first date
        System.out.print("Enter the first date (dd-MM-yyyy): ");
        String firstDateString = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        // Input second date
        System.out.print("Enter the second date (dd-MM-yyyy): ");
        String secondDateString = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        // Calculate difference
        Period period = Period.between(firstDate, secondDate);
        int days = period.getDays();
        int months = period.getMonths();
        int years = period.getYears();

        // Print difference
        System.out.println("Difference: " + years + " years, " + months + " months, " + days + " days");

        scanner.close();
    }
}
