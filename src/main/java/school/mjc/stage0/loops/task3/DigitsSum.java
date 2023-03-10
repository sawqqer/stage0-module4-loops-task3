package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        int sum = 0;
        String numStr = "" + number; // concatenate number with an empty string to convert it to string
        int length = numStr.length(); // get the length of the string

        for (int i = 0; i < length; i++) {
            char c = numStr.charAt(i); // get the character at the current index
            int digit = c - '0'; // convert the character to integer by subtracting the ASCII value of '0'
            sum += digit; // add the digit to the sum
        }

        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}
