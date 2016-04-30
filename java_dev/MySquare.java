public class MySquare {
    public static void main (String []args) {
        //This program will give an array of size 10 that has perfect squares and then sum those perfect squares.
        int[] j = new int [10];
        for(int i = 0; i < j.length; i++){
            j[i] = (i+1)*(i+1);
        }
        int sum = 0;
        for(int i = 0; i < j.length; i++) {
            sum += j[i];
        }
        System.out.println("This is the square of your summation: " + sum);
    }
}