# [Smallest range in K lists](https://www.geeksforgeeks.org/problems/find-smallest-range-containing-elements-from-k-lists/0)
## Hard
Given a 2d integer array mat[][] of size n*k, where each row is sorted in ascending order. Your task is to find the&nbsp;smallest range [l, r] that includes at least one element from each of the n&nbsp;lists. If more than one such ranges are found, return the&nbsp;first one.
Note: If there are two possible ranges [a, b] and [c, d] with the same size, choose the one with the smaller starting value, i.e., consider [a, b] if a &lt; c.
Examples:
Input: mat[][] = [[4, 7, 9, 12, 15],                [0, 8, 10, 14, 20],                [6, 12, 16, 30, 50]]
Output: [6, 8]
Explanation: Smallest range is formed by number 7 from the first list, 8 from second list and 6 from the third list.
Input: mat[][] = [[2, 4],               [1, 7],                [20, 40]]
Output: [4, 20]Explanation: Smallest range is formed by number 4 from the first list, 7 from second list and 20 from the third list.
Constraints:1&nbsp;≤ n, k ≤&nbsp;500
0&nbsp;≤ mat[i][j] ≤&nbsp;105