/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PalindromeWithStacks;

/**
 *
 * @author harsh
 */
import java.util.LinkedList;

/**
 *
 * @author Harshilkumar Vaghela(3116318);
 * @date September 30,2020(Lab3);
 */
public class LinkedJavaStack<E> implements Stack<E> {

    private LinkedList<E> linkedStack = new LinkedList<>(); // an empty list

    public LinkedJavaStack() {
    } // new stack relies on the initially empty list

    public int size() {
        return linkedStack.size();
    }

    public boolean isEmpty() {
        return linkedStack.isEmpty();
    }

    public void push(E element) {
        linkedStack.addFirst(element);
    }

    @Override
    public E top() {
        return linkedStack.peekFirst();
    }

    public E pop() {
        return linkedStack.removeFirst();
    }
}

