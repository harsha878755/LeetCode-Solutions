
# **125. Valid Palindrome**

## **Problem**

**Given a string, determine whether it is a palindrome, considering only alphanumeric characters and ignoring cases.**

**A palindrome reads the same forward and backward.**

## **Approach**

1. Convert the string to lowercase.
2. Remove all non-alphanumeric characters using `replaceAll("[^a-z0-9]", "")`.
3. Initialize two pointers: `start` at the beginning and `end` at the last character.
4. Compare characters at both pointers.
5. If they differ, return `false`. Otherwise, move both pointers inward.
6. If all characters match, return `true`.

## **Example 1**

**Input:**

s = "A man, a plan, a canal: Panama"

**Output:**

true

**Explanation:**

After removing spaces and punctuation and converting to lowercase, the string becomes "amanaplanacanalpanama", which is a palindrome.

## **Example 2**

**Input:**

s = "race a car"

**Output:**

false

**Explanation:**

After cleaning the string, it becomes "raceacar", which is not a palindrome.

## **Complexity**

**Time Complexity:** O(n), where n is the length of the input string.

**Space Complexity:** O(n), for storing the cleaned string.

## **Topics**

- Two Pointers
- String
- String Manipulation

## **Problem Number**

125

## **Difficulty**

Easy

**Problem Link:** https://leetcode.com/problems/valid-palindrome/
