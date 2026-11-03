# **LeetCode 344 - Reverse String**

## **Problem**

**Write a function that reverses a string. The input string is given as an array of characters `s`.**

**You must do this by modifying the input array in-place with O(1) extra memory.**

## **Approach**

**1. Use two pointers: `start` at the beginning and `end` at the last index of the array.**

**2. Check whether `start` is less than `end`.**

**3. Swap the characters at the `start` and `end` positions using a temporary variable.**

**4. Increment `start` and decrement `end`.**

**5. Repeat the process until both pointers meet or cross each other.**

**6. The array is reversed in-place without using extra space.**

## **Example 1**

### **Input**

s = ["h","e","l","l","o"]

### **Output**

["o","l","l","e","h"]

### **Explanation**

**The first character `h` is swapped with the last character `o`.**

**The second character `e` is swapped with the fourth character `l`.**

**The middle character remains in its original position.**

**Therefore, the reversed string is `olleh`.**

## **Example 2**

### **Input**

s = ["H","a","n","n","a","h"]

### **Output**

["h","a","n","n","a","H"]

### **Explanation**

**The characters are swapped from both ends towards the middle.**

**Therefore, the reversed string is `hannaH`.**

Complexity

## **Time Complexity: O(n)**

**We traverse half of the array and perform constant-time swaps, so the time complexity is `O(n)`.**

## **Space Complexity: O(1)**

**The reversal is performed in-place using only a temporary variable and two pointers.**

## **Topics**

**String**

**Array**

**Two Pointers**

**In-Place Algorithm**

**LeetCode**

## **Problem Number: 344**

## **Difficulty: Easy**

## **LeetCode Problem Link: https://leetcode.com/problems/reverse-string/**
