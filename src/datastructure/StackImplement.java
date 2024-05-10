/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure;
import java.util.Scanner;
public class StackImplement implements StackInterface {
    Scanner input = new Scanner(System.in);
         int array[];
         int top = 0;
    @Override
    public void arraySize(int x){
        array = new int[x];
    }
    
    @Override
    public void push(int x){
        try{
           array[top] = x;
            System.out.println("Pushed: "+x);
            top = top +1; 
        }catch(Exception e){
            System.out.println("Stack is full or stack is not intialize");
        }
        
    }
    @Override
    public int pop(){
        try{
            int x = array[top-1];
            top--;
            return x;
        }catch(Exception e){
            System.out.println("Stack is Empty");
            return 0;
        }
        
    }
    @Override
    public int peek(){
        try{
            int x = array[top-1];
            return x;
        }catch(Exception e){
            System.out.println("Stack is Empty");
            return 0;
        }
    }
}
