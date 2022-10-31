package onboarding;

/**
 * Programs should be written for people to read, and only incidentally for machine to execute
 */

public class Problem4 {

    public static String solution(String word) {
        String answer = "";
        answer = getConvertedWord(word);
        return answer;
    }

    private static String getConvertedWord(String word) {
        StringBuilder convertedWord = new StringBuilder();
        word.chars().forEach(ch -> convertedWord.append(convertAlphabet(ch)));
        return convertedWord.toString();
    }

    private static char convertAlphabet(int alphabet) {
        char convertedAlphabet = ' ';
        if(Character.isLowerCase(alphabet)){
            convertedAlphabet = (char) ('z' - (alphabet - 'a'));
        }
        if(Character.isUpperCase(alphabet)){
            convertedAlphabet = (char) ('Z' - (alphabet - 'A'));
        }
        return convertedAlphabet;
    }

}