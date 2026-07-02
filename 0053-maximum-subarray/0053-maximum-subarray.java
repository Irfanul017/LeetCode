class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane Algo
        int maximum = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i = 0 ; i< nums.length ; i++){
            sum +=nums[i];

            if(sum > maximum){
                maximum = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        if(maximum == 0){
            return 0;
        }
        return maximum;
    }
}