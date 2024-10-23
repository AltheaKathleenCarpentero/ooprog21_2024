import java.util.Scanner;

public class SortingThreeNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();

    System.out.print("Enter second number: ");
    int num2 = scanner.nextInt();

    System.out.print("Enter third number: ");
    int num3 = scanner.nextInt();

    if (num2 < num1) {
      int temp = num1;
      num1 = num2;
      num2 = temp;
    }
    if (num3 < num1) {
      int temp = num1;
      num1 = num3;
      num3 = temp;
    }
    if (num3 < num2) {
      int temp = num2;
      num2 = num3;
      num3 = temp;
    }

    System.out.println("Numbers in ascending order: " + num1 + " " + num2 + " " + num3);

    System.out.println("Numbers in descending order: " + num3 + " " + num2 + " " + num1);
  }
}
