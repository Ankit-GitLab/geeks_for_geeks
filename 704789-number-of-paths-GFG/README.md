# [Number of paths](https://www.geeksforgeeks.org/problems/number-of-paths0926/1)
## Medium
Given a grid of size&nbsp;m x n, the task is to determine the number of distinct paths from the&nbsp;top-left corner&nbsp;to the&nbsp;bottom-right corner. At each step, one can either move down or right.&nbsp;Given the integers m and n, return the number of unique paths from the top-left corner to the bottom-right corner.
Note: The test cases are designed such that the answer will always fit within a 32-bit integer.
Examples:
Input: m = 3, n = 3
Output:&nbsp;6
Explanation: Let the given input 3*3 grid is filled as such:
A B C
D E F
G H I
The possible unique paths which exists to reach 'I' from 'A' following above conditions are as follows: ABCFI, ABEHI, ADGHI, ADEFI, ADEHI, ABEFI.
Input: m = 2, n = 3
Output: 3
Explanation: Let the given input 2*3 grid is filled as such:
A B C
D E F
The possible unique paths which exists to reach 'F' from 'A' following above conditions are as follows: ABCF, ADEF and ABEF.

Input: m = 1, n = 4
Output: 1
Explanation: Let the given input 1*4 grid is filled as such:A B C D The only possible unique path is ABCD.
Constraints:1 ≤ m ≤ 1001 ≤ n ≤&nbsp;100