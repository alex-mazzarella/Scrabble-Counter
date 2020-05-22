package com.company;

import acm.program.ConsoleProgram;

/***Console Program - takes a String in Input and
 *assigns a value to each letter. then counts and prints the total score
 * no points assigned for lowercase, numbers, and other characters
 *
 * Points per Letters
 * 1 -A, E, I, L, N, O, R, S, T, U
 * 2 -D, G
 * 3 -B, C, M, P
 * 4 -F, H, V, W, Y
 * 5 -K
 * 8 -J, X
 * 10 -Q, Z
 * */


public class Main extends ConsoleProgram {

    public static void main(String[] args) {

        (new com.company.Main()).start();
    }

    public void run() {
        displayTotalScore(checkWordScore(insertWord()));
    }


    /**
     * gets a new word from the user and returns it to the caller
     */

    private String insertWord() {
        String enteredWord;
        do {            //do while prevents the algorithm to move forward if
            // the user hits ENTER before adding any character
            enteredWord = readLine("Enter your word here: ");
        } while (enteredWord.equals(""));
        return enteredWord;
    }

    /**
     * controls and adds, char by char, the points for the letters in the word
     * <p>
     * and returns the total score
     */

    private int checkWordScore(String enteredWord) {
        int totalScore = 0;
        for (int i = 0; i < enteredWord.length(); i++) {
            totalScore += assignScore(enteredWord.charAt(i));
        }
        return totalScore;
    }

    private int assignScore(char letter) {
        switch (letter) {
            case 'Q', 'Z':
                return 10;
            case 'J', 'X':
                return 8;
            case 'K':
                return 5;
            case 'F', 'H', 'V', 'W', 'Y':
                return 4;
            case 'B', 'C', 'M', 'P':
                return 3;
            case 'D', 'G':
                return 2;
            case 'A', 'E', 'I', 'L', 'N', 'O', 'R', 'S', 'T', 'U':
                return 1;
            default:
                return 0;
        }
    }

    private void displayTotalScore(int scoreOfWord) {
        println("Congrats: your total score is " + scoreOfWord);
    }
}