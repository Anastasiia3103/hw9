package hw9;

import static hw9.ArrayValueCalculator.doCalc;

public class Main{
    public static void main(String[] args) {

        String[][] arr = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};

        try {
            int result = doCalc(arr);
            System.out.println("The sum of the values in the array is: " + result);
        } catch (ArraySizeException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (ArrayDataException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

