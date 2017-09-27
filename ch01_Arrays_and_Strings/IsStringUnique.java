import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class IsStringUnique {
    public static void main(String[] args) {
        IsStringUnique isu = new IsStringUnique();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        boolean status = isu.isStringUnique(str);
        System.out.println("The entered string has unique characters : " + status);
    }
    public boolean isStringUnique(String strIn) {
        HashMap<Character, Integer> unique = new HashMap<Character, Integer>();
        for(int i = 0; i < strIn.length(); i++) {
            if(unique.containsKey(strIn.charAt(i))) {
                return false;
            } else {
                unique.put(strIn.charAt(i), 1);
            }
        }
        return true;
    }

}
