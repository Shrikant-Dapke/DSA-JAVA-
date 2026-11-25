public class Prefix_Sum{
    public static void MaxSubarraySum(int numbers[]){

        int currSum;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        //calculate prefix array
        prefix[0] = numbers[0];
        for(int i =1; i<numbers.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for (int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k = start; k<=end; k++){
                    //SubArray sum
                    currSum += numbers[k];
                }
                
                System.out.println(currSum);
                if (maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max Sum = "+maxSum);
    }
    public static void main (String args[]){
        int numbers[] = {2,4,6,8,10};
        MaxSubarraySum(numbers);
    }

}