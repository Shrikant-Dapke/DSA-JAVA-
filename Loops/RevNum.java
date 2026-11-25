import java.util.Scanner;
public class RevNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        while(n>0){
            int LastDigit = n % 10;
            System.out.print(LastDigit);
            n /= 10;
        }
        System.out.println();
    
    }
}