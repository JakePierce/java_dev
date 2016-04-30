public class MyFilter {
    public static void main (String [] args) {
        int[] j = {1,2,3,4};

        for(int i = 0; i < j.length; i++){
            if(j[i] % 2 == 0){
                System.out.println(j[i]);
            }
        }
    }
}