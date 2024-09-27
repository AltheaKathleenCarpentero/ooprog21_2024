public class Billing {
    public static double TAX = 0.08;

    public static void main(String[] args) {
        computeBill(23.2);
        computeBill(24.4, 2);
        computeBill(40.4, 2, 10);
    }

    static void computeBill(double price) {
        double total = price * (1 + TAX);
        System.out.println("The total price for the bill is: $" + total);
    }

    static void computeBill(double price, int quantity) {
        double total1 = price * quantity;
        double total = total1 * (1 + TAX);
        System.out.println("The total price for the bill is: $" + total);
    }

    static void computeBill(double price, int quantity, int couponDiscount) {
        double total1 = price * quantity;
        double total = (total1 - couponDiscount) * (1 + TAX);
        System.out.println("The total price for the bill is: $" + total);
    }
}