
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Golf.java        Author: Nikita Volodin (127196)
 * CS151A,          Assignment 5 - Problem #2
 * Programming project 5.13 page 265
 * 
 * This program reads from file (with 18 lines, each with 5 numbers) 
 * the pars for this hole and pars for each golfer
 * and outputs winner and scores for every golfer for each hole
 */
public class Golf {
    
    /**
     * 
     * @param args Command line arguments
     */
    public static void main(String [] args) throws Exception {
        Scanner scan = new Scanner(new File("input.txt"));
        final int LINES = 18;
        final int PLAYERS = 4;
        
        //0 row is for par
        //in the 0 line of array we collect sums
        //in all other line we collect player's strokes in each hole
        int[][] table = new int[LINES + 1][PLAYERS + 1];
        
        ArrayList<Integer> totals = new ArrayList<Integer>();
        
        for (int player = 0; player < PLAYERS + 1; player++) {
            table[0][player] = 0;
        }
        
        for (int line = 1; line < LINES + 1; line++) {
            int currentPar = scan.nextInt();
            table[0][0] += currentPar;
            table[line][0] = currentPar;
            for (int player = 1; player < PLAYERS + 1; player++) {
                int playerPar = scan.nextInt();
                table [0][player] += playerPar;
                table [line][player] = playerPar;
            }
        }
        
        //looking for a minimum value of all sums
        int min = table[0][1];
        totals.add(1);
        for (int i = 2; i < PLAYERS + 1; i++) {
            if (table[0][i] < min) {
                totals.clear();
                totals.add(i);
                min = table[0][i];
            } else if (table[0][i] == min) {
                totals.add(i);
            }
        }
        
        //print results
        System.out.println("Results:");
        System.out.println("Hole\tPar\tP1\tP2\tP3\tP4");
        
        for (int line = 1; line <= LINES; line++) {
            System.out.print(line + "\t" + table[line][0] + "\t");
            for (int player = 1; player <= PLAYERS; player++) {
                System.out.print(table[line][player] + " [" + (table[line][player] - table[line][0]) + "]\t");
            }
            System.out.println();
        }
        
        //print totals
        System.out.print("Totals\t" + table[0][0] + "\t");
        for (int player = 1; player <= PLAYERS; player++) {
            System.out.print(table[0][player] + "[" + (table[0][player] - table[0][0]) + "]\t");
        }
        System.out.println();
        
        //print winner
        if (totals.size() == 1) {
            System.out.println("Winner is a guy #" + totals.get(0) + " with a score " + table[0][totals.get(0)]);
        } else if (totals.size() > 1) {
            System.out.println("It's a tie between: ");
            for (int i = 0; i < totals.size(); i++) {
                System.out.println("Guy #" + totals.get(i) + " with a score " + table[0][totals.get(i)]);
            }
        }
    }
}
