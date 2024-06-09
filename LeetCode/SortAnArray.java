class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, new int[nums.length], 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int[] temp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }
        int middle = leftStart + (rightEnd - leftStart) / 2;
        mergeSort(nums, temp, leftStart, middle);
        mergeSort(nums, temp, middle + 1, rightEnd);
        mergeHalves(nums, temp, leftStart, rightEnd);
    }

    private void mergeHalves(int[] nums, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = leftStart + (rightEnd - leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (nums[left] <= nums[right]) {
                temp[index] = nums[left];
                left++;
            } else {
                temp[index] = nums[right];
                right++;
            }
            index++;
        }

        System.arraycopy(nums, left, temp, index, leftEnd - left + 1);
        System.arraycopy(nums, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, nums, leftStart, size);
    }
}
