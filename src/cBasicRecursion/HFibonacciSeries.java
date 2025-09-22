package cBasicRecursion;

public class HFibonacciSeries {

    // Recursive function to calculate nth Fibonacci number
    int fibonacci(int n) {
        if (n <= 1) return n;  // base case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        HFibonacciSeries obj = new HFibonacciSeries();

        int n = 10;
        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 0; i < n; i++) {
            System.out.print(obj.fibonacci(i) + " ");
        }
    }
}
