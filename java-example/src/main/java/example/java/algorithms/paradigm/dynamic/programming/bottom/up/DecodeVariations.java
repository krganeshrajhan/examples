package example.java.algorithms.paradigm.dynamic.programming.bottom.up;

public class DecodeVariations {

    static int decodeVariations(String S) {
        char[] chars = S.toCharArray();
        int n = chars.length;
        int[] decodeCount = new int[n];
        decodeCount[0] = 1;

        for(int ch=1; ch<n; ch++) {
            int num = Integer.parseInt(((Character) chars[ch-1]).toString()) * 10
                    + Integer.parseInt(((Character) chars[ch]).toString());
            if(num<=26)
                decodeCount[ch] = decodeCount[ch-1] + 1;
            else
                decodeCount[ch] = decodeCount[ch-1];
        }

        return decodeCount[n-1];
    }

    public static void main(String[] args) {
        System.out.println(DecodeVariations.decodeVariations("1262"));
    }
}
