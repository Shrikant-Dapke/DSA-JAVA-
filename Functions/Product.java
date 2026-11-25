import java.util.Scanner;

public class Product {
    public static int Calculateproduct(int num1 , int num2){
        int product = num1 * num2;
        return product;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");
        System.out.print("First number: ");
        int a = sc.nextInt();
        System.out.print("Second number: ");
        int b = sc.nextInt();

        int product = Calculateproduct(a , b);

        System.out.println("Product: "+product);
    
    }
}