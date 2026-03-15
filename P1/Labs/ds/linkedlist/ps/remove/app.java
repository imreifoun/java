class Main {

    /*
        Input: head = [1,2,2,3,4,5,6], val = 6
        Output: [1,2,3,4,5]


    */

    public ListNode removeElementsAI(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            if (current.val == val) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }

        return dummy.next;
    }


    static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy.next;
        ListNode prev = dummy;

        while (current != null){
            if (current.val == val){
                if (current.next != null){
                    prev.next = current.next;
                }else{
                    prev.next = null;
                }
                current = current.next;
                continue;
            }
            prev = current;
            current = current.next;
        }
        return dummy.next;
    }




    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(5);
        ListNode n7 = new ListNode(6);
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = null;

        
        ListNode s1 = n1;
        ListNode result = removeElements(s1, 2);
        while(result != null){
            System.out.println(" => " + result.val);
            result = result.next;
        }
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






