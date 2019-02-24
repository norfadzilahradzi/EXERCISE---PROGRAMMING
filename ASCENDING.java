
package LAB;

import java.util.Random;
import java.util.Scanner;

public class ASCENDING {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int[] randNum = new int[5];
        
        for (int i=0; i<randNum.length; i++) {
            randNum[i] = 0+r.nextInt(101);
        }
        
        System.out.println("Random numbers");
        for (int i=0; i<randNum.length; i++) {
            System.out.print(randNum[i] + " ");
        }
        System.out.println();
        
        for (int i=0; i<randNum.length-1; i++) {
            for (int j=0; j<randNum.length-1; j++) {
                if (randNum[j] > randNum[j+1]) {
                    int temp = randNum[j];
                    randNum[j] = randNum[j+1];
                    randNum[j+1] = temp;
                }
            }
        }
        
        System.out.println("Sorted random numbers");
        for (int i=0; i<randNum.length; i++) {
            System.out.print(randNum[i] + " ");
        }
        System.out.println();
        System.out.print("Enter a number to search : ");
        int num = s.nextInt();
        
        int middle, low = 0, high = randNum.length-1;
        while (low <= high) {
            middle = (low + high) / 2;
            if (num == randNum[middle]) {
                System.out.println("Found : Index - " + middle);
                break;
            }
            else if (num < randNum[middle]) {
                high = middle - 1;
            }
            else {
                low = middle + 1;
            }
    }
    
    }
}
