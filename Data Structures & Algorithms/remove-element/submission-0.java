class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;  // Pointer for next position to insert valid element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];  // Move valid element to the left
                k++;
            }
        }

        return k;  // Number of elements not equal to val
    }
}
