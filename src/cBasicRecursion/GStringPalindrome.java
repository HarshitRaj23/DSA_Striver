package cBasicRecursion;

public class GStringPalindrome {

    // Recursive function to check if a string is palindrome
    boolean checkPalindrome(String str, int i, int n) {
        if (i >= n / 2) return true; // base case
        if (str.charAt(i) != str.charAt(n - i - 1)) return false;
        return checkPalindrome(str, i + 1, n);
    }

    public static void main(String[] args) {
        String str = "MADAM";

        GStringPalindrome obj = new GStringPalindrome();
        boolean result = obj.checkPalindrome(str, 0, str.length());

        System.out.println(str + " is Palindrome?  : " + result);
    }
}
