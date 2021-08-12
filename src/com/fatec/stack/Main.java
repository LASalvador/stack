package com.fatec.stack;

public class Main {
    public static void main(String[] args) {
        // s = []
        Stack s = new Stack(3);
        // s = [1], top = 0
        s.push(1);
        // s = [1,2], top = 1
        s.push(2);
        // s = [1,2,3], top = 2
        s.push(3);
        // s = [1,2,3], top = 3, should print stackOverFlow
        s.push(4);
        // should print 3
        System.out.println("Peek: " + s.peek());
        // should return false
        s.contains(4);
        // should return true
        s.contains(3);
        // POP 1: 3
        System.out.println("POP 1:" + s.pop());
        // POP 2: 2
        System.out.println("POP 2:" + s.pop());
        // POP 3: 1
        System.out.println("POP 3:" + s.pop());

        // should print StackUnderFlow
        s.pop();
    }
}
