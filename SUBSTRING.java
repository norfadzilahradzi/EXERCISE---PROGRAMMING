
package LAB;

import java.util.Scanner;

public class SUBSTRING {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter substrings");
        String word1 = s.nextLine();
        String word2 = s.nextLine();
        String sentence;
        
        do {
            System.out.println("Enter a string (\"stop\" to stop) :");
            sentence = s.nextLine();
            
            if (sentence.toLowerCase().contains(word1)) 
                System.out.println(word1 + " found");
            
            if (sentence.toLowerCase().contains(word2)) 
                System.out.println(word2 + " found");
            
            
        } while(!(sentence.equals("Stop")));
    }
    
}
