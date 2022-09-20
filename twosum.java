import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { map.get(target - nums[i]), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String args[]) {
        Solution mySol = new Solution();
        int[] nums = { 2, 7, 11, 15 };
        int[] res = mySol.twoSum(nums, 9);
        System.out.println("Index[" + res[0] + "," + res[1] + "]");
    }
}