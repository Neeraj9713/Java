
import java.util.LinkedList;
public class L3Reverse {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data){
        Node Anew = new Node(data);
        if(head == null){
            head = tail = Anew;
            return ;
        }
        Anew.next = head;
        head = Anew;
    }

    public void print(){
        Node temp = head;
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node agla;
        while(curr != null){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        head = prev;
    }
    
    public static void main(String[] args) {
        L3Reverse ll = new L3Reverse();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.reverse();
        ll.print();
    }
}
