class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> list = new ArrayList<>();

        int n = nums.length;

        int count1 = 0;
        int count2 = 0;

        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;

        // Phase 1: Find possible candidates
        for (int i = 0; i < n; i++) {

            if (count1 == 0 && nums[i] != element2) {
                element1 = nums[i];
                count1++;
            }
            else if (count2 == 0 && nums[i] != element1) {
                element2 = nums[i];
                count2++;
            }
            else if (element1 == nums[i]) {
                count1++;
            }
            else if (element2 == nums[i]) {
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Verify manually
        int ct1 = 0;
        int ct2 = 0;

        for (int i = 0; i < n; i++) {

            if (element1 == nums[i]) {
                ct1++;
            }

            if (element2 == nums[i]) {
                ct2++;
            }
        }

        int min = n / 3;

        if (ct1 > min) {
            list.add(element1);
        }

        if (ct2 > min) {
            list.add(element2);
        }

        return list;
    }
}