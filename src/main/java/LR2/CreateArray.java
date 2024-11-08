package LR2;
import java.util.Scanner;

public class CreateArray {
    Scanner scanner;
    public int[][] createArray() {
        scanner = new Scanner(System.in);
        boolean correctMassive = false;
        int sX = 0;
        int sY = 0;
        while (!correctMassive) {
            System.out.print("enter width arraay less than 20: ");
            sX = scanner.nextInt();
            scanner.nextLine();

            System.out.print("enter height arraay less than 20: ");
            sY = scanner.nextInt();
            scanner.nextLine();
            correctMassive = sX < 20 && sY < 20 && sX > 0 && sY > 0;
        }

        System.out.print("enter random for random fill array: ");
        String checkRandom = scanner.nextLine();

        int[][] array;
        if(checkRandom.equals("random"))
            array = createRandomArray(sX, sY);
        else
            array = createManualArray(sX, sY);


        printArray(array);
        return array;
    }



    public int[][] createManualArray(int x, int y) {
        int[][] array = new int[x][y];
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                System.out.print("enter int value for [" + i +"]["+ j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }

    public int[][] createRandomArray(int x, int y) {
        int[][] array = new int[x][y];
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                array[i][j] = (int) (Math.random()*100);
            }
        }
        return array;
    }

    private void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
