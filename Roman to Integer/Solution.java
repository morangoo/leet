import java.util.HashMap;

class Solution {
    private static final HashMap<String, Integer> roman = new HashMap<>();
    static {
        roman.put("M", 1000);
        roman.put("CM", 900);
        roman.put("D", 500);
        roman.put("CD", 400);
        roman.put("C", 100);
        roman.put("XC", 90);
        roman.put("L", 50);
        roman.put("XL", 40);
        roman.put("X", 10);
        roman.put("IX", 9);
        roman.put("V", 5);
        roman.put("IV", 4);
        roman.put("I", 1);
    }
    

    public int romanToInt(String s) {

        int result = 0;

        for (int x = 0; x < s.length(); x++) {

            if (x + 1 < s.length()) {
                String twoChar = s.substring(x, x + 2);
                if (roman.containsKey(twoChar)) {
                    result += roman.get(twoChar);
                    x++;
                    continue;
                }
            }
            result += roman.get(s.substring(x, x+1));
        }

        return result;

    }
}