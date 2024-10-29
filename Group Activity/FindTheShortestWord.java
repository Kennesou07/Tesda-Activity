package findTheShortestWord;

import java.util.Scanner;

public class FindTheShortestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input word: ");
        String word = scanner.nextLine();
        String[] words = word.split(" ");
        System.out.println("Shortest Word Count: " + findShortest(words));
    }
    public static int findShortest(String[] word) {
        String shortestWord = word[0];
        for (int i = 0; i < word.length; i++) {
            if(shortestWord.length() > word[i].length()) {
                shortestWord = word[i];
            }
        }
        return shortestWord.length();
    }
}
