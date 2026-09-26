class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            // if target found return mid
            if(nums[mid] == target) return mid;

            // left half is sorted
            if(nums[low] <= nums[mid]) {

                //find whether target lies in this half 
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid - 1; // lies than eliminate right half
                }
                else low = mid + 1; // else left half

            } 

            // right half sorted , same as left half
            else{
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid + 1;
                }
                else high = mid - 1;            }
        }
        return -1; // not found
    }
}