/**
 * SubstringExample.java    Author: Nikita Volodin (id: 127196)
 * CS151A,  Assignment 2 - Problem #3
 * This class reads string from input with one substring in brackets
 * and print string, print string in brackets, print last m random characters of
 * input string, print uppercased string without substring in brackets, and print
 * length of new line
 */
import java.util.Random;
import java.util.Scanner;

public class SubstringExample
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a sentence containing exactly one substring" +
                "enclosed in square brackets: ");
        String inputString = scan.nextLine();
        System.out.println();
        
        System.out.println("Sentence: " + inputString);
        
        String inBrackets = inputString.substring(inputString.indexOf('[') + 1,
                inputString.indexOf(']'));
        System.out.println("String in brackets: " + inBrackets);
        
        Random rnd = new Random();
        int m = rnd.nextInt(inputString.length());
        System.out.println(m + " last character(s) in the string: " +
                inputString.substring(inputString.length() - m, inputString.length()));
        
        String withoutBrackets = inputString.substring(0, inputString.indexOf('[')) +
                inputString.substring(inputString.indexOf(']') + 1, inputString.length());
        withoutBrackets = withoutBrackets.toUpperCase();
        System.out.println("Uppercased string with ommitted bracket part: " + withoutBrackets);
        System.out.println("Length of new string: " + withoutBrackets.length());
    }
}