package com.gettingstarted.kata;

public class App {
    public static void main(String[] args) {
        System.out.println("Let's solve some katas");
    }

    // convert any passed number into a string
    // Hint: Look for a built in method
    public String intToString(int number) {
        return String.valueOf(number);
    }

    // convert a boolean to a Yes or No answer
    // "true" returns "Yes"; "false" returns "No"
    // Hint: A ternary operator can be used here
    public String boolToAnswer(boolean bool) {
        return (bool) ? "Yes" : "No";
    }

    // given a string of space separated numbers
    // return the lowest and highest numbers
    // ex: "1 -2 6 3" returns "-2 6"
    // Hint: Look for a built in methods
    public String lowAndHigh(String numbers) {
        int high = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;
        for (String n : numbers.split(" ")) {
            int number = Integer.valueOf(n);

            if (number < low) {
                low = number;
            }
            if (number > high) {
                high = number;
            }
        }
        return Integer.toString(low) + " " + Integer.toString(high);
    }

    // return the highest scoring word and its score
    // each letter in a word corresponds to it's position in the alphabet (a=1, b=2)
    // "a, b" returns "b: 2"
    // Hint: Look for a built in method
    public String aScrambleScore(String words) {
        String winner = "";
        int highScore = 0;

        for (String word : words.toUpperCase().split(", ")) {
            int score = 0;
            for (char c : word.toCharArray()) {
                score += c - 64;
            }
            if (score > highScore) {
                winner = word;
                highScore = score;
            }
        }
        return winner.toLowerCase() + ": " + highScore;
    }
}
