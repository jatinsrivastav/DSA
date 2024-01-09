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

        AVL avl =new AVL();
        for (int i =0; i< 1000; i++){
            avl.insert(i);
        }
        System.out.println(avl.height());




    }
}
