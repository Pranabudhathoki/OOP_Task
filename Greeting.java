import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

        
        System.out.println("Hello, " + fullName + "! Welcome!");

        sc.close();
    }
}

