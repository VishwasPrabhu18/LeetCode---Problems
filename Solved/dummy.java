package Solved;

import java.util.ArrayList;
import java.util.List;

public class dummy {
    public static void main(String[] args) {
        lengthOfLongestSubstring("abcabcbb");

    }

    public static int lengthOfLongestSubstring(String s) {
        int len = 0;
        for(int i=0; i<s.length() - 1; i++) {
            for(int j=i+1; j<s.length(); j++) {
                String subStr = s.substring(i, j+1);

                if(!checkRepeated(subStr)) {
                    if(subStr.length() > len) {
                        len = subStr.length();
                        System.out.println(subStr);
                    }
                }
            }
        }

        return len;
    }

    public static boolean checkRepeated(String v) {
        List<String> res = new ArrayList<>();
        for(int i=0; i<v.length(); i++) {
            if(!res.contains(""+v.charAt(i)))
                res.add(""+ v.charAt(i));
            else
                return true;
        }
        return false;
    }
}
