# **LeetCode 387 - First Unique Character in a String**

## **Problem**

**Given a string `s`, find the first non-repeating character and return its index.**

**If no non-repeating character exists, return `-1`.**

## **Approach**

**1. Use a `HashMap` to store the frequency of each character.**

**2. Traverse the string and count the frequency of every character.**

**3. Traverse the string again from left to right.**

**4. Check the frequency of each character.**

**5. The first character with frequency `1` is the first unique character, so return its index.**

**6. If no unique character is found, return `-1`.**

## **Example 1**

### **Input**
leetcode
### **Output**
0

### **Explanation**

The character l appears only once in the string.

Its index is 0, so the answer is 0.

## **Example 2**

### **Input**
loveleetcode
### **Output**
2

### **Explanation**

The character v appears only once and its index is 2.

Complexity

## **Time Complexity: O(n)**

We traverse the string twice, so the overall time complexity is O(n).

## **Space Complexity: O(k)**

Where k is the number of distinct characters stored in the HashMap.

## **Topics**
String
HashMap
Frequency Counting
LeetCode

## **Problem Number: 387**

## **Difficulty: Easy**
