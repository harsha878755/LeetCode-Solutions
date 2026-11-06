
# **48. Rotate Image**

## **Problem**

**Given an n × n 2D matrix representing an image, rotate the image by 90 degrees clockwise.**

**The rotation must be done in-place, meaning you must modify the input matrix directly without using another 2D matrix.**

## **Approach**

**Transpose the Matrix + Reverse Each Row**

1. First, transpose the matrix by swapping `matrix[i][j]` with `matrix[j][i]`.
2. Traverse only the upper triangular portion of the matrix to avoid swapping elements twice.
3. Reverse each row using two pointers:
   - Initialize `start` at the beginning of the row.
   - Initialize `end` at the end of the row.
   - Swap elements until both pointers meet.
4. The resulting matrix is rotated 90 degrees clockwise.

## **Example 1**

**Input:**

matrix = [[1,2,3],[4,5,6],[7,8,9]]

**Output:**

[[7,4,1],[8,5,2],[9,6,3]]

**Explanation:**

After transposing the matrix and reversing each row, the matrix is rotated 90 degrees clockwise.

## **Example 2**

**Input:**

matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]

**Output:**

[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

**Explanation:**

The matrix is rotated 90 degrees clockwise by transposing it and reversing each row.

## **Complexity**

**Time Complexity:** O(n²), because we traverse the matrix to transpose it and reverse each row.

**Space Complexity:** O(1), because the rotation is performed in-place using only a temporary variable.

## **Topics**

- Array
- Math
- Matrix

## **Problem Number**

48

## **Difficulty**

Medium

**Problem Link:** https://leetcode.com/problems/rotate-image/
