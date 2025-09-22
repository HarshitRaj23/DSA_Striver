package bMaths;

public class ACountDigit {
    int count(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    int count2(int n) {
        if (n == 0) return 1;  // log10(0) is undefined, handle separately
        return (int)(Math.log10(n) + 1);
    }

    public static void main(String args[]) {
        ACountDigit obj = new ACountDigit();

        int num1 = 12345;
        int num2 = 987654321;
        int num3 = 7;
        int num4 = 0;

        System.out.println("Number of digits in " + num1 + " = " + obj.count(num1));
        System.out.println("Number of digits in " + num2 + " = " + obj.count(num2));
        System.out.println("Number of digits in " + num3 + " = " + obj.count(num3));
        System.out.println("Number of digits in " + num4 + " (using count2) = " + obj.count2(num4));
    }
}
