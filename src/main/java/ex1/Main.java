package ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        System.out.println(isPalindrome(text) ? "The text is palindrome" : "The text is not palindrome");
    }

    private static boolean isPalindrome(String text) {
        int textLength = text.length();
        int halfTextLength = text.length() / 2;
        String firstHalfText = text.substring(0, halfTextLength);
        String secondHalfText = textLength % 2 == 0 ? text.substring(halfTextLength, textLength) : text.substring(halfTextLength + 1, textLength);
        return firstHalfText.equals(new StringBuffer(secondHalfText).reverse().toString());
    }

}
