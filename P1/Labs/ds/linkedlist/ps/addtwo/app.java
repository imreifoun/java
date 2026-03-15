import java.util.Stack;

class Main {

    /*
        List1: 7 → 2 → 4 → 3
        List2: 5 → 6 → 4    

    */

    public ListNode addTwoNumbersAI(ListNode l1, ListNode l2) {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while (l1 != null || l2 != null) {
            if (l1 != null){
                s1.push(l1.val);
                l1 = l1.next;
            }
            if (l2 != null){
                s2.push(l2.val);
                l2 = l2.next;
            }
        }

        int carry = 0;
        ListNode result = null;

        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {

            int sum = carry;

            if (!s1.isEmpty()) sum += s1.pop();
            if (!s2.isEmpty()) sum += s2.pop();

            ListNode node = new ListNode(sum % 10);
            node.next = result;
            result = node;

            carry = sum / 10;
        }

        return result;
    }



    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;

        String holder1 = "";
        String holder2 = "";

        while (p1 != null || p2 != null){
            if (p1 != null){
                holder1 += Integer.toString(p1.val);
                p1 = p1.next;
            }
            if (p2 != null){
                holder2 += Integer.toString(p2.val);
                p2 = p2.next;
            }
        }
        int extra = 0;
        String colletion = "";
        ListNode result = null;
        ListNode current = null;
        int size1 = holder1.length() - 1;
        int size2 = holder2.length() - 1;
        while (size1 >= 0 || size2 >= 0){
            if (size1 >= 0 && size2 >= 0){
                int v1 = holder1.charAt(size1) - '0';
                int v2 = holder2.charAt(size2) - '0';
                int total = v1 + v2 + extra;
                if (total >= 10){
                    String split = Integer.toString(total);
                    extra = split.charAt(0) - '0';
                    total = split.charAt(1) - '0';
                }else{
                    extra = 0;
                }
                colletion += Integer.toString(total);
                size1--;
                size2--;
                continue;

            }
            if (size1 >= 0 || size2 >= 0){
                int total;
                if (size1 >= 0){
                    total = holder1.charAt(size1) - '0' + extra;
                    if (total >= 10){
                        String split = Integer.toString(total);
                        extra = split.charAt(0) - '0';
                        total = split.charAt(1) - '0';
                    }else{
                        extra = 0;
                    }

                    size1--;
                }
                else{
                    total = holder2.charAt(size2) - '0' + extra;
                    if (total >= 10){
                        String split = Integer.toString(total);
                        extra = split.charAt(0) - '0';
                        total = split.charAt(1) - '0';
                    }else{
                        extra = 0;
                    }
                    size2--;
                }
                colletion += Integer.toString(total);
            }
        }
        if (extra > 0){
            colletion += Integer.toString(extra);
        }
        for (int i = colletion.length() - 1; i >= 0; i--){
            int digit = colletion.charAt(i) - '0';
            ListNode node = new ListNode(digit);
            if (result == null){
                result = node;
                current = node;
            }else{
                current.next = node;
                current = current.next;
            }

        }
        return result;
    }


    public static void main(String[] args) {
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(3);

        ListNode n6 = new ListNode(5);
        ListNode n7 = new ListNode(6);
        ListNode n8 = new ListNode(4);

        
        n1.next = null;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;


        n6.next = null;
        n7.next = n8;
        n8.next = null;

        
        ListNode s1 = n1;
        ListNode s2 = n6;
        ListNode result = addTwoNumbers(s1, s2);
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















