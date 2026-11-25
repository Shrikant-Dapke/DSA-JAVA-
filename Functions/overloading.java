public class overloading {

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static float add(float a, float b){
        return a + b;
    }
    public static void main(String[] args){

        // With same data type
        System.out.println("Sum of 2 and 3: " + sum(2, 3));
        System.out.println("Sum of 2, 3 and 4: " + sum(2, 3, 4));

        // With different data type
        System.out.println("Addition of 2 and 3 (int): " + add(2, 3));
        System.out.println("Addition of 2.5 and 3.5 (float): " + add(2.5f, 3.5f));
    }
}