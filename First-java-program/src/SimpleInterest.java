import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        int p = in.nextInt();
        System.out.print("Enter the interest rate: ");
        int r = in.nextInt();
        System.out.print("Enter the time in year: ");
        int t = in.nextInt();

        int si= (p*r*t)/100;
        System.out.println("The required simple interest is: "+si);
    }
}
