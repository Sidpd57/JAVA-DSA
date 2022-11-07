import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int low=in.nextInt();
        int high=in.nextInt();

        for(int i = low+1; i<high; i++){
            int n=i;
            int m = n;
            int temp=m;
            //digit count
            int deg=0;
            while(n>0){
                n/=10;
                deg++;
            }
            int sum=0;
            for(int j = 0; j<deg; j++){
                int l = m%10;
                sum+=(l*l*l);
                m/=10;
            }
            if(sum==temp)
                System.out.println(sum);

        }
    }
}
