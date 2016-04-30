/*  Try this 2-1
    Title this Sound.java
*/

class Sound {
    public static void main(String args[]) {
        int sound = 1100;
        double time = 7.2;
        double dist = sound * time;

        System.out.println("The lightning is " + dist + " feet away.");

        double echo = dist / 2;

        System.out.println("The echo is calculated at: " + echo + " seconds away.");

    }
}