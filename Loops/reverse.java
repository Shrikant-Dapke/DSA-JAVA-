public class reverse{
    public static void main(String[] args){
        int n = 10899;
        int RevNum = 0;

        while(n > 0){
            int LastDigit = n % 10;
            n /= 10;
            RevNum = RevNum * 10 + LastDigit;
        }
        System.out.println("Reversed Number: " + RevNum);
    }
} 