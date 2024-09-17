package org.example;

public class ArrayUtility {
    public void FindMinValue(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.print("мінімальне значення: " + min + "\n");
    }

    public void FindMaxValue(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.print("максимальне значення: " + max + "\n");
    }

    public void FindArithmeticMean(int[][] arr) {
        int countElement = 0;
        int sumAllElements = 0;
        for (int i = 0; i < arr.length; i++) {
            countElement += arr[i].length;
            for (int j = 0; j < arr[i].length; j++) {
                sumAllElements += arr[i][j];
            }
        }
        float result = (float) sumAllElements / countElement;
        System.out.print("Середнє арифметичне значення: " + result + "\n");
    }
}
