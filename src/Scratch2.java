/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 28-11-2020
 *  Time: 11:38 PM
 */

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Same code as in Scratch1.java class but the only difference is in this code we are taking input
// from the end-user using a message Dialog.
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

        // For matching the test String with the Regular Expression, we have a mathces() method which
        // returns boolean value.
        if (matcher.matches()) {

        }
    }
}
