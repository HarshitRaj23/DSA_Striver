package bMaths;

public class DArmstrongNum {
    boolean armstrongNumber(int n) {
        int dub  = n;
        int sum = 0;
        while(dub > 0){
            int lastDigit = dub % 10;
            sum = sum + (lastDigit * lastDigit * lastDigit);
            dub = dub / 10;
        }
        return n == sum;
    }

    public static void main(String args[]){
        DArmstrongNum obj = new DArmstrongNum();

        int num = 153; // Example input
        if(obj.armstrongNumber(num)){
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }

        // Try another number
        num = 123;
        if(obj.armstrongNumber(num)){
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
    }
}
