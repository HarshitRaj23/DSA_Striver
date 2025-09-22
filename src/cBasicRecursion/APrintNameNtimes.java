package cBasicRecursion;

import java.util.Scanner;

public class APrintNameNtimes {

    void printNtime(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Harshit");
        printNtime(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many times you want to print: ");
        int n = sc.nextInt();

        APrintNameNtimes obj = new APrintNameNtimes();
        obj.printNtime(1, n);

        sc.close();
    }
}
