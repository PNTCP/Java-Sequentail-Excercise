import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product 1 name: ");
        String productName1 = scanner.nextLine();
        System.out.print("Enter Product 1 price: ");
        double productPrice1 = scanner.nextDouble();
        System.out.print("Enter Product 1 quantity: ");
        double productQuantity1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter product 2 name: ");
        String productName2 = scanner.nextLine();
        System.out.print("Enter product 2 price: ");
        double productPrice2 = scanner.nextDouble();
        System.out.print("Enter Product 2 quantity: ");
        double productQuantity2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter product 3 name: ");
        String productName3 = scanner.nextLine();
        System.out.print("Enter product 3 price: ");
        double productPrice3 = scanner.nextDouble();
        System.out.print("Enter Product 3 quantity: ");
        double productQuantity3 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter amount paid: ");
        double customerPaid = scanner.nextDouble();

        double productTotal1 = productPrice1 * productQuantity1;
        double productTotal2 = productPrice2 * productQuantity2;
        double productTotal3 = productPrice3 * productQuantity3;
        double totalPrice = productTotal1 + productTotal2 + productTotal3;
        double vatPrice = totalPrice * 0.07;
        double netPrice = totalPrice + vatPrice;
        double change = customerPaid - netPrice;

        System.out.println("\n===== RECEIPT =====");
        System.out.println(productName1 + " : " + productPrice1 + " x " + productQuantity1 + " = " + productTotal1 + " baht");
        System.out.println(productName2 + " : " + productPrice2 + " x " + productQuantity2 + " = " + productTotal2 + " baht");
        System.out.println(productName3 + " : " + productPrice3 + " x " + productQuantity3 + " = " + productTotal3 + " baht");
        System.out.println("Total price before tax: " + totalPrice + " baht");
        System.out.println("VAT (7%): " + vatPrice + " baht");
        System.out.println("Total including VAT: " + netPrice + " baht");
        System.out.println("Amount paid: " + customerPaid + " baht");
        System.out.println("Change: " + change + " baht");

        scanner.close();
    }
}
