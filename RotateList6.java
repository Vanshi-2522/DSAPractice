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

public class RotateList6 {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }

        int size = 0;
        ListNode curr = head;

        while (curr != null) {
            curr = curr.next;
            size++;
        }

        k = k % size;

        if (k == 0) {
            return head;
        }

        curr = head;
        ListNode newHead = curr.next;

        for (int i = 0; i < size - k - 1; i++) {
            curr = curr.next;
            newHead = curr.next;
        }

        curr.next = null;

        curr = newHead;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = head;

        return newHead;
    }

    // Helper function to print the list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RotateList6 sol = new RotateList6();

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                new ListNode(2,
                new ListNode(3,
                new ListNode(4,
                new ListNode(5)))));

        System.out.println("Original List:");
        printList(head);

        int k = 2;

        head = sol.rotateRight(head, k);

        System.out.println("Rotated List by " + k + " positions:");
        printList(head);
    }
}