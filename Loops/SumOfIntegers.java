import java.util.*;

public class SumOfIntegers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int SumEven = 0;
        int SumOdd = 0;

        do { 
            System.out.print("Enter the number :");
            number = sc.nextInt();

            if(number % 2 == 0) {
                SumEven += number;
            } else {
                SumOdd += number;
            }

            System.out.print("Do you want to continue? (1 for Yes / 0 for No): ");
            choice = sc.nextInt();

            if(choice == 0) {
                System.out.println("Sum of Even Numbers: " + SumEven);
                System.out.println("Sum of Odd Numbers: " + SumOdd);
                break;
            }
            
        } while (true);
    }
}
