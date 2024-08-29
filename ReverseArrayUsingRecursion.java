import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayUsingRecursion {
    public static int [] Reverse(int arr[] , int start, int end){
        if(start>=end){
            return arr;
        }
        else{
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            Reverse(arr,start+1,end-1);
        }
        return arr;
    }
    public static int [] Reverse2(int arr[] , int start){
        if(start>(arr.length-1)/2){
            return arr;
        }
        else{
            int temp=arr[start];
            arr[start]=arr[arr.length-1-start];
            arr[arr.length-1-start]=temp;
            Reverse2(arr,start+1);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :: ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the values of array :: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
//        System.out.println(Arrays.toString(Reverse(arr , 0 , arr.length-1)));
        System.out.println(Arrays.toString(Reverse2(arr,0)));
    }
}
