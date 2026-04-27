public class oddEvenLL10 {

    
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
        public ListNode oddEvenList(ListNode head) {
            if (head == null || head.next == null) return head;

            ListNode odd = new ListNode(-1);
            ListNode even = new ListNode(-1);

            ListNode temp = head;
            ListNode tempo = odd;
            ListNode tempe = even;

            while (temp != null) {
                tempo.next = temp;
                tempo = tempo.next;

                temp = temp.next;

                tempe.next = temp;
                tempe = tempe.next;

                if (temp != null) temp = temp.next;
            }

            even = even.next;
            odd = odd.next;

            tempo.next = even;

            return odd;
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
                new ListNode(3,
                new ListNode(4,
                new ListNode(5)))));

        System.out.println("Original List:");
        printList(head);

        Solution sol = new Solution();
        head = sol.oddEvenList(head);

        System.out.println("After Odd-Even Rearrangement:");
        printList(head);
    }
}