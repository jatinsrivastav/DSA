package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        /*System.out.println( "Hello World!" );
        Scanner scanner =new Scanner(System.in);
        BinaryTree binaryTree =new BinaryTree();
        binaryTree.populate(scanner);
        //binaryTree.display();

        binaryTree.prettyDisplay();*/


        BST bst =new BST();
        int[] nums={5,8,9,2,7,4};
        bst.populate(nums);
        bst.display();
        System.out.println("Preorder");
        bst.PreOrder();
        System.out.println("Inorder");
        bst.InOrder();
        System.out.println("PostOrder");
        bst.PostOrder();

        /*int[] nums={1,2,3,4,5,6,7,8,9,10};
        bst.populateSortedArray(nums);
        bst.display();*/




    }
}
