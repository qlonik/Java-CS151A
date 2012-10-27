
import com.sun.xml.internal.fastinfoset.algorithm.BuiltInEncodingAlgorithm;
import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * CheckFIle.java
 * @author Nikita Volodin
 */
public class CheckFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("Beowulf_Gutenberg.txt"));
//        Scanner file = new Scanner(new File("Gunpowder.txt"));
//        Scanner file = new Scanner(new File("Holmes.txt"));
        int sum = 0, totalWords = 0;
        
        while (file.hasNext()) {
//            String line_from_file = file.nextLine();
//            Scanner line = new Scanner(line_from_file);
//            
//            while (line.hasNext()) {
//                String word = line.next();
            
                String word = file.next();
                String sanitizedString = sanitize(word);

                //int length = 0;
               // while (length < sanitizedString.length() && !(sanitizedString.charAt(length) <= '9' && sanitizedString.charAt(length) >= '0')) {
               //     length++;
               // }

                if (sanitizedString.length() > 0) {
                    sum += sanitizedString.length();
                    totalWords++;
                }
                System.out.println(sanitizedString);
//            }
            
        }
        
        if (totalWords > 0) {
            DecimalFormat fmt = new DecimalFormat("0.#");
            System.out.println("Total words: " + totalWords);
            System.out.println("Total chars: " + sum);
            System.out.println("Average word: " + fmt.format((double)sum / totalWords));
        } else {
            System.out.println("There is no words");
        }
    }
    
    /**
     * Method removes all not alphabetic symbols
     * @param inputString String with removable symbols
     * @return Sanitized string
     */
    private static String sanitize(String inputString) {
        String result = "";
        
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.toUpperCase(inputString.charAt(i)) >= 'A' &&
                    Character.toUpperCase(inputString.charAt(i)) <= 'Z') {
                result += inputString.charAt(i);
            }
        }
      
        return result;
    }
}
