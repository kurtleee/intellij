/*Created by @Kurt LEE On 11/15/22 3:53 PM.

* You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

*/
/* Java program to merge two
sorted linked lists */

import java.util.*;

/* Link list node */


class Solution {

    public class ListNode {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head;


        // *****

        ListNode dummyNode = new ListNode(0);

        ListNode tail = dummyNode;

        while (true) {
            if (list1 == null) {
                tail.next = list2;
                break;
            }

            if (list2 == null) {
                tail.next = list1;
                break;
            }

            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        return dummyNode.next;
    }


    public ListNode mergeTwoListsUsingRecursion(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        if (list1.val <= list2.val) {
            list1.next = mergeTwoListsUsingRecursion(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoListsUsingRecursion(list1, list2.next);
            return list2;
        }
    }
}


