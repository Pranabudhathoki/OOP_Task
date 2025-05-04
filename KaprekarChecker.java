import java.util.Scanner;

public class KaprekarChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        long square = (long)num * num;
        String sqStr = Long.toString(square);
        boolean isKaprekar = false;
        
        for (int i = 1; i < sqStr.length(); i++) {
            int part1 = Integer.parseInt(sqStr.substring(0, i));
            int part2 = Integer.parseInt(sqStr.substring(i));
            if (part1 + part2 == num && part2 != 0) {
                isKaprekar = true;
                break;
            }
        }
        
        System.out.println(num + (isKaprekar ? " is" : " is not") + " a Kaprekar number");
        sc.close();
    }
}