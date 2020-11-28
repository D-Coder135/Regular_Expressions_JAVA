/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 28-11-2020
 *  Time: 10:42 PM
 */

// We have a dedicated package java.util.regex for Regular Expressions in Java.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// In this class we will code the Regular Expression for a valid Aadhar Card Number.
public class Scratch1 {
    public static void main(String[] args) {
        // Step 1: Use the Pattern class to define a regular expression.
        Pattern pattern = Pattern.compile("^\\d{4}[ ]\\d{4}[ ]\\d{4}$");

        // Step 2: Match the pattern against a sequence of character using the Matcher class.
        Matcher matcher = pattern.matcher("");
    }
}
