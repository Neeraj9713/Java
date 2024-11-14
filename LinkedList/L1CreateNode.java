import java.util.LinkedList;

public class L1CreateNode {
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

    public void addFirst(int data){
        Node newNode = new Node(data);                   //create new node
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;                            //newNode next = head
        head = newNode;                                 //head =newNode
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head ==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMid(int idx , int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    
    public int removeFirst(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    
    public int removeLast(){
        if(size ==0){
            System.out.println("ll is Empty");
            return Integer.MIN_VALUE;
        }else if( size == 1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        //prev : i = size-2;
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;           // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrsearch(int key){
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    
    public void print(){
        if(head == null){
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        L1CreateNode ll = new L1CreateNode();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.addMid(2,100);
        System.out.println(ll.size);
        ll.print();
        
        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();

        System.out.println(ll.itrsearch(3));
        System.out.println(ll.itrsearch(10));

        System.out.println(ll.size);
    }
    
}
