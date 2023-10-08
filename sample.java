// JAVA
// 1. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
// 2. Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)
// 3. Check if the input is pangram or not. (A pangram is a sentence that contains all the alphabets from A to Z)

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Task 1: Shuffle an array
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);
        System.out.println("Shuffled Array: " + Arrays.toString(array));

        // Task 2: Convert a Roman Numeral to an Integer
        String romanNumeral = "IX"; 
        int integerNumber = romanToInteger(romanNumeral);
        System.out.println("Integer Equivalent: " + integerNumber);

        // Task 3: Check if a sentence is a pangram
        String sentence = "The quick brown fox jumps over the lazy dog"; 
        boolean isPangram = isPangram(sentence);
        System.out.println("Is Pangram: " + isPangram);
    }

    // Task 1: Shuffle an array
    public static void shuffleArray(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        Collections.shuffle(list);
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
    }

    // Task 2: Convert a Roman Numeral to an Integer
    public static int romanToInteger(String s) {
        // Create a mapping of Roman numerals to integers
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanMap.get(s.charAt(i));
            if (currValue >= prevValue) {
                result += currValue;
            } else {
                result -= currValue;
            }
            prevValue = currValue;
        }

        return result;
    }

    // Task 3: Check if a sentence is a pangram
    public static boolean isPangram(String sentence) {
        Set<Character> alphabet = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabet.add(Character.toLowerCase(c));
            }
        }
        return alphabet.size() == 26; // There are 26 letters in the English alphabet
    }
}


// Output:
// Shuffled Array: [6, 3, 5, 7, 4, 1, 2]
// Integer Equivalent: 9
// Is Pangram: true
