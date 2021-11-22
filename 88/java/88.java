class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            // System.out.println(i + " " + j + " " + nums2[j] + " " + nums1[i]);
            if (nums2[j] < nums1[i]) {
                insert(nums1, nums2, i, j);
                j++;
            }
            if (i >= m + j) {
                insert(nums1, nums2, i, j);
                j++;
            }
            i++;
        }
    }

    private static void insert(int[] nums1, int[] nums2, int i, int j) {
        for (int k = nums1.length - 1; k > i; k--) {
            nums1[k] = nums1[k - 1];
        }
        nums1[i] = nums2[j];
    }
}