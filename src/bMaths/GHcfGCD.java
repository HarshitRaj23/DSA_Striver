package bMaths;

public class GHcfGCD {

    // Brute force method - TC O(min(a, b))
    int gcd(int a, int b) {
        int ans = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                ans = i;
            }
        }
        return ans;
    }

    // Euclidean Algorithm (Iterative) - O(log(min(a, b)))
    int EuclidAlgo(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) a = a % b;
            else b = b % a;
        }
        return (a == 0) ? b : a;
    }

    public static void main(String args[]) {
        GHcfGCD obj = new GHcfGCD();

        int a = 56, b = 98;

        System.out.println("GCD of " + a + " and " + b + " (Brute Force): " + obj.gcd(a, b));
        System.out.println("GCD of " + a + " and " + b + " (Euclid ): " + obj.EuclidAlgo(a, b));
    }
}
