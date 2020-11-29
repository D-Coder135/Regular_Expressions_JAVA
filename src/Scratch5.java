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
        Matcher matcher = pattern.matcher("");
    }
}
