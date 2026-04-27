public class removeEleLL11 {

   
    static class ListNode {
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

    static class Solution {
        public ListNode removeElements(ListNode head, int val) {

            while (head != null && head.val == val) {
                head = head.next;
            }

            if (head == null) {
                return head;
            }

            ListNode temp = head;

            while (temp.next != null) {
                if (temp.next.val == val) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }

            return head;
        }
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

       
        ListNode head = new ListNode(1,
                new ListNode(2,
                new ListNode(6,
                new ListNode(3,
                new ListNode(4,
                new ListNode(5,
                new ListNode(6)))))));

        int val = 6;

        System.out.println("Original List:");
        printList(head);

        Solution sol = new Solution();
        head = sol.removeElements(head, val);

        System.out.println("After Removing " + val + ":");
        printList(head);
    }
}