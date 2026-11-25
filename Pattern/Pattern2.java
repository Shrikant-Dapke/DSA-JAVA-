public class Pattern2{
    public static void main(String[] args) {
        int n = 5; // Number of lines

        for(int lines = 1; lines <= n; lines++){
            for(int stars = 1; stars <= n - lines + 1; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}