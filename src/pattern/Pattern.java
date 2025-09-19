package pattern;

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

        p.pattern11(n);
        sc.close();
    }
}
