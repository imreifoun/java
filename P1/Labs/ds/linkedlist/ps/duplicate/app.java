class Main {

    /*
        Input: head = [1,1,2]
        Output: [1,2]

    */

    static ListNode deleteDuplicatesAI(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }


    static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode previous = head;
        while(current != null){
            previous = current;
            if (current.next != null){
                if (current.val == current.next.val){
                    if (current.next.next != null)
                        current.next = current.next.next;
                    else
                        current.next = null;
                    continue;
                }
            }
            current = current.next;
        }
        return head;
    }


    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(4);
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        
        ListNode s1 = n1;
        ListNode result = deleteDuplicates(s1);
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















