// Print 1 to N using basics resursion
import java.util.Scanner;

public class PrintFrom1toN {
    public static void Print(int a, int n){
        if(a>n){
            return ;
        }
        System.out.println(a);
        Print(a+1,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n :: ");
        int a=sc.nextInt();
        Print(1,a);

    }
}
