
package Q3;

import java.util.Random;
import java.util.Scanner;

public class T16 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter the number of random integer : ");
        int num = s.nextInt();
        
        int[] randNum = new int[num];
        for (int i=0; i<randNum.length; i++) {
            randNum[i] = 0+r.nextInt(10001);
        }
        
        System.out.print("The random integer : ");
        display(randNum);
        
        System.out.println();
        System.out.print("Minimum number : ");
        minNum(randNum);
        
        System.out.print("The approximatiion of the integer to the nearest hundred : ");
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
    
    public static void minNum(int[] a) {
        for (int i=0; i<a.length; i++) {
            int min = a[0];
            if (a[i] < min) {
                min = a[i];
                System.out.println(min);
            }
        }
    }
    
    public static void roundOff(int[] a) {
        for (int i=0; i<a.length; i++) {
            int answer;
            int div = (a[i]/10)%10;
            if (div >= 5) {
                answer = a[i] + (100 - a[i] % 100);
            }
            else {
                answer = a[i] - a[i]%100;
            }
            System.out.print(answer + "  ");
        }
    }
    
    public static void reverse(int[] a) {
        for (int i=0; i<a.length; i++) {
            while (a[i] != 0) {
                int temp = a[i]%10;
                a[i] = a[i]/10;
                System.out.print(temp);
            }
            System.out.print("  ");
        }
    }
    
    
}
