/*  Demonstrates the if
    Call this program ifStatement.java
*/

class IfDemo {
    public static void main(String args[]) {
        int a, b, c;
        a = 2;
        b = 3;
        if (a < b) System.out.println("A is less than B");

        // the next line won't print anything

        c = a - b; // c contains the value -1
        System.out.println("C contains A - B which is -1");
        
        if (c >= 0) System.out.println("C is non-negative");
        if (c < 0) System.out.println("C is negative");
    }
}