import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        if(n==0)
            System.out.println("Neither odd nor even");
        else if(n%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }
}
