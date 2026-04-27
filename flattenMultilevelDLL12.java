public class flattenMultilevelDLL12 {

    
    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        Node(int val) {
            this.val = val;
        }
    }

    static class Solution {
        public Node flatten(Node head) {
            Node temp = head;

            while (temp != null) {
                Node t = temp.next;

                if (temp.child != null) {
                    Node c = flatten(temp.child);

                    temp.next = c;
                    c.prev = temp;

                    
                    while (c.next != null) {
                        c = c.next;
                    }

                    c.next = t;
                    if (t != null) t.prev = c;
                }

                temp.child = null;
                temp = t;
            }

            return head;
        }
    }

    
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        head.next = n2;
        n2.prev = head;
        n2.next = n3;
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;
        n4.next = n5;
        n5.prev = n4;

        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);

        n7.next = n8;
        n8.prev = n7;
        n8.next = n9;
        n9.prev = n8;

        Node n11 = new Node(11);
        Node n12 = new Node(12);

        n11.next = n12;
        n12.prev = n11;

        n3.child = n7;
        n8.child = n11;

        System.out.println("Original top-level list:");
        printList(head);

        Solution sol = new Solution();
        head = sol.flatten(head);

        System.out.println("Flattened list:");
        printList(head);
    }
}