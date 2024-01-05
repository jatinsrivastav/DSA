package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        LinkListNode linkListNode =new LinkListNode();
        linkListNode.insert(8);
        linkListNode.insert(5);
        linkListNode.insert(3);
        linkListNode.show();
    }
}
