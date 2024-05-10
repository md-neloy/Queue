/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        StackInterface myobj;
        myobj  = new StackImplement();
        myobj.arraySize(3);
        myobj.push(3);
        myobj.push(4);
        myobj.push(5);
        myobj.pop();
        myobj.pop();
        myobj.pop();
        int pop = myobj.pop();
        System.out.println(pop);
        System.out.println(myobj.peek());
        Stack  mystack = new Stack();
        mystack.add(2343);
        mystack.add(2343);
        mystack.add(23434);
        mystack.add(2343);
        System.out.println("pop item from build in stack: "+mystack.pop());
        System.out.println("peek item form build in stack: " +mystack.peek());
        QueueInterface myobj1;
        QueueImplement myobj2 = new QueueImplement();
        myobj2.arraySize(3);
        myobj1 = new QueueImplement();
        myobj1.enqueue("Mahmudul");
        myobj1.enqueue("Nuzhat");
        myobj1.enqueue("World");
        myobj2.OurQueue();
        myobj1.enqueue(38);
        myobj1.dequeue();
        myobj1.dequeue();
        myobj1.dequeue();
    }
}
