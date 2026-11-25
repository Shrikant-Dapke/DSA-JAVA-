
public class Linear_Search{
    public static int Array(int numbers[] , int key){

        for(int i=0; i<=numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int Numbers[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 10;
        
        int index = Array(Numbers , key);

        if(index == -1){
            System.out.println("Key is not in array");
        }else{
            System.out.println("key is at index: "+index);
        }
    }
}