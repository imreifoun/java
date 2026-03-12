class Main {

    /*
        Input: list1 = [1,2,4], list2 = [1,3,4]
        Output: [1,1,2,3,4,4]

    */


    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode follows = null;
        ListNode areifoun = null;

        ListNode s1 = list1;
        ListNode s2 = list2;

        while (s1 != null || s2 != null){
            if (s1 != null && s2 != null){
                if (s1.val < s2.val){
                    if (areifoun == null){
                        areifoun = s1;
                        follows = areifoun;
                    } else{
                        follows.next = s1;
                        follows = follows.next;
                        
                    }
                    s1 = s1.next;
                }else{
                    if (areifoun == null){
                        areifoun = s2;
                        follows = areifoun;
                    } else{
                        follows.next = s2;
                        follows = follows.next;
                    }
                    s2 = s2.next;
                }
            }
            else{
                if (s1 != null){
                    while(s1 != null){
                        if (areifoun == null){
                            areifoun = s1;
                            follows = areifoun;
                        } else{
                            follows.next = s1;
                            follows = follows.next;
                        }
                        s1 = s1.next;
                    }
                    break;
                }
                if (s2 != null){
                    while(s2 != null){
                        if (areifoun == null){
                            areifoun = s2;
                            follows = areifoun;
                        } else{
                            follows.next = s2;
                            follows = follows.next;
                        }
                        s2 = s2.next;
                    }
                    break;
                }
            }
        }
        return areifoun;
    }


    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(4);

        ListNode n6 = new ListNode(1);
        ListNode n7 = new ListNode(3);
        ListNode n8 = new ListNode(4);

        
        n1.next = n2;
        n2.next = n3;
        n3.next = null;


        n6.next = n7;
        n7.next = n8;
        n8.next = null;

        
        ListNode s1 = n1;
        ListNode s2 = n6;
        ListNode result = mergeTwoLists(s1, s2);
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















