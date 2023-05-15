package hw9;

public class Main{
    public static void main (String[] args){

        String[][] arr = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};

        try {
            ArrayValueCalculator calculator = new ArrayValueCalculator ();
            int result = calculator.doCalc (arr);
            System.out.println ("Result: " + result);
        } catch (ArraySizeException e) {
            System.out.println ("Array size is incorrect: " + e.getMessage ());
        } catch (ArrayDataException e) {
            System.out.println ("Invalid data found in array: " + e.getMessage ());
        }
    }
}

