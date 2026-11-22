class Solution {
    public boolean isPalindrome(String s) {
        char[] array = s.toLowerCase().toCharArray();
        int i = 0;
        int j = array.length -1;
        while(i<=j) {
            int k = i;
            int l = j;
            if (!alphaNum(array[i])) i++;
            if (!alphaNum(array[j])) j--;
            if (!(!alphaNum(array[k]) || !alphaNum(array[l]))) {
                if (array[i]!=array[j]) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
