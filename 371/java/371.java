//https://leetcode.com/problems/sum-of-two-integers/discuss/132479/Simple-explanation-on-how-to-arrive-at-the-solution
class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            // System.out.println(Integer.toBinaryString(a) + " " +
            // Integer.toBinaryString(b) + " " + Integer.toBinaryString(carry));
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}