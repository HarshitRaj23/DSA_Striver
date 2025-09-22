package bMaths;

public class FCheckPrime {
    boolean prime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    boolean prime2(int n){
        int count =0;
        for(int i=1; i*i <= n; i++){
            if(n%i == 0){
                count++;
                if(n/i != i){
                    count++;
                }
            }
        }
        return count == 2;
    }

    public static void main(String args[]) {
        FCheckPrime obj = new FCheckPrime();

        int num = 3;
        if (obj.prime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is NOT a prime number.");
        }
    }
}
