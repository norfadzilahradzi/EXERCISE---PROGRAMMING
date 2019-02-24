
package EXERCISE;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Arrange_Array {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        
        Integer [] randNum = new Integer [20];
        System.out.println("A list of 20 random integer within 0 to 100");
        for (int i=0; i<20; i++) {
            randNum[i] = 0+r.nextInt(101);
            System.out.print(randNum[i] + ", ");
        }
        
        System.out.println("\nArray in descending order");
        Arrays.sort(randNum, Collections.reverseOrder());
        for (int i=0; i<20; i++) {
            System.out.print(randNum[i] + ", ");
        }
        
        System.out.println("\nEnter a number to search : ");
        int num = s.nextInt();
        System.out.println("Binary search - ");
        
    }
    
}
