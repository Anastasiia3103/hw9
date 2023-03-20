package hw9;

public class ArrayValueCalculator{


    public static int doCalc ( String[][] arr ) throws ArraySizeException, ArrayDataException{
        // Check the size of the array
        if (arr.length != 4 || arr[0].length != 4) {
            throw new ArraySizeException ("The input array must be of size 4x4");
        }

        int sum = 0;

        // Go through all the elements of the array and sum up their integer values
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    sum += Integer.parseInt (arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException ("Invalid data found in cell [" + i + "][" + j + "]: " + arr[i][j]);
                }
            }
        }

        return sum;
    }
}
