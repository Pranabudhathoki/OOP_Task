import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double principal = sc.nextInt();

        System.out.print("Enter Annual Interest Rate (in %): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        int time = sc.nextInt();

        double amount = principal * Math.pow((1 + rate / 100), time);
        double ci = amount - principal;

        System.out.printf("Compound Interest = %.2f", ci);

        sc.close();
    }
}
