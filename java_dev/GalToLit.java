/*  Try This 1-1
    This program converts gallons to liters.
    Call this program GalToLit.java
*/

class GaltoLit {
    public static void main(String args[]){
        double gallons; // holds the number of gallons
        double liters; // holds the number of liters

        gallons = 15; // start with 15 gallons
        liters = gallons * 3.7854; // converts gallons into liters

        System.out.println(gallons + " gallons is " + liters + " liters");
    }
}