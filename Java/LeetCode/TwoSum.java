package LeetCode;

class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int size = nums.length;
		int targets[] = new int[2];
		int counter = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (nums[i] + nums[j] == target) {
					targets[i] = i;
					targets[j] = j;
					return nums;
				}
			}

		}
		return targets;

	}

	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		int[] nums = { 2, 7, 11, 15 };

		twoSum.twoSum(nums, 9);

	}
}
