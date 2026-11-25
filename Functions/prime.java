import java.util.Scanner;
public class prime {
    public static boolean isPrime(int n){
        boolean isPrime = true;

        if(n==1){
            isPrime = false;
        }
        else if(n==2){
            isPrime = true;
        }
        

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void primesinrange(int n){
        for (int i=2; i<=n; i++){
            if (isPrime(i)==true){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // if (isPrime(n)==true){
        //     System.out.print("The number " +n+ " is prime: ");
        // }
        // else{
        //     System.out.print("The number " +n+ " is not prime: ");
        // }
        primesinrange(n);
    
    }
}