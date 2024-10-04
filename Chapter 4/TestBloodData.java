import java.util.Scanner;

public class TestBloodData {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BloodData patient1 = new BloodData();

        System.out.print("         Enter Blood Type: ");
        String bloodType = scanner.nextLine().toUpperCase();

        if (!isValidBloodType(bloodType)) {
            System.out.println("Invalid blood type. Please enter A, B, AB, or O.");
            return;
        }

        System.out.print("         Enter Rh Factor: ");
        String rhFactor = scanner.nextLine().toUpperCase();

        if (!isValidRhFactor(rhFactor)) {
            System.out.println("Invalid Rh factor. Please enter + or -.");
            return;
        }

        patient1.setBloodType(bloodType);
        
        patient1.setRhFactor(rhFactor);

        patient1.displayBloodInfo();
    }

    private static boolean isValidBloodType(String bloodType) {
        return "A".equals(bloodType) || "B".equals(bloodType) || "AB".equals(bloodType) || "O".equals(bloodType);
    }

    private static boolean isValidRhFactor(String rhFactor) {
        return "+".equals(rhFactor) || "-".equals(rhFactor);
    }
}