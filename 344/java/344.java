class Solution {
    public void reverseString(char[] s) {
        char holder;
        for (int i = 0; i < s.length / 2; i++) {
            holder = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = holder;
        }
    }
}