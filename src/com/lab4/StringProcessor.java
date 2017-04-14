package com.lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 * Represents methods to sort words by alphabet
 */
public class StringProcessor {

    /**
     * Initializing variables
     */
    public static String s;
    public static String[] words;

    /**
     * Calls methods
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        StringProcessor processor = new StringProcessor();
        processor.readInputText();
        processor.processText();
        processor.showResult();
    }

    /**
     * Reads sentence from console
     * @throws IOException
     */
    public  void readInputText() throws IOException {

            /* Read the text from keyboard */
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter String : ");
            s = new String(reader.readLine());

            /* If line is empty exception */
            try {
                if (s.isEmpty()) {
                    throw new Exception("Error!");
                }
            }
            catch (Exception e) {
                System.out.println("Your string must be not empty !");
            }
        }

    /**
     * Sorts words by alphabet
     */
    public  void processText() {

        /*Split string into separate words by space-symbol */
        words = s.split("\\s+");

        /*Sort words by alphabet*/
        Arrays.sort(words);
    }

    /**
     * Outputs words in aplhabetical order in console
     */
    public  void showResult() {
        for (String word: words) {
            System.out.println(word);
        }
    }
}

