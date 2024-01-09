package org.example;

public class BST {
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;


        public Node(int value) {
            this.value = value;
        }


        public int getValue() {
            return value;
        }


    }

    private Node root;

    public BST() {

    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }


    public boolean isEmpty() {
        return root == null;
    }


    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {

        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public boolean balancedTree() {
        return balancedTree(root);
    }

    private boolean balancedTree(Node node) {
        if (node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balancedTree(node.left) && balancedTree(node.right);
    }


    public void display() {
        display(this.root, "Root node :");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "left child of " + node.value + ":");
        display(node.right, "right child of " + node.value + ":");
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void populateSortedArray(int[] nums){
        populateSortedArray(nums, 0, nums.length);

    }

    private void populateSortedArray(int[] nums, int start, int end) {
      if (start>=end){
          return;
      }


       int mid =(start+end)/2;
       this.insert(nums[mid]);
       populateSortedArray(nums, start, mid);
       populateSortedArray(nums, mid+1, end);

    }
}
