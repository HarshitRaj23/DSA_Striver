package aPattern;

import java.util.Scanner;

public class Pattern {

    // 1. Solid Square of '*'
    /*
    Input: n = 4
    Output:
    ****
    ****
    ****
    ****
    */
    void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 2. Special Number Pattern (Incrementing numbers in triangle)
    /*
    Input: n = 4
    Output:
    1
    1 2
    1 2 3
    1 2 3 4
    */
    void printSpecialNumberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 3. Reverse Special Number Pattern
    /*
    Input: n = 4
    Output:
    1 2 3 4
    1 2 3
    1 2
    1
    */
    void printSpecialNumberPatternRev(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 4. Repeating Row Number Triangle
    /*
    Input: n = 4
    Output:
    1
    2 2
    3 3 3
    4 4 4 4
    */
    void printRepeatingRowNumberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // 5. Left-aligned right-angled triangle
    /*
    Input: n = 4
    Output:
    *
    **
    ***
    ****
    */
    void printLeftAlignedTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 6. Inverted left-aligned triangle
    /*
    Input: n = 4
    Output:
    ****
    ***
    **
    *
    */
    void printInvertedLeftAlignedTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 7. Centered Pyramid pattern
    /*
    Input: n = 4
    Output:
       *
      ***
     *****
    *******
    */
    void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 8. Inverted Pyramid Pattern
    /*
    Input: n = 4
    Output:
    *******
     *****
      ***
       *
    */
    void printInvertedPyramid(int n) {
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 9. Diamond Pattern
    /*
    Input: n = 4
    Output:
       *
      ***
     *****
    *******
    *******
     *****
      ***
       *
    */
    void printDiamond(int n) {
        // Upper half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 10. Hourglass / Vertical Diamond Pattern
    /*
    Input: n = 4
    Output:
    *
    **
    ***
    ****
    ***
    **
    *
    */
    void pattern10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = (i <= n) ? i : (2 * n - i);
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern11(int n){
        int start =1;
        for (int i=0;i<n;i++){
            if(i%2==0)start =1;
            else start=0;
            for(int j=0; j<=i;j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
        
    }

    /*
     * Pattern12 for n = 5
     *
     * 1        1
     * 12      21
     * 123    321
     * 1234  4321
     * 1234554321
     *
     */
     void pattern12(int n) {

        for (int i = 1; i <= n; i++) {

            // Left side numbers (1 to i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Middle spaces (2 * (n - i))
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right side numbers (i down to 1)
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Move to next line after each row
            System.out.println();
        }
    }

     void pattern13(int n){
        int count =1;
        for(int i=1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(count + "  ");
                count++;
            }
            System.out.println();
        }
    }

     void pattern14(int n){
        for(int i=0; i<n; i++){
            for(char ch= 'A'; ch <= 'A'+i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

     void pattern15(int n){
        for(int i=0; i<n; i++){
            for(char ch= 'A'; ch <= 'A'+ (n-i-1); ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    void pattern16(int n){
         for(int i=0; i<n;i++){
             char ch = (char) ('A' + i);
             for(int j=0; j<=i; j++){
                 System.out.print(ch);
             }
             System.out.println();
         }
    }

    /*
     * Pattern17 for n = 5
     *
     *     A
     *    ABA
     *   ABCBA
     *  ABCDCBA
     * ABCDEDCBA
     *
     */
    void pattern17(int n) {
        for (int i = 0; i < n; i++) {

            // Leading spaces
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }

            // Characters
            char ch = 'A';
            for (int j = 0; j < (2 * i + 1); j++) {
                if (j < (2 * i + 1) / 2) {
                    System.out.print(ch);
                    ch++;
                } else {
                    System.out.print(ch);
                    ch--;
                }
            }

            // Trailing spaces
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + (n - i - 1));
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(ch + j));
            }

            System.out.println();
        }
    }

    static void pattern19(int N) {
        int iniS = 0;

        // Upper half
        for (int i = 0; i < N; i++) {
            // Left stars
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }

            iniS += 2;
            System.out.println();
        }

        // Lower half
        iniS = 2 * N - 2;
        for (int i = 1; i <= N; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            iniS -= 2;
            System.out.println();
        }
    }

    static void pattern20(int n)
    {
        // initialising the spaces.
        int spaces = 2*n-2;

        // Outer loop for printing row.
        for(int i = 1;i<=2*n-1;i++){

            // stars for first half
            int stars = i;

            // stars for the second half.
            if(i>n) stars = 2*n - i;

            //for printing the stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }

            //for printing the spaces
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }

            //for printing the stars
            for(int j = 1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) spaces -=2;
            else spaces +=2;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();

        Pattern p = new Pattern();

        System.out.println("\n1. Solid Square:");
        p.pattern1(n);

        System.out.println("\n2. Special Number Pattern:");
        p.printSpecialNumberPattern(n);

        System.out.println("\n3. Reverse Special Number Pattern:");
        p.printSpecialNumberPatternRev(n);

        System.out.println("\n4. Repeating Row Number Triangle:");
        p.printRepeatingRowNumberTriangle(n);

        System.out.println("\n5. Left-aligned Triangle:");
        p.printLeftAlignedTriangle(n);

        System.out.println("\n6. Inverted Left-aligned Triangle:");
        p.printInvertedLeftAlignedTriangle(n);

        System.out.println("\n7. Centered Pyramid:");
        p.printPyramid(n);

        System.out.println("\n8. Inverted Pyramid:");
        p.printInvertedPyramid(n);

        System.out.println("\n9. Diamond Pattern:");
        p.printDiamond(n);

        System.out.println("\n10. Hourglass Pattern:");
        p.pattern10(n);


        System.out.println("\n11.  Pattern:");
        p.pattern11(n);

        System.out.println("\n12.  Pattern:");
        p.pattern12(n);
        System.out.println("\n13.  Pattern:");
        p.pattern13(n);

        System.out.println("\n14.  Pattern:");
        p.pattern14(n);


        System.out.println("\n15.  Pattern:");
        p.pattern15(n);

        System.out.println("\n16.  Pattern:");
        p.pattern16(n);

        System.out.println("\n17.  Pattern:");
        p.pattern17(n);
        System.out.println("\n18.  Pattern:");
        p.pattern18(n);
        sc.close();
    }
}
