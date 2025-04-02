package org.pototskyi.lab2;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class lab2 {

    static final int MIN_RANDOM = -50;
    static final int MAX_RANDOM = 51;
    static Scanner cin;
    static Random random;

    public lab2() {
    }

    public static void start() {
        int rows = 0;
        int cols = 0;
        System.out.print("Кількість рядків матриці: ");
        rows = cin.nextInt();
        System.out.print("Кількість стовпців матриці: ");
        cols = cin.nextInt();
        rows = rows > 20 ? 20 : rows;
        cols = cols > 20 ? 20 : cols;
        System.out.print("Хочете ввести матрицю вручну? [y/n]: ");
        int[][] matr;
        if (cin.next().equals("y")) {
            matr = manualInit(rows, cols);
        } else {
            matr = randomInit(rows, cols);
        }

        print(matr);
        System.out.println("Мінімальне значення матриці = " + min(matr));
        System.out.println("Максимальне значення матриці = " + max(matr));
        System.out.println("Середнє значення матриці = " + avg(matr));
    }

    private static int[][] randomInit(int rows, int cols) {
        int[][] matr = new int[rows][cols];

        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < cols; ++j) {
                matr[i][j] = random.nextInt(-50, 51);
            }
        }

        return matr;
    }

    private static int[][] manualInit(int rows, int cols) {
        int[][] matr = new int[rows][cols];

        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < cols; ++j) {
                matr[i][j] = cin.nextInt();
            }
        }

        return matr;
    }

    private static void print(int[][] matr) {
        for(int i = 0; i < matr.length; ++i) {
            for(int j = 0; j < matr[i].length; ++j) {
                PrintStream var10000 = System.out;
                String var10001 = " ".repeat(5 - Integer.toString(matr[i][j]).length());
                var10000.print(var10001 + matr[i][j]);
            }

            System.out.println();
        }

    }

    private static int min(int[][] matr) {
        int min = matr[0][0];

        for(int i = 0; i < matr.length; ++i) {
            for(int j = 0; j < matr[i].length; ++j) {
                if (min > matr[i][j]) {
                    min = matr[i][j];
                }
            }
        }

        return min;
    }

    private static int max(int[][] matr) {
        int max = matr[0][0];

        for(int i = 0; i < matr.length; ++i) {
            for(int j = 0; j < matr[i].length; ++j) {
                if (max < matr[i][j]) {
                    max = matr[i][j];
                }
            }
        }

        return max;
    }

    private static double avg(int[][] matr) {
        int sum = 0;

        for(int i = 0; i < matr.length; ++i) {
            for(int j = 0; j < matr[i].length; ++j) {
                sum += matr[i][j];
            }
        }

        double avg = (double)sum / (double)(matr.length * matr[0].length);
        return avg;
    }

    static {
        cin = new Scanner(System.in);
        random = new Random();
    }
}
