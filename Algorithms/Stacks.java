package Algorithms;

public class Stacks {
    int size;
    int top;
    int[] array;

    Stacks(int capacity){
        top = -1;
        size = capacity;
        array = new int[size];
    }

    public Stacks() {
        //TODO Auto-generated constructor stub
    }

    boolean isFull(){
        return (top == size -1);
    }
    boolean isEmpty(){
        return (top == -1);
    }

    void push(int item){
        if (isFull()){
            System.out.println("Stack Overflow");
        } else {
            array[top + 1] = item;
            top++;
        }
    }

    int pop(){
        int previousTop = top;
        if (isEmpty()){
            System.out.println("Stack overflow");
        } else {
            top--;
        }
        return previousTop;
    }
    void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}


