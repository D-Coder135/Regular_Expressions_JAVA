/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 29-11-2020
 *  Time: 08:25 PM
 */

// Similar code of Regular Expression as in Scratch1.java class for valid Aadhar Card Number.
// But in this code description of find() method is given and also about how it works.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scratch3 {
    public static void main(String[] args) {
        // Step 1: Use the Pattern class to define a regular expression.
        Pattern pattern = Pattern.compile("\\d{4}");

        // Step 2: Match the pattern against a sequence of characters using the Matcher class.
        Matcher matcher = pattern.matcher("1234 5456 8952");

        /*
         *  find() method:
         *  This method can match a test string against a pattern even if only subsequences are matched.
         *  i.e. It will return true if any of the part of the test string matches with the regular expression.
         * */
        if (matcher.find()) {
            System.out.println("The test string passed!");
        } else {
            System.out.println("The test string failed!");
        }
    }
}
