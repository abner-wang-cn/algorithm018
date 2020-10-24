/**
 * 合并两个有序链表
 * */
public class MergeSortLinkedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node1=l1;
        ListNode node2=l2;
        ListNode res = new ListNode(0);
        ListNode tmp = res;
        while(node1!=null || node2!=null){
            int curr;
            if(node1!=null && node2!=null){
                // curr = node1.val<node2.val?node1.val:node2.val;
                if(node1.val<node2.val){
                    curr = node1.val;
                    node1=node1.next;
                }else{
                    curr = node2.val;
                    node2=node2.next;
                }
            }else if( node1==null && node2!=null){
                curr=node2.val;
                node2=node2.next;
            }else{
                curr=node1.val;
                node1=node1.next;
            }
            tmp.next=new ListNode(curr);
            tmp=tmp.next;
        }
        return res.next;
    }
}