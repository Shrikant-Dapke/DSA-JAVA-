//Write a Java method to compute the averageof three numbers..

import java.util.Scanner;

public class Question1 {
    public static float average(float a, float b, float c){
        float avg = (a + b + c)/3;
        return avg;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();
        System.out.print("Enter third number: ");
        float num3 = sc.nextFloat();
        System.out.println("The average of three numbers is: " + average(num1, num2, num3));
    }
}