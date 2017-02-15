package com.example;

import java.util.Stack;

/**
 * 实现功能：
 * <p>
 * Created by lxs on 2017/2/15 22:46.
 */

public class Issue7stackToQueue<E> {
    Stack<E> mStack1 = new Stack();
    Stack<E> mStack2 = new Stack();

    E deleteHead() {// pop()
        E head;
        if (mStack1.isEmpty() && mStack2.isEmpty()) {
            return null;
        }
        if (mStack2.size() == 0) {
            while (!mStack1.isEmpty()) {
                mStack2.push(mStack1.pop());
            }
        }
        head = mStack2.pop();
        return head;
    }

    void appendTail(E item) {//push()
        mStack1.push(item);
    }

    public static void main(String[] args) {
        Issue7stackToQueue<Integer> stackToQueue = new Issue7stackToQueue<>();
        stackToQueue.appendTail(1);
        stackToQueue.appendTail(2);
        System.out.println(stackToQueue.deleteHead());
        stackToQueue.appendTail(3);
        System.out.println(stackToQueue.deleteHead());
        System.out.println(stackToQueue.deleteHead());
        System.out.println(stackToQueue.deleteHead());
    }
}
