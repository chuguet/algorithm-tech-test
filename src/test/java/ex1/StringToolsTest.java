package ex1;

import org.junit.Assert;

public class StringToolsTest {

    @org.junit.Test
    public void isPalindromeTestOK() {
        StringTools stringTools = StringTools.getInstance();
        Assert.assertTrue(stringTools.isPalindrome("abba"));
        Assert.assertTrue(stringTools.isPalindrome("abbba"));
        Assert.assertTrue(stringTools.isPalindrome("abbba"));
        Assert.assertTrue(stringTools.isPalindrome("cbbc"));
        Assert.assertTrue(stringTools.isPalindrome("aba"));
        Assert.assertTrue(stringTools.isPalindrome("asdffdsa"));
    }

    @org.junit.Test
    public void isPalindromeTestKO() {
        StringTools stringTools = StringTools.getInstance();
        Assert.assertFalse(stringTools.isPalindrome("abb"));
        Assert.assertFalse(stringTools.isPalindrome("fds"));
        Assert.assertFalse(stringTools.isPalindrome("add"));
        Assert.assertFalse(stringTools.isPalindrome("fee"));
        Assert.assertFalse(stringTools.isPalindrome("sdfoiv"));
        Assert.assertFalse(stringTools.isPalindrome("acbcba"));
    }

}
