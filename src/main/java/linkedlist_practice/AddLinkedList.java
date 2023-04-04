package linkedlist_practice;

public class AddLinkedList {
    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
        public Node(){

        }
    }

    public static Node addLinkedList(Node head1, Node head2){
        if(head1==null && head2==null){
            return null;
        }

        Node head3 = null;
        Node temp = null;
        int carry = 0;
        while (head1!=null && head2!=null){
            int sum = head1.val + head2.val + carry;
            if(sum > 9){
                carry = sum / 10;
                sum = sum % 10;
            }else{
                carry = 0;
            }
            Node newNode = new Node(sum);
            if(head3 == null){
                head3 = newNode;
                temp = head3;
            }else{
                temp.next = newNode;
                temp=temp.next;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        if(head1==null){
            while(head2!=null){
                int sum = head2.val + carry;
                if(sum > 9){
                    carry = sum / 10;
                    sum = sum % 10;
                }else{
                    carry = 0;
                }
                Node newNode = new Node(sum);
                temp.next = newNode;
                head2= head2.next;
            }
        }
        if(head2==null){
            while(head1!=null){
                int sum = head1.val+carry;
                if (sum > 9) {
                    carry = sum / 10;
                    sum = sum % 10;
                }else{
                    carry = 0;
                }
                Node newNode = new Node(sum);
                temp.next = newNode;
                head1 = head1.next;
            }
        }
        return head3;
    }

    public static Node addTwoNumber(Node l1, Node l2){
        if(l1==null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        int carry = 0;
        Node res = new Node(); // dummy node
        Node ptr = res;
        while(l1!=null || l2!=null || carry!=0){
            if(l1!=null){
                carry = carry + l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                carry = carry + l2.val;
                l2 = l2.next;
            }
            ptr.next = new Node(carry%10);
            ptr = ptr.next;
            carry = carry/10;
        }

        return res.next;
    }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        Node head2 = new Node(4);
        head2.next = new Node(5);

        Node head3 = addLinkedList(head1, head2);
        Node res = addTwoNumber(head1, head2);
        while(head3!= null){
            System.out.print(head3.val+"->");
            head3 = head3.next;
        }
        System.out.println();
        while(res!= null){
            System.out.print(res.val+"->");
            res = res.next;
        }
    }
}
