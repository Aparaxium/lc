class Solution {
    public int lengthOfLastWord(String s) {
        boolean flag = true;
        int counter = 0;
        int offset = 0;

        while (flag) {
            if (counter > s.length() - 1 - offset) {
                return counter;
            }
            if (s.charAt(s.length() - 1 - counter - offset) == ' ') {
                offset++;
            } else {
                flag = false;
            }
        }

        flag = true;

        while (flag) {

            if (counter > s.length() - 1 - offset) {
                return counter;
            }

            System.out.println(s.charAt(s.length() - 1 - counter - offset));

            if (s.charAt(s.length() - 1 - counter - offset) == ' ') {
                return counter;
            }

            else {
                counter++;
            }
        }
        return -1;
    }
}