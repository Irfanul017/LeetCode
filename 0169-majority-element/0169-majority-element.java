class Solution {
    public int majorityElement(int[] nums) {
       int n = nums.length;
       int count = 0;
       int element =0;
       for(int i = 0; i< n ; i++){
            if(count == 0){   // initialze count= 0; assign element 1st element in array as majority
                count = 1;
                element = nums[i];
            }
            else if (element == nums[i]){
                count++;
            }
            else{
                count--;
            }
       }
       int count1=0;
       for(int i = 0 ; i< n ; i++){ // for counting majority element count
            if(nums[i]== element){
                count1++;
            }
       }
       if(count1 > n/2){  // verify element got as majority
        return element;
       }
    return -1;
    }
    
}