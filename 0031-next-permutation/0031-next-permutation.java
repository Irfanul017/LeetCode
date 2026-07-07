class Solution { 
    public void nextPermutation(int[] nums) { 
        int indx = -1; 
        int n = nums.length; 
        
        // 1. Find the dip point i.e nums[i] < nums[i+1] 
        for (int i = n - 2; i >= 0; i--) { 
            if (nums[i] < nums[i + 1]) { 
                indx = i; 
                break; 
            } 
        } 
        
        // 2. Base condition: If array is strictly descending (e.g., [3, 2, 1])
        if (indx == -1) { 
            reverse(nums, 0, n - 1); 
            return; 
        } 
        
        // 3. Find the smallest element larger than nums[indx] and swap
        for (int i = n - 1; i > indx; i--) { 
            if (nums[i] > nums[indx]){ 
                swap(nums, i, indx); 
                break; 
            } 
        } 
        
        // 4. Reverse the suffix to get the next smallest sequence
        reverse(nums, indx + 1, n - 1); 
    } 

    // Helper to swap elements
    private void swap(int[] arr, int i, int j) { 
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
    } 

    // Helper to reverse sub-array
    private void reverse(int[] arr, int start, int end) { 
        while (start < end) { 
            int temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; 
            end--; 
        } 
    } 
}
