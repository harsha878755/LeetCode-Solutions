# **LeetCode 2965 - Find Missing and Repeated Values**

## **Problem**

**You are given a 0-indexed `n x n` integer matrix `grid` containing numbers from `1` to `n²`. One number appears twice, and one number is missing.**

**Return an array containing the repeated number `a` and the missing number `b`, in the form `[a, b]`.**

## **Approach**

**1. Find the size of the grid using `grid.length`.**

**2. Create a `HashSet` to store the unique elements encountered in the grid.**

**3. Traverse every element of the grid using nested loops.**

**4. If an element already exists in the set, store it as the repeated number `a`.**

**5. Add each element to the set.**

**6. Iterate through the numbers from `1` to `n²` and check which number is missing from the set.**

**7. Store the missing number as `b` and return `[a, b]`.**

## **Example 1**

### **Input**

grid = [[1,3],[2,2]]

### **Output**

[2,4]

### **Explanation**

**The number `2` appears twice, so it is the repeated number.**

**The number `4` is missing from the grid.**

**Therefore, the answer is `[2,4]`.**

## **Example 2**

### **Input**

grid = [[9,1,7],[8,9,2],[3,4,6]]

### **Output**

[9,5]

### **Explanation**

**The number `9` appears twice, making it the repeated number.**

**The number `5` is missing from the grid.**

**Therefore, the answer is `[9,5]`.**

Complexity

## **Time Complexity: O(n²)**

**We traverse all `n²` elements of the grid and check the numbers from `1` to `n²`. HashSet operations take O(1) time on average.**

## **Space Complexity: O(n²)**

**The HashSet can store up to `n²` distinct elements.**

## **Topics**

**Array**

**Matrix**

**HashSet**

**Hashing**

**LeetCode**

## **Problem Number: 2965**

## **Difficulty: Easy**

## **LeetCode Problem Link: https://leetcode.com/problems/find-missing-and-repeated-values/**
