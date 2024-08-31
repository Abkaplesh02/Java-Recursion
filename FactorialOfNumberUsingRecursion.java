import java.util.Scanner;

public class FactorialOfNumberUsingRecursion {
    public static int Print(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*Print(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n :: ");
        int a=sc.nextInt();
        int Fact=Print(a);
        System.out.println("The factorial of number is :: " + Fact);

    }
}
