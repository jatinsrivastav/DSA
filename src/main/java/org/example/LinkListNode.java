package org.example;

public class LinkListNode {
    Node head;

    public void insert(int data) {

        Node node = new Node();/** this is the initial value which we  need to add **/
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {

            Node n = head; // it is call by the reference. Head will be updated also.
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
            head =n;


        }
    }

    public void show() {
        Node n = head;
        while ((n.next != null)) {
            System.out.println(n.data);
            n = n.next;
        }

        System.out.println((n.data));
    }
}
