import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {//go through all the integer once
            if (map.containsKey(target - nums[i])) {//check if the current complement is in the hash table
                return new int[] { map.get(target - nums[i]), i };
            }
            map.put(nums[i], i);//Store the complement and the index in the hashtable.
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
//time complexity is O(n) since we only go through the array once
//space complexity is O(n) extra space for the hash table
