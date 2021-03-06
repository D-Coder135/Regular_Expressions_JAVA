/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 29-11-2020
 *  Time: 11:02 PM
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// This code is similar to the code of Scratch4.java class.
// In this code start() and end() method is described and used along with the find() and group() method.
public class Scratch5 {
    public static void main(String[] args) {
        // Step 1: Use the Pattern class to define a regular expression.
        Pattern pattern = Pattern.compile("\\d{4}");

        // Step 2: Match the pattern against a sequence of characters using the Matcher class.
        Matcher matcher = pattern.matcher("1234 4465 1134");

        /*
         * start() method and end() method
         * We can find the index at which the current match is obtained by using the start() method and index past one
         * by using the end() method.
         * */

        // Loop to check how many sequence of the test string matches the regular expression.
        while (matcher.find()) {
            System.out.println("Match found at: " + matcher.start());
            System.out.println("These characters were matched: " + matcher.group());
            System.out.println("Match ended at: " + matcher.end());
            System.out.println();
        }

    }
}
