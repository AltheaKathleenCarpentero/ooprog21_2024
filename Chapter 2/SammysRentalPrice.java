
import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println(" S                                                        S");
        System.out.println(" S             Sammy's Seashore Supplies                  S");
        System.out.println(" S                                                        S");
        System.out.println(" SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        System.out.print("\n Enter the rental time in minutes: ");
        int rentalmin = scanner.nextInt();

        int hours = rentalmin / 60;
        int rental = rentalmin % 60;
        double rentalcost = (hours * 40) + (rentalmin * 1);

        System.out.println(" Hours rented: " + hours);
        System.out.println(" Minutes rented: " + rentalmin);
        System.out.println(" Total rental cost: $" + rentalcost);
    }
}