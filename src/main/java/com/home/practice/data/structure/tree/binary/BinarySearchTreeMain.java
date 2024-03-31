package com.home.practice.data.structure.tree.binary;

public class BinarySearchTreeMain {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(20);
        binarySearchTree.insert(15);
        binarySearchTree.insert(25);
        binarySearchTree.insert(5);
        binarySearchTree.insert(10);
        binarySearchTree.insert(35);
        binarySearchTree.insert(12);
        binarySearchTree.insert(27);

        //
        System.out.println("Inorder");
        binarySearchTree.inorder();
        System.out.println();

        System.out.println("Preorder");
        binarySearchTree.preOrderT();

        System.out.println();
        System.out.println("Postorder");
        binarySearchTree.postOrder();



    }
}
