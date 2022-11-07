import java.util.Scanner;

public class Fibbo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = in.nextInt();
        int num1 =0;
        int num2 =1;

        int count=2;
        while(count<=n){
            int temp = num2;
            num2= num1+num2;
            num1= temp;
            count++;
        }
        System.out.println(num2);
    }
}
