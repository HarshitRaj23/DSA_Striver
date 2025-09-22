package cBasicRecursion;

public class BPrint1toN {
    void print1ToN(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print(i + " ");
        print1ToN(i + 1, n);
    }

    public static void main(String[] args) {
        int n = 10;
        BPrint1toN obj = new BPrint1toN();
        obj.print1ToN(1, n);
    }
}
