/*
Day 29: Write a program that reads in a file and prints out the number of lines, words, and characters in the file.
*/

// Program
import java.util.Scanner;
import java.io.File;

public class Day29 {
    public static void main(String[] args) {
        // File file = new
        // File("D:\\Projects\\IODump\\IODumpChaitraChallenge\\Java\\Day0.java");
        // Scanner sc = new Scanner(file);

        // System.out.println(sc.next());

        // sc.close();

        try {
            File file = new File("D:\\Projects\\IODump\\IODumpChaitraChallenge\\Java\\Day0.java");
            Scanner sc = new Scanner(file);
            int linecnt = 0, wordcnt = 0, charcnt = 0;

            System.out.println("File Data Starts: ");
            // line counter
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
                linecnt++;

                String[] words = line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    if (words[i].length() > 0) {
                        wordcnt++;
                    }
                }

                charcnt += line.length();
            }

            System.out.println("File Data Ends!");

            System.out.println(
                    String.format("Given file has %d lines, %d words and %d characters.", linecnt, wordcnt, charcnt));
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

/*
 * 
 * File Data Starts:
 * // Template
 * // Question
 * 
 * // Program
 * public class Day0 {
 * public static void main(String[] args) {
 * System.out.println("IODumpChaitraChallenge");
 * }
 * }
 * 
 * // Input
 * 
 * // Output
 * File Data Ends!
 * Given file has 13 lines, 23 words and 163 characters.
 * 
 */