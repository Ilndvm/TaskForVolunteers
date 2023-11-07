public class ArrayTaskForVolunteers {
    public static void main(String[] args) {
//        int[] givenArray = {3, 2, -2, 5, -3};
//        int[] givenArray = {1, 1, 2, -1, 2, -1};
//        int[] givenArray = {1, 2, 3, -4};
        int[] givenArray = {1, 1};
        int[] arrayOfAbsolute = new int[givenArray.length];
        int max=0;

        for (int i=0; i<(givenArray.length-1); i++) {
            for (int j=1; j<=(givenArray.length-(i+1)); j++) {
                if (givenArray[i]==(-givenArray[i+j])) {
                    arrayOfAbsolute[i]=givenArray[i];
                }
            }
        }
        for (int i=0; i<arrayOfAbsolute.length; i++){
            if (arrayOfAbsolute[i]>max) {
                max=arrayOfAbsolute[i];
            }
        }

        if (max>0) {
            System.out.println("The highest pair of absolute numbers: " + max + " and " + (-max));
        }
        else {
            System.out.println("Lack of pair");
        }
    }
}