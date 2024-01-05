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

        System.out.println( "Hello World!" );
        Scanner scanner =new Scanner(System.in);
        BinaryTree binaryTree =new BinaryTree();
        binaryTree.populate(scanner);
        binaryTree.display();


    }
}
