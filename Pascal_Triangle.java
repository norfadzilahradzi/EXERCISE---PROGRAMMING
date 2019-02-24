
package EXERCISE;

import java.util.Scanner;

public class Pascal_Triangle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate : ");
        int num = s.nextInt();
        System.out.println("The Pascal Triangle with " + num + " row(s)");
        
        int [][] pascal = new int [num][num];
        
        for (int i=0; i<num; i++) {
            for (int j=0; j<num; j++) {
                if (j == 0) {
                    pascal [i][0] = 1; 
                    System.out.print(pascal [0][0] + " ");
                }
                if (j > i) {
                    pascal [i][j] = 0;
                }
                if (j != 0 && i != 0) {
                    pascal [i][j] = pascal [i-1][j-1] + pascal [i-1][j];
                    System.out.print(pascal [i][j] + " ");
                }
            } System.out.println("");
        }
    }
    
}
