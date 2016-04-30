// Chapter 1 Self-Test 1.2

class InchToMeter{
    public static void main(String args[]){
        double inch, meter;
        int counter;
        double conversion;

        counter = 0;
        meter = 39.37;

        for(inch = 0, counter = 0; inch <= 472.44; inch++) {

            System.out.println("Current number of inches: " + inch);
            conversion = inch / meter;
            System.out.println("Here is the conversion from inches to meters: " + conversion);
            counter++;
        
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}