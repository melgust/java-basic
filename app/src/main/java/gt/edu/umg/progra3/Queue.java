/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.progra3;

/**
 *
 * @author melgust
 */
public class Queue {
    
    Node root = null, last;
    
    public boolean isEmpty() {
        if (root == null) {
            return true;
        }
        return false;
    }
    
    public void push(int data) {
        Node tmp = new Node(data);
        if (isEmpty()) {
            root = tmp;
            last = tmp;
        } else {
            last.next = tmp;
            last = tmp;
        }
    }
    
    public void printAll() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            while (root.next != null) {
                System.out.println(root.data);
                root = root.next;
            }
            System.out.println(root.data);
        }
    }
    
    public void pop() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println(root.data);
            root = root.next;
        }
    }
    
}
