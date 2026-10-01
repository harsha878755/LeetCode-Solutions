# **LeetCode 242 - Valid Anagram**

## **Problem**

**Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.**

**An anagram is a word or phrase formed by rearranging the letters of another word or phrase, using all the original letters exactly once.**

## **Approach**

**1. Convert both strings to lowercase.**

**2. Remove spaces from both strings.**

**3. Create an integer array `counts` of size `26` to store the frequency of each letter.**

**4. Traverse string `s` and increment the count of each character.**

**5. Traverse string `t` and decrement the count of each character.**

**6. If the two strings are anagrams, every count in the array will be `0`.**

**7. If any count is not `0`, return `false`. Otherwise, return `true`.**

## **Example 1**

### **Input**

s = "anagram", t = "nagaram"

### **Output**

true

### **Explanation**

**Both strings contain the same characters with the same frequencies.**

**Therefore, `t` is an anagram of `s`.**

## **Example 2**

### **Input**

s = "rat", t = "car"

### **Output**

false

### **Explanation**

**The strings contain different character frequencies.**

**Therefore, `t` is not an anagram of `s`.**

Complexity

## **Time Complexity: O(n)**

**We traverse both strings and the fixed-size frequency array, so the time complexity is `O(n)`.**

## **Space Complexity: O(1)**

**The frequency array always contains 26 elements, so the extra space is constant.**

## **Topics**

**String**

**Array**

**Frequency Counting**

**Hashing**

**LeetCode**

## **Problem Number: 242**

## **Difficulty: Easy**

## **LeetCode Problem Link: https://leetcode.com/problems/valid-anagram/**
