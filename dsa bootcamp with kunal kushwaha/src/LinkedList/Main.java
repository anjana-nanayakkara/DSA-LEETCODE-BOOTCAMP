package LinkedList;

public class Main {

    public static void main(String[] args) {
        LL list = new LL();
        LL list2 = new LL();

//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(1);
//        list.insertFirst(7);
//        list.display();
//        System.out.println();

//        list2.insertLast(3);
//        list2.insertLast(4);
//        list2.insertLast(1);
//        list2.insertLast(7);
//        list2.display();
//        System.out.println();
//
//        list2.insertMiddle(10,3);
//        list2.display();
//        System.out.println();

//        list2.deleteFirst();
//        list2.display();
//
//        System.out.println();
//
//        list2.deleteLast();
//        list2.display();
//        System.out.println();
//        list2.deleteLast();
//        list2.display();

//        list2.deleteGivenIndex(4);
//        list2.display();
//
//        System.out.println();
//
//        System.out.println();

//  -------------------------------------------------------

        DLL Dlist = new DLL();
        DLL Dlist2 = new DLL();

//        Dlist.insertFirst(2);
//        Dlist.insertFirst(4);
//        Dlist.insertFirst(5);
//        Dlist.insertFirst(1);
//
//        Dlist.display();
//        System.out.println();
//        Dlist.displayPrev();
//        System.out.println();

        Dlist2.insertLast(2);
        Dlist2.insertLast(4);
        Dlist2.insertLast(5);
        Dlist2.insertLast(1);

        Dlist2.display();
        System.out.println();

        Dlist2.insertMiddle(15,4);
        Dlist2.display();
        System.out.println();
    }
}
