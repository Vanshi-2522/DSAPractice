class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class swapNodes7 {

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode node = dummy;

        while (node != null) {
            ListNode first = node.next;
            ListNode second = null;

            if (first != null) {
                second = first.next;
            }

            if (second != null) {
                ListNode secondNext = second.next;

                // swapping
                second.next = first;
                node.next = second;
                first.next = secondNext;

                node = first;
            } else {
                break;
            }
        }

        return dummy.next;
    }

    // Helper function to print list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        swapNodes7 sol = new swapNodes7();

        // Create list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                new ListNode(2,
                new ListNode(3,
                new ListNode(4,
                new ListNode(5)))));

        System.out.println("Original List:");
        printList(head);

        head = sol.swapPairs(head);

        System.out.println("After Swapping Pairs:");
        printList(head);
    }
}