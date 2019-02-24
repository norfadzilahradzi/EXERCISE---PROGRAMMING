
package EXERCISE;

import java.util.Random;

public class Tranpose {

    public static void main(String[] args) {
        Random r = new Random();
        
        int [][] matrix = new int[3][3];
        
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                matrix [i][j] = 0+r.nextInt(10);
            }
        }
        
        System.out.println("Matrix");
        display(matrix);
        System.out.println("\nTranpose");
        tranpose(matrix);

    }
    
    public static void display(int [][] a) {
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(a [i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void tranpose (int [][] a) {
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                int [][] tran = new int [3][3];
                tran [i][j] = a [j][i];
                System.out.print(tran[i][j] + " ");
            }
            System.out.println("");
    }
    
    }
}
