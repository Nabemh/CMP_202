package Palindrome;
/*
 * isPalindrome: Reverses an array and compares the original and
 *               reversed arrays
 * 
 * Return; - true: If string is a palindrome
 *         - false: If string is not a palindrome
 */


public class PalindromeCheck {
    public boolean isPalindrome(String str) {
        char[] wordArray = str.toCharArray();
        char[] reversedArray = new char[wordArray.length];

        // Reverse the original char array
        for (int i = 0; i < wordArray.length; i++) {
            reversedArray[i] = wordArray[wordArray.length - 1 - i];
        }

        // Compare the original and reversed char arrays
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }
}
