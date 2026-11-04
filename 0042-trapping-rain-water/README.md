
# **42. Trapping Rain Water**

## **Problem**

**Given an array of non-negative integers representing an elevation map, where the width of each bar is 1, calculate how much water it can trap after raining.**

## **Approach**

**Two Pointers Approach**

1. Initialize two pointers: `left` at the beginning and `right` at the end of the array.
2. Maintain `leftMax` and `rightMax` to track the maximum heights encountered from both sides.
3. Compare the heights at the two pointers.
4. If `height[left]` is smaller:
   - Update `leftMax` if the current height is greater than or equal to it.
   - Otherwise, add `leftMax - height[left]` to the trapped water.
   - Move the left pointer forward.
5. Otherwise:
   - Update `rightMax` if the current height is greater than or equal to it.
   - Otherwise, add `rightMax - height[right]` to the trapped water.
   - Move the right pointer backward.
6. Return the total trapped water.

## **Example 1**

**Input:**

height = [0,1,0,2,1,0,1,3,2,1,2,1]

**Output:**

6

**Explanation:**

The elevation map traps a total of 6 units of rainwater.

## **Example 2**

**Input:**

height = [4,2,0,3,2,5]

**Output:**

9

**Explanation:**

The elevation map traps a total of 9 units of rainwater.

## **Complexity**

**Time Complexity:** O(n), where n is the number of elements in the array. Each pointer moves through the array at most once.

**Space Complexity:** O(1), as only a constant amount of extra space is used.

## **Topics**

- Array
- Two Pointers
- Dynamic Programming
- Stack
- Monotonic Stack

## **Problem Number**

42

## **Difficulty**

Hard

**Problem Link:** https://leetcode.com/problems/trapping-rain-water/
