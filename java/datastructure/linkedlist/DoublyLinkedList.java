package com.kdroid.kotlintuts.java.datastructure.linkedlist;

public class DoublyLinkedList {

    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;

        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    private void insertAfter(Node preNode, int data) {
        if (preNode == null) {
            printMessage("Node can't be null");
            return;
        }

        Node newNode = new Node(data);
        //
        newNode.next = preNode.next;
        //
        preNode.next = newNode;
        //
        newNode.prev = preNode;
        //
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }


    }

    private void deleteNode(Node del) {
        if (head == null || del == null) {
            printMessage("Nor can't be null");
        } else {


            if (head == del) {
                head = del.next;
            }
            if (del.next != null) {
                del.next.prev = del.prev;
            }
            if (del.prev != null) {
                del.prev.next = del.next;
            }
        }
        return;

    }

    private void printMessage(String msg) {
        System.out.println(msg);
    }

    public void printList() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " \t");
            ptr = ptr.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.push(12);
        dll.push(13);
        dll.push(14);
        dll.insertAfter(dll.head.next, 1);
        dll.deleteNode(dll.head.next);
        dll.printList();
    }
}
