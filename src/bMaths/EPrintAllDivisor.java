package bMaths;

import java.util.ArrayList;
import java.util.Collections;

public class EPrintAllDivisor {

    //TC -> O(srt(n) + O(Nlog(N) )
    public static ArrayList<Integer> findDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();

        // O(srt(n) -> TC
        for (int i = 1; i * i <= n; ++i) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }

        // O( Nlog(N) ) -> N is no of factors
        Collections.sort(divisors);
        return divisors;
    }

    public static void main(String[] args) {
        int number = 36;
        ArrayList<Integer> divisors = findDivisors(number);

        System.out.println("Divisors of " + number + " are:");
        for (int d : divisors) {
            System.out.print(d + " ");
        }
    }
}
