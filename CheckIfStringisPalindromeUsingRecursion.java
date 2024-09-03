// Check if string is palindrome using basing recursion
import java.util.Scanner;

public class CheckIfStringisPalindromeUsingRecursion {
    public static boolean Reverse(String str, int n){
        if(n>(str.length()-1)/2){
            return true;
        }
        if(str.charAt(n)!=str.charAt(str.length()-1-n)){
            return false;
        }
        return Reverse(str,n+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to check for plaindrome :: ");
        String str=sc.next();
        System.out.println("is Given string palindrome :: " + Reverse(str, 0));
    }
}
