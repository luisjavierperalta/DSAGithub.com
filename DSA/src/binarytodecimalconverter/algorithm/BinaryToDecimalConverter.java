package binarytodecimalconverter.algorithm;

/*
May 13, 2024 My first algorithm design
BINARY TO DECIMAL CONVERTER ALGORITHM
Function design:
// Convert input String (binary number) into output (decimal int)
1 Create a function with 1x parameter (binary string), and return int type (decimal number)
2 Sequence of step >function
2.1 Create function:
2.2 Add input validation
2.3 Init 2x variables "decimal" and "position"(index)
2.4 For each loop: for iterate BinaryString (each character)
2.5 Process each Digit
2.6 Convert Binary Digit (number) into Integer
2.7 create contribution variable & calculate contribution x each digit
2.8 add contribution to decimal
2.9 move forward to the next digit in the string (char)
2.10 out of for loop, within function return decimal;
3 Declare java's program main method:
3.1 Declare and init @binaryString variable = "1101";
3.2 Declare int variable for hosting returned decimalValue
3.3 Print the value ot the console

 */

public class BinaryToDecimalConverter {
    //1 Create a function (algorithm design) for transforming inputs into outputs
    public static int binaryToDecimal(String binaryString) { //@binaryString passed via @binarytodecimalconverter.algorithm.BinaryToDecimalMain Class
        //2.2 Input validation (Checking @binaryString contains only '0's and '1's)
        String regex = "[01]+"; //Regular expression pattern matches 1 or more ('1' '0')
        if (!binaryString.matches(regex)) { //If @binaryString does not match the pattern('0' and '1')
            throw new IllegalArgumentException("Invalid binary string. Please enter a string containing only 0s and 1s.");

        }
        //2.3 Declaring & init 2x int variables for storing @Decimal @Position (index of @binaryString)
        int decimal = 0;
        int position = 0;
        //2.4 Declaring a for-each loop for iterate each char int the @binaryString
        for (char digit : binaryString.toCharArray()) {
            // The toCharArray() method call converts the @binaryString string, and returns an array of characters
            //2.5 Converts the string representation of a binary digit ('0' or '1') to its corresponding integer value.
            int digitValue = Integer.parseInt(String.valueOf(digit), 2);
            //2.6 contribution variable indeed calculates the weight of each digit value automatically based on its position within the binary number.
            int contribution = (int) Math.pow(2,position);
            contribution *= digitValue;
            //2.7
            decimal += contribution;
            position++; //From left to right
        }

        //2.8 @binaryToDecimal method returns
        return decimal;
    }
}
