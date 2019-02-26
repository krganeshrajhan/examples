package example.java.string;


import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {

    public int numUniqueEmails(String[] emails) {

        Set<String> uniqueEmail = new HashSet<>();

        for(String s : emails) {
            int at = s.indexOf('@');
            int plus = s.indexOf('+');
            int period = s.indexOf('.');
            at = (plus<at) ? plus : at;
            if(period<at) {
                uniqueEmail.add(removePeriod(s, at));
            } else {
                uniqueEmail.add(s);
            }

        }
        return uniqueEmail.size();
    }

    private String removePeriod(String s, int at) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);

        while (sb.indexOf(".")>0 && sb.indexOf(".")<at) {
            int plus = s.indexOf('+');
            int period = s.indexOf('.');
            at = (plus<at) ? plus : at;
            sb = new StringBuilder();
            sb.append(s.substring(0,period));
            sb.append(s.substring(period+1,at));
            sb.append(s.substring(at+1));
            s = sb.toString();
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        UniqueEmailAddress u = new UniqueEmailAddress();
        u.numUniqueEmails(new String[] {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"});
    }
}
