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
            return;
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
    }

    private static ListNode reverse(ListNode head) {
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

        while (l1 != null) {
            ListNode l1Temp = l1.next;
            ListNode l2Temp = l2.next;
            l1.next = l2;
            if (l1Temp == null) {
                break;
            }
            l2.next = l1Temp;
            l1 = l1Temp;
            l2 = l2Temp;
        }
    }
}
