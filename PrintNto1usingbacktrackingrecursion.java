// Print N to 1 using backtracking recursion
import java.nio.channels.Pipe;
import java.util.Scanner;

public class PrintNto1usingbacktrackingrecursion {
    public static void Print(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        else{
            System.out.println(n);
            Print(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n :: ");
        int a=sc.nextInt();
        Print(a);
    }
}
