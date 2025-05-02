import java.util.Scanner;

public class PalindromePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();
        

        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        
        int org = num;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        boolean isPalindrome = (org == rev);

        
        if (isPrime && isPalindrome) {
            System.out.println(org + " is a palindrome prime.");
        } else {
            System.out.println(org + " is not a palindrome prime.");
        }

        sc.close();
    }
}