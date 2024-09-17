package org.example;
public class Main {
    public static void main(String[] args) {
        int array[][];
        CreateArray createArray = new CreateArray();
        array = createArray.CreateArray();

        ArrayUtility arrayUtility = new ArrayUtility();

        arrayUtility.FindMinValue(array);
        arrayUtility.FindMaxValue(array);
        arrayUtility.FindArithmeticMean(array);
        arrayUtility.FindGeometricMean(array);
    }
}