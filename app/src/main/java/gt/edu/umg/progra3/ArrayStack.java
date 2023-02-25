package gt.edu.umg.progra3;

/**
 *
 * @author melgust
 */
public class ArrayStack {
    
    final int MAXIMUM_SIZE = 10;
    int[] data = new int[MAXIMUM_SIZE];
    int peak = 0;
    
    public boolean isFull() {
        return peak == MAXIMUM_SIZE;
    }
    
    public boolean isEmpty() {
        return peak == 0;
    }
    
    public void push(int dato) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        data[peak] = dato;
        peak++;
    }
    
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(data[peak - 1]);
            peak--;
        }
    }
    
    public void printAll() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = peak - 1; i >= 0; i--) {
                System.out.println(data[i]);
                peak--;
            }
        }
    }
    
}
