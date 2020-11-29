/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 28-11-2020
 *  Time: 11:38 PM
 */

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Same code of Regular Expression as in Scratch1.java class for valid Aadhar Card Number but the only difference
//  is in this code we are taking input from the end-user using a message dialog.
public class Scratch2 {
    public static void main(String[] args) {
        // Step 1: Use the Pattern class to define a regular expression.
        Pattern pattern = Pattern.compile("^\\d{4}[ ]\\d{4}[ ]\\d{4}$");

        // Step 2: Match the pattern against a sequence of character using the Matcher class.
        String input = JOptionPane.showInputDialog(null,
                "Please enter your 12 digit aadhar card number: ",
                "Aadhar Card Number",
                JOptionPane.PLAIN_MESSAGE);
        Matcher matcher = pattern.matcher(input);

        // For matching the test String with the Regular Expression, we have a matches() method which
        // returns boolean value.
        // NOTE: The matches() method matches the test string "EXACTLY" with the Regular Expression.
        // i.e. It will return true, only if the test string matches with the Regular Expression line by line (exactly).
        if (matcher.matches()) {
            JOptionPane.showMessageDialog(null,
                    "Ok, the Aadhar Card Number's format is correct.",
                    "SUCCESS",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Sorry, the Aadhar Card Number's format is incorrect.",
                    "FAILURE",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
