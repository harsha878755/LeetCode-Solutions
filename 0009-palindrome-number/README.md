# **LeetCode 9 - Palindrome Number**

## **Problem**

**Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.**

**An integer is a palindrome when it reads the same backward as forward.**

## **Approach**

**1. Negative numbers are not palindromes, so return `false` if `x < 0`.**

**2. Store the original number in a variable `original`.**

**3. Reverse the number by extracting its last digit using `x % 10`.**

**4. Add each extracted digit to `reverse` using `reverse = reverse * 10 + digit`.**

**5. Remove the last digit from `x` using `x = x / 10`.**

**6. Compare the original number with the reversed number.**

**7. If both are equal, return `true`; otherwise, return `false`.**

## **Example 1**

### **Input**
x = 121

### **Output**
true

### **Explanation**

**The number `121` reads the same forward and backward.**

**Therefore, `121` is a palindrome and the answer is `true`.**

## **Example 2**

### **Input**
x = -121

### **Output**
false

### **Explanation**

**Negative numbers are not considered palindromes.**

**Therefore, the answer is `false`.**

## **Example 3**

### **Input**
x = 10

### **Output**
false

### **Explanation**

**The number `10` becomes `01` when reversed, which is not equal to `10`.**

**Therefore, the answer is `false`.**

Complexity

## **Time Complexity: O(log n)**

**The number of digits in `x` is proportional to `log n`, and we process each digit once.**

## **Space Complexity: O(1)**

**Only a few variables are used, so the extra space complexity is `O(1)`.**

## **Topics**

**Math**

**Number Manipulation**

**Palindrome**

**LeetCode**

## **Problem Number: 9**

## **Difficulty: Easy**

## **LeetCode Problem Link: https://leetcode.com/problems/palindrome-number/**
