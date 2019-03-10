package example.java.datastructure.linkedlist;

public class RemoveDuplicatesFromSortedLIst {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;

        while(currentNode!=null) {
            if(currentNode.next!=null && (currentNode.val == currentNode.next.val)) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }

        }
        return head;
    }

}
