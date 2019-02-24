
package Q3;

import java.util.Random;
import java.util.Scanner;

public class T15 {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of random integer : ");
        int num = s.nextInt();
        
        int[] randNum = new int[num];
        for (int i=0; i<randNum.length; i++) {
            randNum[i] = 0+r.nextInt(1001);
        }
        
        System.out.print("The random integer : ");
        display(randNum);
        System.out.println();
        
        System.out.print("Maximum number : ");
        maxNum(randNum);
        System.out.println();
        
        System.out.print("The approximation of the integer to the nearest tenth : ");
        roundOff(randNum);
        System.out.println();
        
        System.out.print("The random integer in reverse order : ");
        reverse(randNum);
    }
    
    public static void display(int[] a) {
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        
    }
    
    public static void maxNum(int[] a) {
        for (int i=0; i<a.length; i++) {
            int max = a[0];
            if ( a[i] > max) {
                max = a[i];
                System.out.print(max);
            }
        }
    }
    
    public static void roundOff(int[] a) {
        for (int i=0; i<a.length; i++) {
            int total;
            if (a[i] % 10 >= 5) {
                total = a[i] + (10 - a[i] % 10);
            }
            else {
                total = a[i] - a[i] % 10;
            }
            System.out.print(total + "  ");
        }
    }
    
    public static void reverse(int[] a) {
        for (int i=0; i<a.length; i++) {
            while (a[i] != 0) {
                int temp = a[i] % 10;
                a[i] = a[i] / 10;
                System.out.print(temp);
            }
            System.out.print("  ");
        } 
    }
}
