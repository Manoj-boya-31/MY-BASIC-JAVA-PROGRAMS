public class ArrayMissingElement {
    public static void main(String[] args) {
        int[] arr = { 4, 0, 2, 7, 9, 6, 1, 3, 5 };
        int missing = findMissing(arr);
        System.out.println("Missing number: " + missing);
    }

    public static int findMissing(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < nums.length && nums[i] != nums[nums[i]]) {
                swap(nums, i, nums[i]);
            } else {
                i++;
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}