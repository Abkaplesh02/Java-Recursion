import java.util.Scanner;

public class PrintNameNTimes {
    public static void Print(int a,int n){
        if(a>n){
            return ;
        }
        System.out.println("My name is Abhishek ");
        Print(a+1,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n :: ");
        int a=sc.nextInt();
        Print(1,a);
    }
}
