
# **136. Single Number**

## **Problem**

**Given a non-empty array of integers, every element appears twice except for one. Find the element that appears only once.**

**Your solution must have linear runtime complexity and use only constant extra space.**

## **Approach**

**Bit Manipulation using XOR**

1. Initialize a variable `sing` with the first element of the array.
2. Traverse the remaining elements.
3. Perform the XOR operation between `sing` and each element.
4. XOR has the following properties:
   - `a ^ a = 0`
   - `a ^ 0 = a`
   - XOR is commutative and associative.
5. All duplicate elements cancel each other, leaving only the element that appears once.
6. Return `sing`.

## **Example 1**

**Input:**

nums = [2,2,1]

**Output:**

1

**Explanation:**

2 ^ 2 = 0

0 ^ 1 = 1

The single number is 1.

## **Example 2**

**Input:**

nums = [4,1,2,1,2]

**Output:**

4

**Explanation:**

Duplicate elements cancel each other using XOR, leaving 4.

## **Complexity**

**Time Complexity:** O(n), where n is the number of elements in the array. We traverse the array once.

**Space Complexity:** O(1), as only one extra variable is used.

## **Topics**

- Array
- Bit Manipulation
- XOR

## **Problem Number**

136

## **Difficulty**

Easy

**Problem Link:** https://leetcode.com/problems/single-number/
