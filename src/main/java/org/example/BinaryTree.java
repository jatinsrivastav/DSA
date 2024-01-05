package org.example;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree() {

    }


    private static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;

        }
    }

    private Node root;

    public void populate(Scanner scanner) {
        System.out.println("Enter the root node :");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);

    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("do you want to add in the left of " + node.value);
         boolean left = scanner.nextBoolean();

       /** check left is provided true or false otherwise return same line**/
        if (left) {
            System.out.println("Enter the value in the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left); // recursion will be performed here

        }



        System.out.println("do you want to add in the right of " + node.value);
        boolean right = scanner.nextBoolean();

        if (right) {
            System.out.println("Enter the value in the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);

        }
    }

    public void display(){
        display(root, "");
    }

    private void display(Node node, String indent) {

        if (node==null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");
    }
}
