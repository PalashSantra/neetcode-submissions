class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> currentMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (currentMap.containsKey(diff)) {
                return new int[] {currentMap.get(diff), i};
            }
            currentMap.put(nums[i], i);
        }
        return null;
    }
}
