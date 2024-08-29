import java.util.Scanner;

public class SumofFirstNNumbersUsingRecursion {
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+Sum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N :: ");
        int N=sc.nextInt();
        int sum=Sum(N);
        System.out.println("the sum is  :: " + sum);
    }
}
