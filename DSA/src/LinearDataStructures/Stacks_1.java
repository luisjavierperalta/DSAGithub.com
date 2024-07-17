package LinearDataStructures;

import java.util.Stack;

//Reversing a String using @Stack data structure
//Java's built-in API library @java.util.stack
public class Stacks_1 { //1
    //2 Java's main method
    public static void main(String[] args) {
        //2.1 Declare & init original string
        String original = "Good Morning";
        //3 @Call the @reverse (f) algorithm by passing @original
        String reversedString = reverse(original);

        //4 Printing @original @reversedString
        System.out.println("Original:" + original);
        System.out.println("Reversed:" + reversedString);
    }

    public static String reverse(String string) { //1
        //2 To create a @StringBuilder to store @reversed String
        StringBuilder result = new StringBuilder();
        //3 To create a Stack to hold chars of @original String
        Stack<Character> stack = new Stack<>();

        //4 To iterate the String using @Enhance for loop, & converting string.toCharArray() //PUSH
        for (char c : string.toCharArray()) {
            //4.1 To push each char c to the stack
            stack.push(c);
        }

        //5 POP To pop each chars from stack until it's empty, then append it into result
        while (stack.isEmpty() == false) {
            result.append(stack.pop());
        }

        //1.1 return
        return result.toString();
    }
}
