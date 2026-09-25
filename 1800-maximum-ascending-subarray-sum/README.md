# **LeetCode 1800 - Maximum Ascending Subarray Sum**

## **Problem**

**Given an array of positive integers `nums`, return the maximum possible sum of an ascending subarray.**

**A subarray is ascending if each element is strictly greater than the previous element.**

## **Approach**

**1. Use a variable `sum` to store the sum of the current ascending subarray.**

**2. Use a variable `max` to store the maximum ascending sum found so far.**

**3. Start with the first element as both `sum` and `max`.**

**4. Traverse the array from the second element.**

**5. If the current element is greater than the previous element, add it to `sum`.**

**6. Otherwise, the ascending subarray ends, so reset `sum` to the current element.**

**7. Update `max` using `Math.max(sum, max)` after every iteration.**

**8. Return `max` as the maximum ascending subarray sum.**

## **Example 1**

### **Input**
nums = [10,20,30,5,10,50]

### **Output**
65

### **Explanation**

**The ascending subarrays include `[10,20,30]` and `[5,10,50]`.**

**The sum of `[5,10,50]` is `65`, which is the maximum ascending subarray sum.**

## **Example 2**

### **Input**
nums = [10,20,30,40,50]

### **Output**
150

### **Explanation**

**The entire array is strictly ascending.**

**Therefore, the maximum sum is `10 + 20 + 30 + 40 + 50 = 150`.**

Complexity

## **Time Complexity: O(n)**

**We traverse the array only once, so the time complexity is `O(n)`.**

## **Space Complexity: O(1)**

**We use only a few variables, so the extra space complexity is `O(1)`.**

## **Topics**

**Array**

**Subarray**

**Greedy**

**LeetCode**

## **Problem Number: 1800**

## **Difficulty: Easy**

## **LeetCode Problem Link: https://leetcode.com/problems/maximum-ascending-subarray-sum/**
