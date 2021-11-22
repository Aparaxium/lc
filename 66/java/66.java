class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList();
        boolean carry = false;

        list.add((digits[digits.length - 1] + 1) % 10);

        if (digits[digits.length - 1] == 9) {
            carry = true;
        }

        for (int i = digits.length - 2; i >= 0; i--) {
            if (carry) {
                list.add(0, (digits[i] + 1) % 10);
                if (digits[i] == 9) {
                    carry = true;
                } else {
                    carry = false;
                }
            } else {
                list.add(0, digits[i]);
            }
        }
        if (carry) {
            list.add(0, 1);
        }
        // System.out.println(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}