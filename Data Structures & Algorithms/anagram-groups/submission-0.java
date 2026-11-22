class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> freq = new HashMap<>();
        for (int i=0; i<strs.length; i++) {
            char [] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            if (!freq.containsKey(sortedString)) {
                List<String> value = new ArrayList<>();
                value.add(strs[i]);
                freq.put(sortedString, value);
            } else {
                freq.get(sortedString).add(strs[i]);
                freq.put(sortedString, freq.get(sortedString));
            }
        }
        return new ArrayList<>(freq.values());
    }
}
