package org.example;

public class AVL {
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

    public  int height(){
        return height(root);
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
        return rotate(node);
    }

    private Node rotate(Node node) {

        if(height(node.left)-height(node.right)>1){
            //left heavy case
            if(height(node.left.left)-height(node.left.right)>0){
                //left left case
              return rightrotate(node);
            }
            //left right case
            if(height(node.left.left)-height(node.left.right)<0){
                node.left= leftrotate(node.left);
                return rightrotate(node);


            }
        }

        if(height(node.left)-height(node.right)< -1){
            //right heavy case
            if(height(node.right.left)-height(node.right.right)<0){
                //right right case
                return leftrotate(node);
            }
            //right left case
            if(height(node.right.left)-height(node.right.right)>0){
                node.right= rightrotate(node.left);
                return leftrotate(node);


            }
        }
        return node;
    }

    private Node leftrotate(Node c) {
        Node p= c.right;
        Node t=p.left;

        p.left=c;
        c.right=t;

        p.height= Math.max(height(p.left),height(p.right)+1);
        c.height= Math.max(height(c.left),height(c.right)+1);


        return p;
    }

    private Node rightrotate(Node p) {
        Node c= p.left;
        Node t=c.right;

        c.right=p;
        p.left=t;

        p.height= Math.max(height(p.left),height(p.right)+1);
        c.height= Math.max(height(c.left),height(c.right)+1);


        return c;
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




}
