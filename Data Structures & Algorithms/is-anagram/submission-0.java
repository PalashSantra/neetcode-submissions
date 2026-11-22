class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char [] sArray = s.toCharArray();
        char [] tArray = t.toCharArray();
 
        Map<Character, Integer> sFrequency = new HashMap<>();
        Map<Character, Integer> tFrequency = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sFrequency.put(sArray[i], sFrequency.getOrDefault(sArray[i], 0) + 1);
            tFrequency.put(tArray[i], tFrequency.getOrDefault(tArray[i], 0) + 1);
        }
        return sFrequency.equals(tFrequency);
    }
}
