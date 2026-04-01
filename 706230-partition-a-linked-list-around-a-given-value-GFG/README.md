# [Partition a Linked List around a given value](https://www.geeksforgeeks.org/problems/partition-a-linked-list-around-a-given-value/0)
## Medium
Given a linked list and a value x, partition it such that all nodes less than x come first, then all nodes with a value equal to x, and finally nodes with a value greater than x. The original relative order of the nodes in each of the three partitions should be preserved. The partition must work in place.
&nbsp;
Examples:
Input: Linked list: 1-&gt;4-&gt;3-&gt;2-&gt;5-&gt;2-&gt;3, x = 3
Output: 1-&gt;2-&gt;2-&gt;3-&gt;3-&gt;4-&gt;5Explanation: Nodes with a value less than 3 come first, then equal to 3 and then greater than 3.

Input: Linked list: 1-&gt;4-&gt;2-&gt;10, x = 3
Output: 1-&gt;2-&gt;4-&gt;10Explanation: Nodes with value less than 3 come first, then equal to 3 and then greater than 3.
Expected Time Complexity : O(n)
Expected Space Complexity: O(n)
&nbsp;
Constraints:
1 &lt;= size of linked list &lt;= 105
1 &lt;= data of node &lt;= 105
1 &lt;= x &lt;= 105