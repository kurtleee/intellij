public class Merge2SortedLists {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }

    public ListNode merge2Lists (ListNode l1, ListNode l2) {
        if (l1 == null)  {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = merge2Lists(l1.next, l2);
            return l1;
        } else {
            l2.next = merge2Lists(l1, l2.next);
            return l2;
        }
    }
}
