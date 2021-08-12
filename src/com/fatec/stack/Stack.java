package com.fatec.stack;
// stack using array
public class Stack {
    private int top;
    private int size;
    private int[] stack;

    public Stack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    public boolean push(int data) {
        if (top == (size - 1)) {
            System.out.println("Stack OverFlow");
            return false;
        }
        top+=1;
        stack[top] = data;
        return true;
    }

    public int pop() {
        if(top < 0) {
            System.out.println("Stack UnderFlow");
            return 0;
        }

        int poppedItem = stack[top];
        top-=1;
        return poppedItem;
    }

    public int peek() {
        if (top < 0 ) {
            System.out.println("Stack is empty");
        }
        return stack[top];
    }

    public boolean contains(int target) {
        if (top<0) {
            System.out.println("Stack is empty");
            return false;
        }

        for (int i = 0; i <= top ; i++) {
            if (target == stack[i]) {
                return true;
            }
        }

        return false;
    }

}
