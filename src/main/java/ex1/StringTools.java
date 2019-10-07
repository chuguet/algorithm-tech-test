package ex1;

public class StringTools {

    private static StringTools stringTools;

    public StringTools() {

    }

    public static StringTools getInstance() {
        if (stringTools == null) {
            stringTools = new StringTools();
        }
        return stringTools;
    }

    public boolean isPalindrome(String text) {
        int textLength = text.length();
        int halfTextLength = text.length() / 2;
        String firstHalfText = text.substring(0, halfTextLength);
        String secondHalfText = textLength % 2 == 0 ? text.substring(halfTextLength, textLength) : text.substring(halfTextLength + 1, textLength);
        return firstHalfText.equals(new StringBuffer(secondHalfText).reverse().toString());
    }
}
