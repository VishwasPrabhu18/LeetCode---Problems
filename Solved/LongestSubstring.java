package Solved;

import java.util.Collection;
import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        Collection<Character> res = new HashSet<Character>();
        String a = "abcabcbb";


        for (int i = 0; i < a.length(); i++) {
            if (!res.contains(a.charAt(i))) {
                res.add(a.charAt(i));
            }
        }

        
        System.out.println(res.toString());

    }
}
