
public class L4deleteFromLast {
    
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

    public void addFirst(int data){
        Node np = new Node(data);
        if(head == null){
            head = tail = np;
            return;
        }

        np.next = head;
        head = np;
    }

    public void addLast(int data){
        Node np = new Node(data);
        if(head == null){
            head = tail = np;
            return;
        }

        tail.next = np;
        tail = np;
    }

    public void addMid(int data , int index){
        if(index == 0){
            addFirst(data);
            return;
        }

        Node mid = new Node(data);
        Node temp = head;
        int i=0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }

        mid.next = temp.next;
        temp.next = mid;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void remNNode(int n ){
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        
        if(n == size){
            head = head.next;     // remove First
            return;
        }

        int i = 1;
        int del = size-n;
        Node prev = head;
        while(i < del){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        L4deleteFromLast ll = new L4deleteFromLast();
        ll.addFirst(1);
        ll.addLast(3);
        ll.addMid(2,1);
        ll.addMid(4,3);
        ll.remNNode(2);
        ll.print();


           
    }    
}

