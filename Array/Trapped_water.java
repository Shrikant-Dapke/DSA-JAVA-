//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.


public class Trapped_water{
    public static int TrappedRainwater(int height[]){
        int n = height.length;

        //Calculate left max boundary
        int leftMax[] = new int [n];
        leftMax[0] = height[0];

        for (int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //Calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];

        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedwater = 0;
        //Loop
        for(int i=0; i<n; i++){
            int waterlvl = Math.min(leftMax[i], rightMax[i]); 
            trappedwater += waterlvl - height[i];
        }
        return trappedwater;
    }
    public static void main (String[] args){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("the volume of trapped water is :" + TrappedRainwater(height));

    }
}