package example.java.string;

public class NumUniqueEmails {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> formattedEmails = new HashSet<String>();
        for(String email : emails) {
            System.out.println("Email: "+email);
            StringBuilder sb = new StringBuilder();
            int indexOfDomain = email.indexOf("@");
            int indexOfDot = email.indexOf(".");
            int indexOfPlus = email.indexOf("+");
            int previousIndex = 0;
            String formattedEmail = "";
            while(indexOfDot < indexOfDomain) {
                formattedEmail += email.substring(0, indexOfDot);
                previousIndex = indexOfDot;
                email = email.substring(indexOfDot+1);
                indexOfDot = email.indexOf(".",indexOfDot+1);
                System.out.println(formattedEmail);
            }
            if(indexOfDot < indexOfDomain) {

            }
            if(indexOfPlus < indexOfDomain) {
                formattedEmail = email.substring(0, indexOfPlus);
            }
            formattedEmail += email.substring(indexOfDomain, email.length());
            System.out.println("FormattedEmail: "+formattedEmail);
            formattedEmails.add(formattedEmail);
        }
        return formattedEmails.size();
    }

    public static void main(String[] args) {
        NumUniqueEmails numUniqueEmails = new NumUniqueEmails();
        numUniqueEmails.numUniqueEmails({"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"});
    }
}
