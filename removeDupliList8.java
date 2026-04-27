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

public class removeDupliList8 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = head;

        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;  // skip duplicate
            } else {
                head = head.next;
            }
        }

        return res;
    }

    // Helper function
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        removeDupliList8 sol = new removeDupliList8(); 

        // 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1,
                new ListNode(1,
                new ListNode(2,
                new ListNode(3,
                new ListNode(3)))));

        System.out.println("Original List:");
        printList(head);

        head = sol.deleteDuplicates(head);

        System.out.println("After Removing Duplicates:");
        printList(head);
    }
}