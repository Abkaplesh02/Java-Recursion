import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {
    public static int Fibo(int a){
        if(a<=1){
            return a;
        }
        return Fibo(a-1) + Fibo(a-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter which fiboncci term you want to find :: ");
        int a=sc.nextInt();
        System.out.println(Fibo(a));
    }
}
