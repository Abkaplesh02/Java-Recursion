import java.util.Scanner;

public class Print1ToNWithoutLoop {
    public static void Print(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        else{
            Print(n-1);
            System.out.println(n);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n :: ");
        int a=sc.nextInt();
        Print(a);
    }
}
