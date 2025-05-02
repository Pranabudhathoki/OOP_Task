import java.util.Scanner;

public class DateConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int totalDays= sc.nextInt();
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        
        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.println(totalDays + " days = " + years + " years, " + months + " months, and " + days + " days.");
    }
    
}
