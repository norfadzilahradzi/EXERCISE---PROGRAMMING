
package LAB;

import java.util.Random;

public class ARRAY2 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] num = new int[10];
        int flag = -1;
        int rand = 0;
        
        for (int i=0; i<num.length; i++) {
            do {
                flag = -1;
                rand = 0+r.nextInt(21);
                for (int j=0; j<i; j++) {
                    if (num[j] == rand)
                    flag = 1;
                }
            } while (flag == 1);
            num[i] = rand;
        }
        for (int i=0; i<num.length; i++) {
            System.out.print(num[i] + " ");
        }
        
    }
    
}
