
package LAB;

import java.util.Random;
import java.util.Scanner;

public class ARRAY {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        final int MAX=101, SIZE=10;
        
        int[] num = new int[SIZE];
        for(int i=0; i<num.length; i++) {
            num[i] = r.nextInt(MAX);            
        }
        
        System.out.print("The random numbers are : " );
        for(int i=0; i<num.length; i++) {
            System.out.print(num[i] + " ");            
        }
        System.out.println();        
        
        for(int i=0; i<num.length-1; i++) {
            for(int j=0; j<num.length-1; j++) {
                if (num[j]>num[j+1]) {
                    int a = num[j];
                    num[j] = num[j+1];
                    num[j+1] = a;
                }
            }
        } 
        System.out.print("The sorted random numbers are : " );        
        for(int i=0; i<num.length; i++) {
            System.out.print(num[i] + " ");            
        }
        System.out.println();
    
}
}
