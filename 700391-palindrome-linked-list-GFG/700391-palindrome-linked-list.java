/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    static Node reverse(Node head){
        Node prev = null, curr = head;
        while(curr != null){
            Node fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }

    static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node head2 = reverse(slow);
        Node i = head, j = head2;

        while (j != null) {
            if (i.data != j.data) return false;
            i = i.next;
            j = j.next;
        }
        return true;
    }
}
