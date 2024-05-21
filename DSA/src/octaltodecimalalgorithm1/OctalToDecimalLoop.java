package octaltodecimalalgorithm1;

/*
ALGORITHM FOR CONVERTING OCTAL NUMBERS TO DECIMAL WITH @LOOP (ENHANCED LOOP)
ALGORITHM CHECKLIST OF SEQUENTIAL STEPS:
1 1x Class definition
2 2x methods definitions @Convert(algorithm function) @Main
3 2x variables declarations & init with default 0 @Decimal @i (index for loop iteration)
4 1x for-each loop declaration for iterate each digit of @octalString
4.1/4.5
2// Return statement
5 Defining Main

 */

public class OctalToDecimalLoop { //1
    //2 Defining algorithm function for swapping inputs into outputs
    public static int convert(String octalString) {
        //3 Defining 2x local variables required for ops
        int decimal = 0;
        int i = 0;

        try { //Handling exception & continue execution

            //4 Defining for-each loop for iterate each digit of octalString (right to left)
            for (char digitChar : octalString.toCharArray()) {
                //4.1 converts the String into an array of characters (char[]).
                // Each element of this array is a character from the String
                int digit = Character.getNumericValue(digitChar);
                //4.2 Converts digitChar to its corresponding numeric value and assigns it to digit.
                //For example, if digitChar is '1', Character.getNumericValue('1') returns 1.

                //4.3 Checking validation octal digit (0-7)
                if (digit < 0 || digit > 7) {
                    throw new IllegalArgumentException("Invalid Octal Digit:" + digit);

                }
                //4.4 Computes the power of 8 corresponding to the current digit's position.
                int power = (int) Math.pow(8, octalString.length() - 1 - i);
                //4.4 We need to multiply each digit by the corresponding power of 8 and then sum these values
                decimal += digit * power;
                i++; // Loop Index for tracking & correctly processes each digit in the octal string from left to right

            } //4



        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        //2 Return statement
        return decimal;
    }

    public static void main(String[] args) { //5 Defining Java's Main
        //5.1 Defining string octal variable
        String octal = "12345";
        int decimal = convert(octal);
        System.out.println(octal + "=" + decimal);

    }

}



