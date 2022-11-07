import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the operation: ");
        char ch = in.next().trim().charAt(0);
        System.out.println("Now enter the numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if(ch=='+')
            System.out.println(num1+num2);
        else if(ch=='-')
            System.out.println(num1-num2);
        else if(ch=='*')
            System.out.println(num1*num2);
        else if(ch=='/'){
            if(num2!=0)
                System.out.println(num1/num2);
        }

        else
            System.out.println("Insert a valid input! ");

    }
}
