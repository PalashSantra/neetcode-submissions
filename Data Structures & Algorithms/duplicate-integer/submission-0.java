class Solution {
    public boolean hasDuplicate(int[] nums) {
        int i = 0;
        Set<Integer> unique = new HashSet<>();
        for (int num : nums) {
            if (unique.add(num) == false) {
                return true;
            }
        }
        return false;
    }
}