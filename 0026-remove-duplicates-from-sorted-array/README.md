# **LeetCode 26 - Remove Duplicates from Sorted Array**

## **Problem**

**Given an integer array `nums` sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.**

**Return the number of unique elements in `nums`.**

## **Approach**

**1. Use a variable `unique` to keep track of the number of unique elements.**

**2. Start from the second element because the first element is always unique.**

**3. Compare the current element with the previous element.**

**4. If they are different, a new unique element is found.**

**5. Increment `unique` and place the new unique element at position `unique - 1`.**

**6. Return `unique`, which represents the number of unique elements.**

## **Example 1**

### **Input**
nums = [1,1,2]

### **Output**
2

### **Explanation**

**After removing duplicates, the array becomes `[1,2,_]`.**

**There are `2` unique elements, so the answer is `2`.**

## **Example 2**

### **Input**
nums = [0,0,1,1,1,2,2,3,3,4]

### **Output**
5

### **Explanation**

**After removing duplicates, the unique elements are `[0,1,2,3,4]`.**

**There are `5` unique elements, so the answer is `5`.**

Complexity

## **Time Complexity: O(n)**

**We traverse the array only once, so the time complexity is `O(n)`.**

## **Space Complexity: O(1)**

**The solution modifies the array in-place and uses only constant extra space.**

## **Topics**

**Array**

**Two Pointers**

**In-Place Algorithm**

**LeetCode**

## **Problem Number: 26**

## **Difficulty: Easy**

## **LeetCode Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/**
