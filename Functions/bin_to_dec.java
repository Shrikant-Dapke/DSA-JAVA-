import java.util.Scanner;public class bin_to_dec{
    public static int bintodec(int binNum){
        int dec = 0;
        int pow = 0;

        while(binNum>0){
            int lastdigit = binNum%10;
            dec = dec + lastdigit * (int)Math.pow(2, pow);
            pow++;

            binNum = binNum/10;
        }
        return dec;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int myNum = sc.nextInt();

        System.out.print("The decimal equivalent is: "+bintodec(myNum));
        
    }
}