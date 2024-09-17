package Tree;

import java.util.Scanner;

public class BinaryTree {

    private Node root;
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

//    insert elements
    public void insertElement(Scanner scanner){
        System.out.println("Enter the root Node : ");
        int value = scanner.nextInt();
        root = new Node(value);

        insertElementHelper(scanner,root);
    }

    private void insertElementHelper(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of "+node.value);
        Boolean left = scanner.nextBoolean();

        if (left) {
            System.out.println("Enter the left value of "+node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            insertElementHelper(scanner,node.left);
        }

        System.out.println("Do you want to enter right of "+node.value);
        Boolean right = scanner.nextBoolean();

        if (right) {
            System.out.println("Enter the right value of "+node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            insertElementHelper(scanner,node.right);
        }
    }

    public void display(){
        displayHelper(root,"");
        prettyDisplayHelper(root,0);
    }

    private void prettyDisplayHelper(Node node, int level) {
        if(node == null){
            return;
        }

        prettyDisplayHelper(node.right,level+1);

        if (level != 0){
            for(int i = 0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);

        }else{
            System.out.println(node.value);
        }

        prettyDisplayHelper(node.left,level+1);
    }

    private void displayHelper(Node node, String indent) {

        if(node == null){
            return;
        }

        System.out.println(indent + node.value);
        displayHelper(node.left,indent + "\t");
        displayHelper(node.right,indent + "\t");

    }
    
    

}
