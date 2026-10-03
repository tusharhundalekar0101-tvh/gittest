import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age = ");
        int age = sc.nextInt();
        sc.nextLine();

        while (true) {
            if (age < 0) {
                System.out.println("Enter a valid age");
                age = sc.nextInt();
            } else {
                break;
            }
        }

        boolean validAge = age >= 18;
        String eligibility;

        if (validAge) {
                eligibility = "Eligible";
        }   else {
                eligibility = "Not Eligibile";
            }

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("\nName : " + name);
        System.out.println("Age : " + age);
        System.out.println("Eligibility : " + eligibility);
        

        sc.close();
    }
}
