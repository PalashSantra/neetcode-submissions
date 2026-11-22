class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        // Use reverseOrder() for highest frequency first, and a List to handle ties
        TreeMap<Integer, List<Integer>> sortedMap = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<Integer, Integer> item : frequency.entrySet()) {
            sortedMap.computeIfAbsent(item.getValue(), x -> new ArrayList<>()).add(item.getKey());
        }

        int counter = 0;
        int[] result = new int[k];
        for (Map.Entry<Integer, List<Integer>> item : sortedMap.entrySet()) {
            for (int num : item.getValue()) {
                if (counter < k) {
                    result[counter++] = num;
                } else {
                    return result;
                }
            }
        }
        return result;
    }
}
