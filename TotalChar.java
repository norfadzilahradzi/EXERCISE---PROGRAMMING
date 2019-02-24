
package Q3;

import java.io.FileInputStream;
import java.util.Scanner;

public class LAB {

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new FileInputStream("input.txt"));
            int totalWord = 0, totalChar = 0, totalUpper = 0, totalDigit = 0,totalLower = 0, totalAlpha = 0;
            while (s.hasNextLine()) {
                String input = s.next();
                totalWord++;
                totalChar += input.length();
                
                for (int i=0; i<input.length(); i++) {
                    if (Character.isLowerCase(input.charAt(i))) {
                        totalLower++;
                    }
                    
                    else if (Character.isUpperCase(input.charAt(i))) {
                        totalUpper++;
                    }
                    
                    else if (!(Character.isUpperCase(input.charAt(i))) && Character.isLowerCase(input.charAt(i)) && Character.isDigit(input.charAt(i)) ) {
                        totalAlpha++;
                    }
                    else if (Character.isDigit(input.charAt(i))) {
                        totalDigit++;
                    }
                }
            }
            System.out.println("Total Characters : " + totalChar);
            System.out.println("Total words : " + totalWord);
            System.out.println("Total uppercase : " + totalUpper);
            System.out.println("Total Lowercase : " + totalLower);
            System.out.println("Total non alphabetic : " + totalAlpha);
            System.out.println("Total digit : " + totalDigit);
       
        } catch (Exception e) {
            System.out.print("File Not Found");
        }
    }
    
}
