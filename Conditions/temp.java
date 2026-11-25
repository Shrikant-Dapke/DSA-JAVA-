import java.util.Scanner;
public class temp{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your current temperature in Celsius: ");
        int temperature = sc.nextInt();

        if (temperature > 30) {
            System.out.println("It's a hot day.");
        } else if (temperature >= 20) {
            System.out.println("It's a warm day.");
        } else if (temperature >= 10) {
            System.out.println("It's a cool day.");
        } else {
            System.out.println("It's a cold day.");
        }
    }
}