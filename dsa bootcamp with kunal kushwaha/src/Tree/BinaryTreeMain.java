package Tree;

import java.util.Scanner;

public class BinaryTreeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.insertElement(scanner);
        binaryTree.display();
    }
}
