
package EXERCISE;

import java.util.Random;
import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter N : ");
        int num = s.nextInt();
        
        int [][] firMatrix = new int [num][num];
        int [][] secMatrix = new int [num] [num];
        
        for (int i=0; i<num; i++) {
            for (int j=0; j<num; j++) {
                firMatrix [i][j] = 0+r.nextInt(10);
            }
        }
        
        for (int i=0; i<num; i++) {
            for (int j=0; j<num; j++) {
                secMatrix [i][j] = 0+r.nextInt(10);
            }
    }
        
        display (num, firMatrix, secMatrix);
        System.out.println("\nSum of matrices");
        add(num, firMatrix, secMatrix);
        
        System.out.println("\nMultiply of matrices");
        multiply(num, firMatrix, secMatrix);
    }
    
    public static void display (int num, int[][] a, int[][] b) {
        System.out.println("Matrix A");
        for (int i=0; i<num; i++) {
            for (int j=0; j<num; j++) {
                System.out.print(a [i][j] + " ");
            }
            System.out.println("");
            }
        
        System.out.println("\nMatrix B");
        for (int i=0; i<num; i++) {
            for (int j=0; j<num; j++) {
                System.out.print(b [i][j] + " ");
            }
            System.out.println("");
            }
    }
    
    public static void add (int num, int[][] a, int[][] b) {
        int[][] sum = new int [num][num];
        for (int i=0; i<num; i++) {
            for (int j=0; j<num; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum [i][j] + " ");
            }
        System.out.println("");
        }
    }
    
    public static void multiply (int num, int[][] a, int[][] b) {
        int[][] mul = new int [num][num];
        for (int i=0; i<num; i++) {
            for (int j=0; j<num; j++) {
                mul[i][j] = a[i][j] * b[i][j];
                System.out.print(mul [i][j] + " ");
            }
        System.out.println("");
        }
    }
    
}
