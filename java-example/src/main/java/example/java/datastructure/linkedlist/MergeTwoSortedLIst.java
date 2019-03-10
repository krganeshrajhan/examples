package example.java.datastructure.linkedlist;

public class MergeTwoSortedLIst {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l2==null) {
            return l1;
        }
        if(l1==null) {
            return l2;
        }
        if(l1.val <l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }



    }



    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        MergeTwoSortedLIst mergeTwoSortedLIst = new MergeTwoSortedLIst();
        mergeTwoSortedLIst.mergeTwoLists(l1, l2);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}