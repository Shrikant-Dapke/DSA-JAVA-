public class Pattern6{
    public static void Half_inverted_rotated_pyramid(int n){

        //No. rows
        for(int i=1; i<=n; i++){
            //Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Half_inverted_rotated_pyramid(5);
    }
}