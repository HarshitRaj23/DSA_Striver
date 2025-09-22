package bMaths;

public class CPalindromeNum {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;  // negative numbers are never palindrome

        int dub = x;
        int rev = 0;

        while (dub != 0) {
            int lastDigit = dub % 10;

            // overflow check
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return false;
            }

            rev = rev * 10 + lastDigit;
            dub = dub / 10;
        }

        return x == rev;
    }

    public static void main(String args[]) {
        CPalindromeNum obj = new CPalindromeNum();

        System.out.println(obj.isPalindrome(121));   // true
        System.out.println(obj.isPalindrome(-121));  // false
        System.out.println(obj.isPalindrome(10));    // false
        System.out.println(obj.isPalindrome(0));     // true
    }
}
