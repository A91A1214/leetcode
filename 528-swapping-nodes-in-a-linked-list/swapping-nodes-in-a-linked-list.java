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
        ArrayList<Integer> a=new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        int n=a.size();
        int i=k-1;
        int j=n-k;

                int t=a.get(i);
                a.set(i, a.get(j));
                a.set(j,t);

        ListNode newnode=new ListNode(a.get(0));
        ListNode temp=newnode;
        for(int p=1;p<a.size();p++){
            temp.next=new ListNode(a.get(p));
            temp=temp.next;
        }
        return newnode;
    }
}