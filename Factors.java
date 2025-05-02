import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        
        if (num <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            System.out.print("Factors of " + num + " are: ");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        
        sc.close();
    }
}