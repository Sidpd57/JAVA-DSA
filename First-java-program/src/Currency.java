import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the amount in rupees: ");
        double rup = in.nextDouble();

        System.out.println("USD: "+rup/83.92);
    }
}
