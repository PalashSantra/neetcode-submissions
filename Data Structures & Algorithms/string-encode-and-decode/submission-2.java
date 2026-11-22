class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int delimiter = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, delimiter));
            list.add(str.substring(delimiter + 1, delimiter + 1 + len));
            i = delimiter + 1 + len;
        }
        return list;
    }
}
