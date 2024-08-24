/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int len=lenOfNode(head);
         
         ListNode first=head;
         
         for(int i=1; i<k;++i)
             first=first.next;

         ListNode second=head;
        
         for(int i=1; i<=len-k; ++i)
         second=second.next;

        System.out.println();
        int temp=first.val;
        first.val=second.val;
        second.val=temp;

    return head;
    }
    private static int lenOfNode(ListNode head)
    {
        int i=0;
        while(head!=null)
        {
            head=head.next;
            ++i;
        }
        return i;
    }
}