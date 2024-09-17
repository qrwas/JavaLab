package org.example;
import java.util.Scanner;

public class LabTwo {
    Scanner scanner;
    public int[][] StartLab2() {
        scanner = new Scanner(System.in);
        boolean correctMassive = false;
        int sX = 0;
        int sY = 0;
        while (!correctMassive) {
            System.out.print("Введіть ширину масиву не більше 20: ");
            sX = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Введіть висоту масиву не більше 20: ");
            sY = scanner.nextInt();
            scanner.nextLine();
            correctMassive = sX < 20 && sY < 20 && sX > 0 && sY > 0;
        }

        System.out.print("Введіть random для рандомного заповнення матриці: ");
        String checkRandom = scanner.nextLine();

        int[][] array;
        if(checkRandom.equals("random"))
            array = CreateRandomArray(sX, sY);
        else
            array = CreateManualArray(sX, sY);


        PrintArray(array);
        FindMin
        return array;
    }



    public int[][] CreateManualArray(int x, int y) {
        int[][] array = new int[x][y];
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                System.out.print("Введіть int значення для [" + i +"]["+ j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }

    public int[][] CreateRandomArray(int x, int y) {
        int[][] array = new int[x][y];
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                array[i][j] = (int) (Math.random()*100);
            }
        }
        return array;
    }

    private void PrintArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
