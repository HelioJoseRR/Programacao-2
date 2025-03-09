import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int roomNumber = readRoomNumber(scanner);
        Date checkin = readDate(scanner, "Check-in date (dd/MM/yyyy): ");
        Date checkout = readDate(scanner, "Check-out date (dd/MM/yyyy): ");

        while (checkout.before(checkin) || checkout.equals(checkin)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
            checkout = readDate(scanner, "Check-out date (dd/MM/yyyy): ");
        }

        Reservation reservation = new Reservation(roomNumber, checkin, checkout);

        System.out.println(reservation);

        System.out.println("\nEnter data to update the reservation:");
        boolean updated = false;
        while (!updated) {
            try {
                Date newCheckin = readDate(scanner, "Check-in date (dd/MM/yyyy): ");
                Date newCheckout = readDate(scanner, "Check-out date (dd/MM/yyyy): ");
                reservation.updateDates(newCheckin, newCheckout);
                updated = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(reservation);

        scanner.close();
    }

    private static int readRoomNumber(Scanner scanner) {
        System.out.print("Room number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error, Not an Integer.");
            scanner.next();
            System.out.print("Check-out date ");
        }
        return scanner.nextInt();
    }

    private static Date readDate(Scanner scanner, String prompt) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        Date date = null;
        while (date == null) {
            System.out.print(prompt);
            String input = scanner.next();
            try {
                date = sdf.parse(input);
            } catch (ParseException e) {
                System.out.println("Only dd/MM/yyyy dates");
            }
        }
        return date;
    }
}