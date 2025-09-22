package bMaths;

public class BReverseNumber {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int lastDigit = x % 10;

            // check for overflow/underflow before multiplying by 10
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + lastDigit;
            x = x / 10;
        }
        return rev;
    }

    public static void main(String arg[]) {
        BReverseNumber obj = new BReverseNumber();

        int num1 = 12345;
        int num2 = 9876;
        int num3 = 1000;
        int num4 = -123;

        System.out.println("Reverse of " + num1 + " = " + obj.reverse(num1));
        System.out.println("Reverse of " + num2 + " = " + obj.reverse(num2));
        System.out.println("Reverse of " + num3 + " = " + obj.reverse(num3));
        System.out.println("Reverse of " + num4 + " = " + obj.reverse(num4));
    }
}
