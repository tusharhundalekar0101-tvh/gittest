import java.util.Scanner;

public class shoppingBillCalculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price = ");
        float price = sc.nextFloat();

        System.out.print("Enter the quantity = ");
        int quantity = sc.nextInt();

        float totalPrice = price*quantity;
        float finalPrice;
        finalPrice = (totalPrice >= 1000) ? totalPrice - 100 : totalPrice;

        System.out.println("Item price = " + price);
        System.out.println("Item quantity = " + quantity);
        System.out.println("Total price = " + totalPrice);
        System.out.println("Final price = " + finalPrice);
        System.out.println("Thank you for Shopping with us! :D");

        sc.close();
    }
}