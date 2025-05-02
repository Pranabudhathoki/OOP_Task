import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        boolean isDuck = false;
        int temp = num;
        while (temp != 0) {
            if (temp % 10 == 0) {
                isDuck = true;
                break;
            }
            temp /= 10;
        }
        if (isDuck){
            System.out.println(num + " is a Duck number");
        }
        else {
            System.out.println(num +" is not a Duck number");
        }
        
        // System.out.println(num + (isDuck ? " is" : " is not") + " a Duck number");
        sc.close();
    }
}