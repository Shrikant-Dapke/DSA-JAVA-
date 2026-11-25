//In a program, input the side of a square. You have to output the area of the square.(Hint : area of a square is (side x side)

import java.util.Scanner;
public class AreaOfSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of a square: ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.print("The area of the square is: " + area);
    }
}