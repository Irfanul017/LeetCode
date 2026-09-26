class Solution {
    public int[] searchRange(int[] nums, int target) {

        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int first = -1;

        // Find first occurrence
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                first = mid;
                right = mid - 1;
            }
            else if (nums[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        int last = lastOccurrence(nums, target);

        return new int[]{first, last};
    }

    public int lastOccurrence(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int answer = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                answer = mid;
                low = mid + 1;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return answer;
    }
}