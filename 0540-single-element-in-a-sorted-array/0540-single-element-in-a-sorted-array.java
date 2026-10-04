class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 1; // trim down search 
        int high = n - 2;

        if(nums.length == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0]; // to avoid search on left .Edge case
        if(nums[n - 1] != nums[n - 2]) return nums[n-1]; // to avoid last element seach for right 

        while(low <= high){
            int mid = low +(high - low) / 2;

            if(nums[mid] != nums[mid -1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            // left of array
            if((mid % 2 == 1 && nums[mid] == nums[mid - 1] )
                ||(mid % 2 == 0 && nums[mid] == nums[mid + 1])){
              
                low = mid + 1; 
            } 

            // right of array
            else high = mid - 1;
          
            
        }
        return -1; // dumpy statement 
        
    }
}