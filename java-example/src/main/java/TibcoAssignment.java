import java.util.Random;

public class TibcoAssignment {

    public static void main(String[] args) {

        TibcoAssignment tibcoAssignment = new TibcoAssignment();
        System.out.println(tibcoAssignment.generateBigRandom());
        System.out.println(tibcoAssignment.isPrime(23));
        System.out.println(tibcoAssignment.getFactors(45));

    }

    private long[] getFactors(long number) {
        return new long[1];
    }

    private boolean isPrime(long number) {
        return false;
    }

    private long generateBigRandom() {
        Random random = new Random();
        return random.nextLong();
    }

}
