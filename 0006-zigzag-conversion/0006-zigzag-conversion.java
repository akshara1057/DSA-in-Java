class Solution {
    public String convert(String s, int numRows) {
        String[] rows = new String[numRows];
        int curr = 0;
        boolean down = true;
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }
        if (numRows == 1) {
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            rows[curr] = rows[curr] + s.charAt(i);
            if (curr == 0) {
                down = true;
            }
            if (curr == numRows - 1) {
                down = false;
            }
            if (down == true) {
                curr++;
            }
            if (down == false) {
                curr--;
            }
        }
        String ans = "";
        for (int i = 0; i < rows.length; i++) {
            ans = ans + rows[i];
        }
        return ans;
    }
}