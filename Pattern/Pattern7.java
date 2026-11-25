public class Pattern7{
    public static void Half_Inverted_rotated_Pyramid_with_numbers(int n){
        //No. rows
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Half_Inverted_rotated_Pyramid_with_numbers(5);
    }
}