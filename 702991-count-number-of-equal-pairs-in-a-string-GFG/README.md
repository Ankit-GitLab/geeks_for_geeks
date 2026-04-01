# [Count number of equal pairs in a string](https://www.geeksforgeeks.org/problems/count-number-of-equal-pairs-in-a-string0520/0)
## Easy
Given a string, find the number of pairs of characters that are same. Pairs (s[i], s[j]), (s[j], s[i]), (s[i], s[i]), (s[j], s[j]) should be considered different.

Example 1:

Input:
S = "air"
Output: 3
Explanation: 3 pairs that are equal:
(S[0], S[0]), (S[1], S[1]) and (S[2], S[2])


â€‹Example 2:

Input: 
S = "aa"
Output: 4
Explanation: 4 pairs that are equal:
(S[0], S[0]), (S[0], S[1]), (S[1], S[0])
and (S[1], S[1])



Your Task:
You don't need to read input or print anything. Your task is to complete the function&nbsp;equalPairs()&nbsp;which takes the string S as input and returns the number of equal pairs as described in the problem description.


Expected Time Complexity:&nbsp;O(|S|).
Expected Auxiliary Space:&nbsp;O(1).


Constraints:
1&lt;=|S|&lt;=105

&nbsp;
