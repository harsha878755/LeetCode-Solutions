class Solution {
    public int removeDuplicates(int[] nums) {

        int unique = 1;

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] != nums[i - 1]) {

                unique += 1;
                nums[unique - 1] = nums[i];
            }
        }

        return unique;
    }
}
