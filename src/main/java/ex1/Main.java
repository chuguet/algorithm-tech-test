package ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        StringTools stringTools = StringTools.getInstance();
        System.out.println(stringTools.isPalindrome(text) ? "The text is palindrome" : "The text is not palindrome");
    }

}
