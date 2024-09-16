package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = tail = node;
            size += 1;
            return;
        }
        node.setNext(head);
        head = node;


        size += 1;


    }

    public void insertLast(int val) {
        if (head == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);

        tail.setNext(node);
        tail = node;

        size += 1;


    }

    public void insertMiddle(int val, int index) {
        if (head == null) {
            insertFirst(val);
            return;
        }

        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node node = new Node(val);
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.getNext();
        }

        node.setNext(temp.getNext());
        temp.setNext(node);

        size += 1;
    }

    public void display() {
        if (head == tail) {
            System.out.println("list empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print("[" + temp.getValue() + "]" + "-->");
            temp = temp.getNext();
        }

        System.out.print("END");

    }


    public void deleteFirst() {

        if (head.getNext() == null) {
            head = tail = null;
            size--;
            return;
        }

        head = head.getNext();
        size -= 1;

    }

    public void deleteLast() {

        if (head.getNext() == null) {
            head = tail = null;
            size--;
            return;
        }

        Node temp = head;

        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }

        tail = temp;
        tail.setNext(null);
        size--;

    }

    public void deleteGivenIndex(int index) {

        if (head.getNext() == null) {
            deleteFirst();
            return;
        }

        if (index == 0) {
            deleteFirst();
            return;
        }

        if (index == size - 1) {
            deleteLast();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.getNext();
        }

        Node temp2 = temp.getNext();

        temp.setNext(temp.getNext().getNext());
        temp2.setNext(null);
        size--;

    }






























//    public void insertFirst (int val){
//
//        Node node = new Node(val);
//
//        node.next = head;
//        head = node;
//
//        if(tail == null){
//            tail = head;
//        }
//
//        size += 1;
//
//    }
//
//    public void insertLast (int val){
//        if(head == null){
//            insertFirst(val);
//        }
//
//        Node node = new Node(val);
//
//        tail.next = node;
//        tail = node;
//
//    }
//
//
//    public void display(){
//        Node temp = head;
//        while(temp!= null){
//            System.out.print("["+temp.value+"]"+"-->");
//            temp = temp.next;
//
//        }
//
//        System.out.print("END");
//        System.out.println();
//
//
//
//    }







}