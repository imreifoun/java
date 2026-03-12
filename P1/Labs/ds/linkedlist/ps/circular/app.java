class Main {

    static boolean hasCycle(ListNode head) {
        ListNode current = head;

        while (current != null) {
            ListNode detector = head;

            while (detector != current) {
                if (detector == current.next)
                    return true; 
                detector = detector.next;
            }

            if (current.next == current)
                return true;
            current = current.next;
        }

        return false;
    }


    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        
        ListNode head = n1;
        System.out.println(hasCycle(n1));
    }
}

class ListNode {
    int val;
    ListNode next;
        
    ListNode(int x) {
        val = x;
        next = null;
    }
}















