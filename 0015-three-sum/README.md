# **LeetCode 15 - 3Sum**

## **Problem**

**Given an integer array `nums`, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.**

**The solution set must not contain duplicate triplets.**

## **Approach**

**1. Sort the given array using `Arrays.sort()`.**

**2. Use a loop to fix the first element of the triplet.**

**3. Use two pointers, `left` and `right`, to find the remaining two elements.**

**4. If the sum of the three elements is `0`, add the triplet to the result.**

**5. If the sum is less than `0`, move the `left` pointer forward to increase the sum.**

**6. If the sum is greater than `0`, move the `right` pointer backward to decrease the sum.**

**7. Skip duplicate values for the first element, left pointer, and right pointer to avoid duplicate triplets.**

## **Example 1**

### **Input**
nums = [-1,0,1,2,-1,-4]

### **Output**
[[-1,-1,2],[-1,0,1]]

### **Explanation**

**The triplets `[-1,-1,2]` and `[-1,0,1]` have a sum of `0`.**

**Duplicate triplets are avoided by skipping duplicate values after sorting the array.**

## **Example 2**

### **Input**
nums = [0,1,1]

### **Output**
[]

### **Explanation**

**There is no triplet whose sum is `0`.**

Complexity

## **Time Complexity: O(n²)**

**Sorting takes `O(n log n)` and the two-pointer approach takes `O(n²)`, so the overall time complexity is `O(n²)`.**

## **Space Complexity: O(1)**

**Apart from the output list, the algorithm uses constant extra space.**

## **Topics**

**Array**

**Sorting**

**Two Pointers**

**Hashing**

**LeetCode**

## **Problem Number: 15**

## **Difficulty: Medium**

## **LeetCode Problem Link: https://leetcode.com/problems/3sum/**
