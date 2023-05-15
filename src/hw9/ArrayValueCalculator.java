package hw9;

import java.util.Arrays;

public class ArrayValueCalculator {


    public static int doCalc (String[][] arr) throws ArraySizeException, ArrayDataException {

        if (arr.length != 4 || Arrays.stream (arr).anyMatch (row -> row.length != 4)){
            throw new ArraySizeException ("The input array must be of size 4x4");
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
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
