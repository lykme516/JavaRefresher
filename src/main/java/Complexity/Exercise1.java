package Complexity;

public class Exercise1 {

    /**
     * O(n) is O(n + 100) which approximates to O(n)
     */
    public static void twoForLoops(int n) {

        for (int i = 0; i < n; i++) {
            System.out.println("Printing: " + i);
        }
        for (int i=0; i < 100; i++) {
            System.out.println("Printing: " + i);
        }
    }

    /**
     * Runtime complexity is O(n + m)
     */
    public static void twoForLoopsNM(int n, int m){
        for (int i = 0; i < n; i++) {
            System.out.println("Printing: " + i);
        }
        for (int i = 0; i < m; i++) {
            System.out.println("Printing: " + i);
        }
    }

    /**
     * Runtime complexity is O(n * m)
     */
    public static void twoForLoopsNAndM(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; i < m; i++) {
                System.out.println("Printing: " + (i * j));
            }
        }
    }

    public static void twoForLoopsNestedAndNonNested(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(String.format("Product of %s and %s is %s", i, j, i * j));
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Printing: " + i);
        }
    }

    public static void twoForLoopsNotCompletelyStraightforward(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > n / 2; j--) {
                System.out.println(String.format("Value of i: %s j: %s", i, j));
            }
        }
    }

    public static void doublingLoopVariable(int n) {
        for (int i = 1; i < n;) {
            System.out.println("Value of i is: " + i);
            i = i * 2;
        }
    }

    public static void halvingLoopVariable(int n) {
        for (int i = n; i > 0;) {
            System.out.println("Value of i is: " + i);
            i = i / 2;
        }
    }

//    public static void main(String[] args){
//
//    }

}
