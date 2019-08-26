package com.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromePermutationTest {
    PalindromePermutation palindromePermutation = new PalindromePermutation();

    @Test
    public void test() {
        Assert.assertTrue(palindromePermutation.isPalindrome(""));
        Assert.assertFalse(palindromePermutation.isPalindrome("ac"));
        Assert.assertTrue(palindromePermutation.isPalindrome("aca"));
        Assert.assertTrue(palindromePermutation.isPalindrome("bb"));
        Assert.assertTrue(palindromePermutation.isPalindrome("zzz"));
        Assert.assertTrue(palindromePermutation.isPalindrome("z"));
        Assert.assertFalse(palindromePermutation.isPalindrome("abca"));

        Assert.assertTrue(palindromePermutation.isPalindromeChecker(""));
        Assert.assertFalse(palindromePermutation.isPalindromeChecker("ac"));
        Assert.assertTrue(palindromePermutation.isPalindromeChecker("aca"));
        Assert.assertTrue(palindromePermutation.isPalindromeChecker("bb"));
        Assert.assertTrue(palindromePermutation.isPalindromeChecker("zzz"));
        Assert.assertTrue(palindromePermutation.isPalindromeChecker("z"));
        Assert.assertFalse(palindromePermutation.isPalindromeChecker("abca"));

        Assert.assertTrue(palindromePermutation.isPalindromeOddCounter(""));
        Assert.assertFalse(palindromePermutation.isPalindromeOddCounter("ac"));
        Assert.assertTrue(palindromePermutation.isPalindromeOddCounter("aca"));
        Assert.assertTrue(palindromePermutation.isPalindromeOddCounter("bb"));
        Assert.assertTrue(palindromePermutation.isPalindromeOddCounter("zZz"));
        Assert.assertTrue(palindromePermutation.isPalindromeOddCounter("z"));
        Assert.assertFalse(palindromePermutation.isPalindromeOddCounter("zbZ"));
    }
}
