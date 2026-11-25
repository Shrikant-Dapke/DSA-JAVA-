import java.util.Scanner;

public class dec_to_bin{
    public static int dectobin(int decNum){
        int bin = 0;
        int pow = 0;

        while(decNum>0){
            int remainder = decNum % 2;
            bin = bin + remainder * (int)Math.pow(10, pow);
            pow++;
            decNum = decNum / 2;
        }
        System.out.print("The binary equivalent is: ");
        return bin;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number:");
        int myNum = sc.nextInt();

        System.out.println(dectobin(myNum));
    }
}
