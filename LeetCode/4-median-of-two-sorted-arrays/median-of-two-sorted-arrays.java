class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length + nums2.length;

        int i = 0, j = 0, num = 0, prev = 0;
        int cnt = -1;

        while (i < nums1.length && j < nums2.length) {

            prev = num;

            if (nums1[i] >= nums2[j]) {
                num = nums2[j++];
            } else {
                num = nums1[i++];
            }

            cnt++;

            if (cnt == n / 2) {
                if (n % 2 == 0) {
                    return ((double) prev + num) / 2;
                } else {
                    return num;
                }
            }
        }

        while (i < nums1.length) {

            prev = num;
            num = nums1[i++];
            cnt++;

            if (cnt == n / 2) {
                if (n % 2 == 0) {
                    return ((double) prev + num) / 2;
                } else {
                    return num;
                }
            }
        }

        while (j < nums2.length) {

            prev = num;
            num = nums2[j++];
            cnt++;

            if (cnt == n / 2) {
                if (n % 2 == 0) {
                    return ((double) prev + num) / 2;
                } else {
                    return num;
                }
            }
        }

        return 0.0;
    }
}