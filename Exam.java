import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product #1 name: ");
        String productName1 = scanner.nextLine();
        System.out.print("Product #1 price: ");
        double productPrice1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Product #2 name: ");
        String productName2 = scanner.nextLine();
        System.out.print("Product #2 price: ");
        double productPrice2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Product #3 name: ");
        String productName3 = scanner.nextLine();
        System.out.print("Product #3 price: ");
        double productPrice3 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Customer paid money: ");
        double customerPaid = scanner.nextDouble();

        double totalPrice = productPrice1 + productPrice2 + productPrice3;
        double vatPrice = totalPrice * 0.07;
        double netPrice = totalPrice + vatPrice;
        double change = customerPaid - netPrice;

        System.out.println("\n===== RECEIPT =====");
        System.out.println(productName1 + ": " + productPrice1 + " baht");
        System.out.println(productName2 + ": " + productPrice2 + " baht");
        System.out.println(productName3 + ": " + productPrice3 + " baht");
        System.out.println("Total price before tax: " + totalPrice + " baht");
        System.out.println("VAT (7%): " + vatPrice + " baht");
        System.out.println("Net price: " + netPrice + " baht");
        System.out.println("Total paid: " + customerPaid + " baht");
        System.out.println("Change: " + change + " baht");

    }
}
