package com.freetymekiyan.algorithms.level.easy;

/**
 * 389. Find the Difference
 * <p>
 * Given two strings s and t which consist of only lowercase letters.
 * <p>
 * String t is generated by random shuffling string s and then add one more letter at a random position.
 * <p>
 * Find the letter that was added in t.
 * <p>
 * Example:
 * <p>
 * Input:
 * s = "abcd"
 * t = "abcde"
 * <p>
 * Output:
 * e
 * <p>
 * Explanation:
 * 'e' is the letter that was added.
 * <p>
 * Companies: Google, Adobe
 * <p>
 * Related Topics: Hash Table, Bit Manipulation
 * <p>
 * Similar Questions: (E) Single Number
 */
public class FindTheDifference {

  public char findTheDifference(String s, String t) {
    int n = t.length();
    char c = t.charAt(n - 1);
    for (int i = 0; i < n - 1; ++i) {
      c ^= s.charAt(i);
      c ^= t.charAt(i);
    }
    return c;
  }

  public char findTheDifference2(String s, String t) {
    int charCode = t.charAt(s.length());
    // Iterate through both strings and char codes
    for (int i = 0; i < s.length(); ++i) {
      charCode -= (int) s.charAt(i);
      charCode += (int) t.charAt(i);
    }
    return (char) charCode;
  }
}