package Solved;

import java.util.Arrays;

public class dummy {
    public static void main(String[] args) {
        String s = "12312 sdfds asdasd";

        String[] a = s.split("(?>=.)");

        System.out.println(Arrays.toString(a));
    }
}