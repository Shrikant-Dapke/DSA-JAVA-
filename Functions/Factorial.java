import java.util.Scanner;
public class Factorial {
    public static int CalculateFactorial(int num){
        int f = 1;
        for(int i=1; i<=num; i++){
            f = f*i;
        }
    return f;
    }

    public static int BinCoeff(int n , int r){
        int fact_n = CalculateFactorial(n);
        int fact_r = CalculateFactorial(r);
        int fact_n_r = CalculateFactorial(n - r);

        int binom = fact_n / (fact_r * fact_n_r);
        return binom;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a n: ");
        int n = sc.nextInt();

        System.out.print("Enter a r: ");
        int r = sc.nextInt();

        System.out.println("binomial coefficient: "+BinCoeff(n , r));
    
    }
}