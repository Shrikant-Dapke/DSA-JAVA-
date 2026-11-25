//Write a Java method to compute the sum of the digits in an integer
import java.util.Scanner;
public class Question4 {
    public static int sumOfDigits(int num){
        int sum = 0;

        while (num > 0){
            int lastdigit = num % 10;
            sum = sum + lastdigit;
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("The sum of the digits in " +num+ " is: " +sumOfDigits(num));
    }
}