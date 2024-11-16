
import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string must not be null or empty");
        }

        // HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count each character in the string
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the most common character
        char mostCommon = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommon = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostCommon;
    }

    public static void main(String[] args) {
        MostCommonCharacter mcc = new MostCommonCharacter();
        String str = "sample string";
        System.out.println("Most common character: " + mcc.recurringChar(str));
    }
}