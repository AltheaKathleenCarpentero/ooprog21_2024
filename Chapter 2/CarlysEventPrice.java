import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************************");
        System.out.println("*    Carly's Catering       *");
        System.out.println("*     Where Taste Meets     *");
        System.out.println("*       Tradition           *");
        System.out.println("*****************************");

        System.out.print("\nEnter the number of guests: ");
        int numofGuests = scanner.nextInt();

        double pricePerGuest = 35.0;
        double totalPrice = numofGuests * pricePerGuest;

        System.out.println("Number of guests: " + numofGuests);
        System.out.println("Price per guest: $" + pricePerGuest);
        System.out.println("Total price: $" + totalPrice);

        boolean isLargeEvent = numofGuests >= 50;
        System.out.println("Is this a large event? \n" + isLargeEvent);
    }
}