class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        for (int c = 0; c < strs[0].length(); c++) {
            for (int i = 1; i < strs.length; i++) {
                if (c > strs[i].length()-1) {
                    return prefix.toString();
                }
                if (strs[0].charAt(c) == strs[i].charAt(c)) {
                } else {
                    return prefix.toString();
                }
            }

            prefix.append(strs[0].charAt(c));
            
        }

        return prefix.toString();
    }
}