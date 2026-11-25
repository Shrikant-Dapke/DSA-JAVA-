public class Largest_number{

    public static int GetLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;//-Infinity

        for(int i = 0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int GetSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE; //Infinity

        for(int i = 0; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main (String[] args){
        int numbers[] = {1,2,3,4,5,6,7,8,9,0};

        System.out.println("The largest number is :" + GetLargest(numbers));
        System.out.println("The Smallest number is :" + GetSmallest(numbers));
    }
}