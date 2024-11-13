import java.util.Scanner;

public class Spoonerism_Generator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = getWord(scanner, "Enter the first word: ");
        String word2 = getWord(scanner, "Enter the second word: ");

        int vowelIndex1 = vowelIndex(word1);
        int vowelIndex2 = vowelIndex(word2);

        if (vowelIndex1 == -1 || vowelIndex2 == -1) {
            System.out.println("One or both words are not suitable for spoonerism.");
        } else if (vowelIndex1 == 0 || vowelIndex2 == 0) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        } else {
            String spoonerized1 = swapConsonants(word1, word2, vowelIndex1, vowelIndex2);
            String spoonerized2 = swapConsonants(word2, word1, vowelIndex2, vowelIndex1);
            System.out.println(word1 + " and " + word2 + " are spoonerized to: " + spoonerized1 + " and " + spoonerized2);
        }
    }

    public static String getWord(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int vowelIndex(String word) {
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public static String swapConsonants(String word1, String word2, int vowelIndex1, int vowelIndex2) {
        StringBuilder sb = new StringBuilder(word1);
        sb.replace(0, vowelIndex1, word2.substring(0, vowelIndex2));
        return sb.toString();
    }
}