package beloventseva.java.labs;

import java.util.Scanner;

public class Main {
    final static int MAX_RANDOM_VALUE = 50;
    final static int MIN_RANDOM_VALUE = -50;
    final static int INPUT_MATRIX = 1;
    final static int FINDING_MAX = 2;
    final static int FINDING_MIN = 3;
    final static int FINDING_AVERAGE = 4;
    final static int FINDING_GEOMETRIC = 5;
    final static int EXIT = 6;


    public static void main(String[] args) {
        int matrix[][] = null;
        int menuMode = INPUT_MATRIX;

        while (menuMode != EXIT){
            menuMode = printMenu();
            if(menuMode == INPUT_MATRIX){
                matrix = createMatrix();
            }
            if (matrix == null){
                System.out.println("Your matrix is empty! Please input matrix.");
            }
            switch (menuMode){
                case FINDING_MAX :{
                    System.out.println("Max matrix element: " + findMaxElement(matrix));
                    break;
                }
                case FINDING_MIN:{
                    System.out.println("Min matrix element: " + findMinElement(matrix));
                    break;
                }
                case FINDING_AVERAGE:{
                    System.out.println("The average of matrix: " + findAverage(matrix));
                    break;
                }
                case FINDING_GEOMETRIC:{
                    System.out.println("The geometric mean of matrix: " + findGeometricMean(matrix));
                    break;
                }
            }
            System.out.println();
        }
    }

    private static int printMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Mode:");
        System.out.println(INPUT_MATRIX + " Input matrix.");
        System.out.println(FINDING_MAX + " Find MAX element.");
        System.out.println(FINDING_MIN + " Find MIN element.");
        System.out.println(FINDING_AVERAGE + " Find average.");
        System.out.println(FINDING_GEOMETRIC + " Find geometric mean.");
        System.out.println(EXIT + " Exit");
        System.out.println("\nYour choice[1-6]:");
        int numMenu = scanner.nextInt();
        return numMenu;
    }

    private static int inputSizeOfMatrix(String nameOfInputNumber) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.printf("Input the number of matrix %s : ", nameOfInputNumber);
            number = scanner.nextInt();
            if (number > 0 && number <= 20) {
                return number;

            } else {
                System.out.print("Number must be between 0 and 20, please try again!\n\n");
            }
        } while (true);
    }

    private static int[][] createMatrix() {
        Scanner scanner = new Scanner(System.in);

        int cols = inputSizeOfMatrix("cols");
        int rows = inputSizeOfMatrix("rows");
        int[][] resultMatrix = new int[rows][cols];

        System.out.print("Fill in the matrix manually or randomly? [m|r]");
        boolean isManually = scanner.next().equals("m");

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                if (isManually) {
                    System.out.print("Input matrix element [" + i + "][" + j + "]: ");
                    resultMatrix[i][j] = scanner.nextInt();
                } else {
                    int random = (int) (Math.random() * (MAX_RANDOM_VALUE - MIN_RANDOM_VALUE) + MIN_RANDOM_VALUE);
                    System.out.print(" " + random);
                    resultMatrix[i][j] = random;
                }
            }
            System.out.println();
        }

        if (isManually){
            System.out.println("Your matrix: ");
            for (int i = 0; i < rows; ++i) {
                for (int j = 0; j < cols; ++j){
                    System.out.print(" " + resultMatrix[i][j]);
                }
                System.out.println();
            }
        }
        return resultMatrix;
    }

    private static int findMinElement(int[][] matrix) {
        int min = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if (min > matrix[i][j]){
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    private static int findMaxElement(int[][] matrix) {
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]){
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    private static int findAverage(int[][] matrix){
        int sum = 0;
        int counter = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                counter++;
            }
        }
        return sum/counter;
    }

    private static double findGeometricMean(int[][] matrix){
        int multi = 1;
        int counter = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                multi *= matrix[i][j];
                counter++;
            }
        }
        return Math.pow(multi, 1.0 / counter);
    }
}