/*Created by @Kurt LEE On 1/12/23 11:07 PM.*/

import java.util.List;



public class ReorderList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }



        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    // driver code
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        reorderList(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);
        merge(head, head2);
        return head;
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int index = 0;
        while (head1 != null && head2 != null) {
            if (index % 2 == 0) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
            index++;
        }
        if (head1 != null) {
            curr.next = head1;
        }
        if (head2 != null) {
            curr.next = head2;
        }
    }

}
