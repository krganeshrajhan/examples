package example.java.string;

public class CountAndSay {

    public String countAndSay(int n) {
        String readString = "1";
        for(int term=1; term<n; term++) {
            readString = readStringForEveryTerm(readString);
        }
        return readString;
    }

    public String readStringForEveryTerm(String readString) {

        StringBuilder st = new StringBuilder();
        char[] chars = null;
        try {
            chars = readString.toCharArray();
            throw new NullPointerException();
        } catch(NullPointerException e) {
            System.out.println("null");
        }
        int count = 1;
        for(int ch=0;ch<chars.length;ch++) {
            if(ch==chars.length-1) {
                st.append(count);
                st.append(chars[ch]);
            } else if(chars[ch+1]==chars[ch]) {
                count++;
            } else {
                st.append(count);
                st.append(chars[ch]);
                count = 1;
            }
        }
        return st.toString();

    }

    public static void main(String[] args) {
        CountAndSay countAndSay = new CountAndSay();
        countAndSay.countAndSay(6);
        CountAndSay s  = new CountAndSay() {

            @Override
            public String countAndSay(int n) {
                return null;
            }
        };
    }
}
