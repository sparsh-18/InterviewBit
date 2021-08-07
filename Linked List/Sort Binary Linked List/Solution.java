/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A) {

        if(A==null || A.next==null) return A;

        ListNode current = A;
        ListNode zeroHead = new ListNode(0), oneHead = new ListNode(0);

        ListNode zero = zeroHead, one = oneHead;

        while(current != null) {
            if(current.val == 0) {
                zero.next = current;
                zero=zero.next;
            } else {
                one.next = current;
                one=one.next;
            }
            current=current.next;
        }

        one.next=null;

        zero.next = oneHead.next!=null ? oneHead.next : null;

        A = zeroHead.next;
        
        return A;
    }
}
