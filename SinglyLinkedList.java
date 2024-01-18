/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysinglylinkedlist;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 *
 * @author Le Nhut Anh
 */
public class SinglyLinkedList<T> implements Iterable<T> {

    Node<T> head;
    Node<T> tail;

    public SinglyLinkedList() {
        head = tail = null;
    }

    public SinglyLinkedList(Node<T> head, Node<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        int count = 0;
        Node<T> currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.next;
            count++;
        }
        return count;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void add(T data, int index) throws IllegalAccessException {
        Node<T> currentNode = head;
        Node<T> newNode = new Node<>(data);
        int count = 0;
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        if (index < 0 || index > size()) {
            throw new IllegalAccessException("Index is invalid!");
        }

        while (count != index - 1) {
            currentNode = currentNode.next;
            count++;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;

    }

    public void add(T data) {
        addLast(data);
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" + "head=" + head + ", tail=" + tail + '}';
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> currentNode = head;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public T next() {
                T data = currentNode.data;
                currentNode = currentNode.next;
                return data;
            }
        };
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new RuntimeException("An empty list");
        }
        if (head == tail) {
            head = tail = null;
        }
        head = head.next;
    }

    public void removeLast() throws Exception {
        Node<T> currentNode = head;
        if (isEmpty()) {
            throw new RuntimeException("An empty list");
        }
        if (head == tail) {
            head = tail = null;
        }
        while (currentNode.next != tail) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        tail = currentNode;
    }

    public void remove(int index) throws Exception {
        Node<T> currentNode = head;
        int count = 0;
        if (isEmpty()) {
            throw new RuntimeException("An empty list");
        }
        if (index < 0 || index > size()) {
            throw new IllegalAccessException("Index is invalid!");
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size() - 1) {
            removeLast();
            return;
        }
        while (count != index - 1) {
            currentNode = currentNode.next;
            count++;
        }
        currentNode.next = (currentNode.next).next;
    }

    public T get(int index) throws Exception {
        int i = 0;
        Node<T> currentNode = head;
        if (index > size() || index < 0) {
            throw new Exception("Invalid index!");
        }
        while (i != index) {
            currentNode = currentNode.next;
            i++;
        }
        return currentNode.data;
    }

    public void set(int index, T data) throws Exception {
        int i = 0;
        Node<T> currentNode = head;
        if (index > size() || index < 0) {
            throw new Exception("Invalid index!");
        }
        while (i != index) {
            currentNode = currentNode.next;
            i++;
        }
        currentNode.data = data;
    }
}
