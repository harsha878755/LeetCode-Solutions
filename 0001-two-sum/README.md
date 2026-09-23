# **LeetCode 1 - Two Sum**

## **Problem**

**Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.**

**You may assume that each input has exactly one solution, and you may not use the same element twice.**

## **Approach**

**1. Use a `HashMap` to store each number and its index.**

**2. Traverse the array from left to right.**

**3. For each number, calculate the required value using `target - nums[i]`.**

**4. Check whether the required value already exists in the `HashMap`.**

**5. If it exists, return the current index and the stored index of the required value.**

**6. If it does not exist, store the current number and its index in the `HashMap`.**

## **Example 1**

### **Input**
nums = [2,7,11,15], target = 9

### **Output**
[0,1]

### **Explanation**

**The numbers 2 and 7 add up to 9.**

**Their indices are 0 and 1, so the answer is [0,1].**

## **Example 2**

### **Input**
nums = [3,2,4], target = 6

### **Output**
[1,2]

### **Explanation**

**The numbers 2 and 4 add up to 6.**

**Their indices are 1 and 2, so the answer is [1,2].**

Complexity

## **Time Complexity: O(n)**

**We traverse the array once, and HashMap lookup takes O(1) on average.**

## **Space Complexity: O(n)**

**In the worst case, the HashMap can store all `n` elements.**

## **Topics**

**Array**

**HashMap**

**Two Sum**

**LeetCode**

## **Problem Number: 1**

## **Difficulty: Easy**

## **LeetCode Problem Link: https://leetcode.com/problems/two-sum/**
