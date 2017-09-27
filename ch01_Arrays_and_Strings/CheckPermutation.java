import java.util.HashMap;
import java.util.Scanner;

public class CheckPermutation {
    private boolean matchPermutation(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        } else { 
            HashMap<Character, Integer> strOne = new HashMap<Character, Integer>();
            HashMap<Character, Integer> strTwo = new HashMap<Character, Integer>();
            for(int i = 0; i < str1.length(); i++) {
                if(strOne.containsKey(str1.charAt(i))) {
                    strOne.put(str1.charAt(i), strOne.get(str1.charAt(i) + 1));
                } else {
                    strOne.put(str1.charAt(i), 1);
                }
            }
            for(int i = 0; i < str2.length(); i++) {
                if(strTwo.containsKey(str2.charAt(i))) {
                    strTwo.put(str2.charAt(i), strTwo.get(str2.charAt(i) + 1));
                } else {
                    strTwo.put(str2.charAt(i), 1);
                }
            }
            /* Compare the Hashmaps now */
            if(strOne.equals(strTwo)) {
                return true;}
            else {
                return false;}
        }
    }
    /**
     * Testing main function
     */
    public static void main(String [] args) {
        CheckPermutation cp = new CheckPermutation();
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        System.out.println("Second string is permuation of first string : " + cp.matchPermutation(str1, str2));
    }
}
