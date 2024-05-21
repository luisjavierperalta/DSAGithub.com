package binarytodecimalconverter.algorithm;

import static binarytodecimalconverter.algorithm.BinaryToDecimalConverter.binaryToDecimal;

public class BinaryToDecimalMain {

    //3 Defining java's main method

    public static void main(String[] args) {
        //3.1 Creating the @binaryString
        String binaryString = "1101";

        //3.2 Invokes the binaryToDecimal method, passing binaryString as an argument
        int decimalValue = binaryToDecimal(binaryString);
        //The return value of the binaryToDecimal method, which is an integer representing
        // the decimal equivalent of the binary string, is assigned to the variable decimalValue
        System.out.println("Decimal of" + binaryString + ":" + decimalValue);
    }


}