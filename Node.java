/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysinglylinkedlist;

/**
 *
 * @author CE181767 Le Nhut Anh
 */
public class Node<T> {

    T data;
    Node<T> next;

    public Node() {
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

}
