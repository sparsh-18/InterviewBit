/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
  
    public ListNode reverseList(ListNode A, int k) {
        ListNode ans=null, ansHead=null, current=A, p=A;
        int l = len(A);

        while(current != null) {
            int i=k;
            ListNode temp=null, tempTail=null;

            if(k <= l) {
                while(current!=null && i-->0) {
                    p=current.next;
                    current.next=temp;
                    
                    if(temp==null) tempTail = current;
                    
                    temp=current;

                    current=p;
                }
                if(ans==null) {
                  //ans=temp;
                    ansHead=temp;
                    ans=tempTail;
                } 
                else {
                    ans.next = temp;
                    ans=tempTail;
                }

                l-=k;
            }
            else {
                if(ans==null) {
                    ans=current;
                    ansHead=current;
                }
                else {
                    ans.next = current;
                    ans=ans.next;
                }

                current=current.next;
            }
        }

        return ansHead;
        
    }

    public int len(ListNode A) {
        ListNode t=A;
        int c=0;
        while(t!=null) {
            t=t.next;
            c++;
        }
        return c;
    }
}
