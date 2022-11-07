import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String rev="";
        int len = s.length();
//        for(int i = len-1; i>=0 ; i--){
//            rev=rev+s.charAt(i);
//        }
//        if(s.equals(rev))
//            System.out.println("Palindrome");
//        else
//            System.out.println("Not a Palindrome");
        boolean flag = true;
        for(int i = 0; i<len/2; i++){
            if(s.charAt(i)!=s.charAt(len-1-i)){
                flag=false;
                System.out.println("Not a Palindrome..");
            }
        }
        if(flag)
            System.out.println("Palindrome..");
    }
}
