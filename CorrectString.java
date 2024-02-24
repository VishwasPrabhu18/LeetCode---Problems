/*
 *  Return true if either 1st char of word is Capital and rest are small or All Capital or All Small else return false.
 */

public class CorrectString {
    public static void main(String[] args) {
        String[] word = { "Hello", "HELLO", "hello", "HellO" };

        for (String v : word)
            System.out.println(checkString(v));
    }

    // approach 1
    // public static boolean checkString(String w) {
    // if (w.charAt(0) >= 'A' && w.charAt(0) <= 'Z') {
    // if (w.charAt(1) >= 'a' && w.charAt(1) <= 'z') {
    // for (int i = 2; i < w.length(); i++) { // checking all letters are small
    // if (w.charAt(i) >= 'A' && w.charAt(i) <= 'Z')
    // return false;
    // }
    // }

    // for (int i = 1; i < w.length(); i++) { // checking all letters are capital
    // if (w.charAt(i) >= 'a' && w.charAt(i) <= 'a')
    // return false;
    // }
    // }
    // return true;
    // }

    // approach 2

    public static boolean checkString(String w) {

        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (int i = 0; i < w.length(); i++) {
            char wordChar = w.charAt(i);

            if (Character.isUpperCase(wordChar))
                upperCaseCount += 1;
            else if (Character.isLowerCase(wordChar))
                lowerCaseCount += 1;
        }

        if (upperCaseCount == 1 && lowerCaseCount == w.length() - 1 && Character.isUpperCase(w.charAt(0)))
            return true;

        if (upperCaseCount == w.length() && lowerCaseCount == 0)
            return true;

        if (lowerCaseCount == w.length() && upperCaseCount == 0)
            return true;
            
        return false;
    }

}
