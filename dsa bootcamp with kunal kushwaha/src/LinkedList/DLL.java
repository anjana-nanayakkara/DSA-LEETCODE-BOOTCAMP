package LinkedList;

public class DLL {

    Node head;
    Node tail;

    public void insertFirst(int val){



        Node node = new Node(val);

        if (head == null){
            head = tail = node;
            node.next = tail;
            tail.prev = node;
            tail.next = null;
            return;
        }



        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }

        head = node;
    }

    public void insertLast(int val){

        Node node = new Node(val);

        if (head == null){
            insertFirst(val);
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }



        temp.next=node;
        node.prev = temp;
        tail = node;

    }

    public void insertMiddle(int val, int index){
        if(head == null || index == 0){
            insertFirst(val);
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        if(temp.next == null){
            insertLast(val);
            return;
        }

        Node node = new Node(val);

        node.next=temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;

    }



    public void display(){
        Node temp = head;

        System.out.print("null<-->");

        while(temp!=null){
            System.out.print("[" + temp.value + "]" + "<-->");
            temp = temp.next;
        }

        System.out.println("null");


    }

    public void displayPrev(){
        Node temp = tail;

        System.out.print("null<-->");

        while(temp!=null){
            System.out.print("[" + temp.value + "]" + "<-->");
            temp = temp.prev;
        }

        System.out.println("null");


    }



    class Node{
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
