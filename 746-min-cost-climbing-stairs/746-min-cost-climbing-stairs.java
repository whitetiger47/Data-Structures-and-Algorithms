class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int min[]= new int[cost.length+1];
            
            for(int i=2;i<min.length;i++)
            {
                int stepOne = min[i-1] + cost[i-1];
                int stepTwo = min[i-2] + cost[i-2];
                min[i]=Math.min(stepOne,stepTwo);
            }
        
        return min[min.length-1];
        
    }
}