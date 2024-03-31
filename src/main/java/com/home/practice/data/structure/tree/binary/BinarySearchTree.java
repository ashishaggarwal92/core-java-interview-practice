package com.home.practice.data.structure.tree.binary;

public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public Node search(int data) {

        return null;
    }

    public void insert(int data) {

        root = insertRecord(root, data);
    }

    private Node insertRecord(Node root, int data) {

        if (root == null) {
            root = new Node(data);
            return root;
                    
        } else if (data < root.data) {
            // left insert
            root.left = insertRecord(root.left, data);

        } else if (data > root.data) {
            // right insert
            root.right = insertRecord(root.right, data);
        }

        return root;


    }

    public void preOrderT() {
        preorderRec(root);
    }

    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    void inorder() { inorderRec(root); }

    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public void postOrder() {
        postorderRec(root);
    }

    private void postorderRec(Node root) {
        if (root != null) {
            preorderRec(root.left);
            preorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

}
