class Solution {
    public String intToRoman(int num) {
        
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for (int x = 0; x < numbers.length; x++) {
            while (num >= numbers[x]) {
                roman.append(symbols[x]);
                num -= numbers[x];
            }
        }

        return roman.toString();
    }
}