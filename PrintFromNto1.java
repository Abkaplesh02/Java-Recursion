// Print N to 1 using recursion
import java.util.Scanner;

public class PrintFromNto1 {
    public static void Print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        Print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n :: ");
        int a=sc.nextInt();
        Print(a);
    }
}
