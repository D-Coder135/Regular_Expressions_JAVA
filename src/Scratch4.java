/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 29-11-2020
 *  Time: 08:43 PM
 */

// This code is similar to the code in Scratch3.java class.
// In this code group() method is described and is used along with the find() method.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scratch4 {
    public static void main(String[] args) {
        // Step 1: Use the Pattern class to define a regular expression.
        Pattern pattern = Pattern.compile("\\d{4}");

        // Step 2: Match the pattern against a sequence of characters using the Matcher class.
        Matcher matcher = pattern.matcher("1234 5646 8956");

        /*
        *  group() method:
        *  We can obtain a string that will contain the last matching sequence of character from the test string.
        * */

        // To check how many sequences of the test string matches with the regular expression.
        while (matcher.find()) {

        }
    }
}
