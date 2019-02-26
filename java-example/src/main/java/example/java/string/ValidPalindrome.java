package example.java.string;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        char[] chars = s.toUpperCase().toCharArray();
        int first = 0;
        int last = s.length()-1;
        while(first<=s.length()/2 && last>s.length()/2-1) {
            while(!isValid(chars[first]))
                first++;
            while(!isValid(chars[last]))
                last--;
            if(chars[first]!=chars[last]) {
                return false;
            } else {
                first++;
                last--;
            }
        }
        return true;

    }


    public boolean isValid(char c) {
        if((c>=48 && c<=57) || (c>=65 && c<=90)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        ValidPalindrome validPalindrome = new ValidPalindrome();
//        System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(validPalindrome.isPalindrome("race a car"));
    }
}
