/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure;

public class QueueImplement implements QueueInterface {
    @Override
    public void zihad(){
        System.out.println("Hello zihad");
    }
    static Object[] queue;
    int front = 0, reare = 0,total_item = 0;
    void arraySize(int x){
        queue = new Object[x];
    }
    void OurQueue(){
        System.out.print("[");
        for (int i = 0; i < queue.length; i++) {         
            System.out.print(queue[i]+", ");
        }
        System.out.print("]");
    }
    boolean isFull(){
        if(queue.length == total_item){
            return true;
        }
        return false;
    }
    boolean isEmpty(){
        if(total_item == 0){
            return true;
        }
        return false;
    }
    @Override
    public void enqueue(Object x){
        if(x instanceof Integer){
            int value = ((Integer) x);
            if(isFull()){
                System.out.println("your queue is full");
                return;
            }
            queue[reare] = value;
                reare = (reare+1)%(queue.length);
                total_item++;
        }else if(x instanceof Float){
           if(isFull()){
               System.out.println("Your queue is full");
               return;
           } 
           float value = (Float)x;
           queue[reare] = value;
           reare = (reare + 1)%queue.length;
           total_item++;
        }else{
             if(isFull()){
               System.out.println("Your queue is full");
               return;
           } 
           queue[reare] = x;
           reare = (reare+1)%queue.length;
           total_item++;//1,2,3,4,
        }
    }
    @Override
    public void dequeue(){
           if(isEmpty()){
               System.out.println("Your Queue is Empty");
               return;
           }
           Object value = queue[front];
           System.out.println("Your Dequeue item is : "+ value);
           front = (front+1)%queue.length;
           total_item--;//3,2,1,
           
        
    }
}
