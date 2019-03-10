package example.java.algorithms.searching.binary.search;

public class DivideTwoIntegers {

    public int divide(int dividend, int divisor) {
        int count=0;
        int sign = (dividend<0) ? -1 : 1;
        sign = sign * ((divisor<0) ? -1 : 1);
        dividend = dividend * sign;
        divisor = dividend * sign;
        while(dividend>=divisor) {
            dividend = dividend -divisor;
            count++;
        }
        return count * sign;
    }

    public static void main(String[] args) {
        DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();
        divideTwoIntegers.divide(-2147483648, -1);
    }
}
