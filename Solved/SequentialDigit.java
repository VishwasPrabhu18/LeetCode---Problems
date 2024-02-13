package Solved;

import java.util.ArrayList;
import java.util.List;

/*1291. Sequential Digits
 * An integer has sequential digits if and only if each digit in the number is one more than the previous digit.
 * 
 * Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.
 * 
 * Example 1:
 * 
 * Input: low = 100, high = 300
 * Output: [123,234]
 * 
 * Example 2:
 * 
 * Input: low = 1000, high = 13000
 * Output: [1234,2345,3456,4567,5678,6789,12345]
 * 
 * */

 class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";
        List<Integer> res = new ArrayList<>();
        int lLen = String.valueOf(low).length();
        int hLen = String.valueOf(high).length();

        for(int i=lLen; i<=hLen; i++) {
            for(int j=0; j<=digits.length()-i; j++) {
                String seqStr = digits.substring(j, j+i);
                int val = Integer.parseInt(seqStr);

                if(val >= low && val<= high) {
                    res.add(val);
                }
            }
        }

        return res;
    }
}