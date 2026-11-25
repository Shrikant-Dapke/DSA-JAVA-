//Write a method named isEven that accepts an int argument.The method should return true if the argument is even, or false otherwise. Also write a program to test your method.

import java.util.Scanner;
public class Question2 {
    public static boolean isEven(int n){

        boolean isEven;

        if (n % 2 == 0){
            isEven = true;
        }
        else{
            isEven = false;
        }
        return isEven;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isEven(num)==true){
            System.out.print("The number " +num+ " is even: ");
        }
        else{
            System.out.print("The number " +num+ " is not even: ");
        }
    }
}