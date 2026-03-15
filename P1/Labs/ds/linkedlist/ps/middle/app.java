class Main {

    /*
        Input: head = [1,2,3,4,5]
        Output: [3,4,5]

    */

    static ListNode middleNodeAI(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }



    static ListNode middleNode(ListNode head) {

        int length = 0;
        ListNode current = head;
        while (current != null){
            length++;
            current = current.next; 
        }
        int middle = 0;
        int counter = 1;
        if (length % 2 == 0)
            middle = (length + 1) / 2;
        else
            middle = length / 2;

        //System.out.println(" [info] " + (2%2 == 0));
        
        current = head;
        while (current != null){
            if (counter == middle){
                System.out.println(" [counter] " + counter);
                System.out.println(" [middle] " + middle);
                System.out.println(" [current] " + current.val);
                if (length % 2 == 0)
                    return current.next;
                return current;
            }
            counter++;
            current = current.next; 
        }


        return null;

    }


    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(6);
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;
        n7.next = null;

        
        ListNode s1 = n1;
        ListNode result = middleNode(s1);
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






