package ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        System.out.println(isPalindrome(text) ? "The text is palindrome" : "The text is not palindrome");
    }

    private static boolean isPalindrome(String text) {
        return new StringBuffer(text).reverse().toString().equals(text);
    }

}
