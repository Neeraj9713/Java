import java.util.LinkedList;
public class L2recNode {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data  = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node neeraj1 = new Node(data);
        size++;
        if(head == null){
            head = tail = neeraj1;
            return ;
        }
        neeraj1.next = head;
        head = neeraj1;
    }

    public static void addLast(int data){
        Node last = new Node(data);
        size++;
        if(head == null){
            head= tail = last;
            return;
        }
        tail.next = last;
        tail = last;
    }

    public void print(){
        if(head == null){
            System.out.println("LL is Empty");
            return ;
        }
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public int helper(Node head , int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recsearch(int key){
        return helper(head , key);
    }

    public static void main(String[] args) {
        L2recNode ll = new L2recNode();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();

        System.out.println(ll.recsearch(2));
    }

}
