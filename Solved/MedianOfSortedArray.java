package Solved;

/*
 * 4. Median of Two Sorted Arrays
 *    Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of
 *    the two sorted arrays.
 *    The overall run time complexity should be O(log (m+n)).
 * 
 * Example 1:
 *      Input: nums1 = [1,3], nums2 = [2]
 *      Output: 2.00000
 *      Explanation: merged array = [1,2,3] and median is 2.
 * 
 * Example 2:
 *      Input: nums1 = [1,2], nums2 = [3,4]
 *      Output: 2.50000
 *      Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */

import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] newArr = new int[n1 + n2];

        int i = 0;
        for (Integer v : nums1) {
            newArr[i] = v;
            i += 1;
        }
        for (Integer v : nums2) {
            newArr[i] = v;
            i += 1;
        }

        Arrays.sort(newArr);
        double t;
        if((n1+n2)%2 == 1)
            return newArr[(n1+n2)/2] * 1.00000;
        else
            return (newArr[((n1+n2)/2) - 1] + newArr[(n1+n2)/2]) / 2.0;

    }
}