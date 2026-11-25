public class Pattern11{
    public static void Rhombus(int n){
        //Outer loop
        for(int i=1; i<=n; i++){
            //spaces-(n-i)
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //Stars-(n)
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Rhombus(5);
    }
}