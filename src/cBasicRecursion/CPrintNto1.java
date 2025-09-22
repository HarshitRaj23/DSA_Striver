package cBasicRecursion;

public class CPrintNto1 {
    void printNto1(int i, int n){
        if(i < 1)return;
        System.out.print(i + " ");
        printNto1(i-1, n);
    }

    public static void main(String[] args) {
        int n = 10;
        CPrintNto1 obj = new CPrintNto1();
        obj.printNto1(n,n);
    }

}
