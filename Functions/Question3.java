//Write a Java program to check if a number is a palindrome in Java?
import java.util.Scanner;

public class Question3{
    public static boolean ispalindrome(int n){
        int OG = n;
        int rev = 0;
        

        while (n>0){
            int lastdigit = n%10;
            rev = rev * 10 + lastdigit;
            n=n/10;
        }

        if (rev == OG){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (ispalindrome(num)==true){
            System.out.print("The number " +num+ " is a palindrome: ");
        }
        else{
            System.out.print("The number " +num+ " is not a palindrome: ");
        }
    }
}