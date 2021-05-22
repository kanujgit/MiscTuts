package com.kdroid.kotlintuts.java.datastructure.linkedlist;

public class LinkedListDemo {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void addFirstNode(int newNode) {
        Node node = new Node(newNode);
        node.next = head;
        head = node;
    }

    public void insertAfter(Node prevNode, int newData) {
        if (prevNode == null) {
            System.out.println("Node is null");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void insertAtTheEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return;
    }

    public void insetNodeAtPosition(int data, int pos) {

        Node node = new Node(data);
        if (pos < 1) {
            System.out.print("Invalid position");
            return;
        }

        if (pos == 1) {
            node.next = head;
            head = node;
        } else {
            Node ptr = head;
            int count = pos;
            while (count > 1 && ptr.next != null) {
                count--;
                pos = count;
                ptr = ptr.next;
            }
            node.next = ptr.next;
            ptr.next = node;
        }
        if (pos != 1) {
            System.out.println("Invalid Position");
            return;
        }
    }

    /**
     * Problem-24
     * How will you find the middle of the linked list?
     */
    private void insertAtMid(int data) {

        if (head == null) {
            head = new Node(data);
        } else {
            Node node = new Node(data);
            Node ptr = head;
            int len = 0;
            while (ptr != null) {
                len++;
                ptr = ptr.next;
            }
            int count = ((len % 2 == 0) ? len / 2 : (len + 1) / 2);
            ptr = head;
            while (count > 1) {
                count--;
                ptr = ptr.next;
            }
            node.next = ptr.next;
            ptr.next = node;
        }
    }

    /**
     * Check whether the given linked list is either NULL-terminated or ends in a cycle
     * (cyclic).
     */
    public void detectLoop() {
        Node fastPtr = head;
        Node slowPtr = head;
        while ((fastPtr.next != null) && slowPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) {
                System.out.println("Detect loop");
            }
        }

    }

    /**
     * Problem-15
     * Insert a node in a sorted linked list.
     * Solution: Traverse the list and find a position for the element and insert it.
     */
    public void insertElementInSortedList(Node newNode) {
        Node current;
        if (head == null || head.data >= newNode.data) {
            newNode.next = head;
            head = newNode;
        } else {
            current = head;
            while (current.next != null && current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        printList();
    }

    /**
     * Reverse a singly linked list.
     */
    private void reverseList(Node head) {
        Node tmp = null;
        Node nextNode = null;
        while (head != null) {
            nextNode = head.next;
            head.next = tmp;
            tmp = head;
            head = nextNode;
        }
        printList(tmp);
    }

    /**
     * Find nTh node from end
     */
    public void findNthNodeFromEnd(int pos) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            int totalLen = 0;
            Node ptr = head;
            while (ptr != null) {
                totalLen++;
                ptr = ptr.next;
            }

            ptr = head;
            int actualItemPosition = totalLen - pos;
            while (actualItemPosition-- > 0) {
                ptr = ptr.next;
            }
            System.out.println(ptr.data);
        }

    }

    private void insertAtMidOWithSingleTraversal(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        } else {
            Node newNode = new Node(data);
            Node slowPtr = head;
            Node fastPtr = head.next;
            while (fastPtr != null && fastPtr.next != null) {
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next.next;
            }
            newNode.next = slowPtr.next;
            slowPtr.next = newNode;

        }
    }

    public void deleteNodeByGivenKey(int key) {
        Node tmp = head;
        Node prev = null;

        if (tmp != null && tmp.data == key) {
            head = tmp.next;
            return;
        }
        while (tmp != null && tmp.data != key) {
            prev = tmp;
            tmp = tmp.next;
        }
        if (tmp == null) {
            return;
        }
        prev.next = tmp.next;

    }


    public void printList() {
        // traversing the list
        Node node = head;
        while (node != null) {
            System.out.print(node.data + "\t");
            node = node.next;
        }
    }

    public void printList(Node list) {
        // traversing the list
        //Node node = head;
        while (list != null) {
            System.out.print(list.data + "\t");
            list = list.next;
        }
    }

    public static void main(String[] args) {
        LinkedListDemo demo = new LinkedListDemo();
        demo.addFirstNode(5);
        demo.addFirstNode(4);
        demo.addFirstNode(3);
        demo.addFirstNode(2);
        demo.addFirstNode(1);

//        demo.insertAfter(demo.head.next, 3);
//        demo.insertAtTheEnd(5);
//        demo.insetNodeAtPosition(101, 3);
//        demo.insertAtMid(11);
//        demo.insertAtMidOWithSingleTraversal(111);
//        demo.deleteNodeByGivenKey(1);


        System.out.println("Linked List is created \n");
        demo.printList();
        System.out.println("\n--------------------");
        //demo.findNthNodeFromEnd(3);
        //Node node = new Node(12);

        //demo.insertElementInSortedList(node);
        demo.reverseList(demo.head.next);

    }


    /**
     * Problem-36
     * If we want to concatenate two linked lists which of the following gives O(1)
     * complexity?
     * 1) Singly linked lists
     * 2) Doubly linked lists
     * 3) Circular doubly linked lists
     * Solution: Circular Doubly Linked Lists. This is because for singly and doubly linked lists, weneed to traverse the first list till the end and append the second list.
     * But in the case of circular doubly linked lists we don’t have to traverse the lists.
     */

    /**
     * Problem-37
     * How will you check if the linked list is palindrome or not?
     * Solution:
     * Algorithm:
     * 1.Get the middle of the linked list.
     * 2.Reverse the second half of the linked list.
     * 3.Compare the first half and second half.
     * 4.Construct the original linked list by reversing the second half again and
     * attaching it back to the first half.
     */

    /**
     * Problem-38
     * Is it possible to get O(1) access time for Linked Lists?
     *
     * Ans:Create a linked list and at the same time keep it in a hash table. For n elements we
     * have to keep all the elements in a hash table which gives a preprocessing time of O(n).To read
     * any element we require only constant time O(1) and to read n elements we require n * 1 unit of
     * time = n units. Hence by using amortized analysis we can say that element access can be
     * performed within O(1) time.
     * Time Complexity – O(1) [Amortized]. Space Complexity - O(n) for Hash Table.
     */

    /**
     * Problem-54
     * Which sorting algorithm is easily adaptable to singly linked lists?
     * Solution: Simple Insertion sort is easily adabtable to singly linked lists. To insert an element, the
     * linked list is traversed until the proper position is found, or until the end of the list is reached. It
     * is inserted into the list by merely adjusting the pointers without shifting any elements, unlike in the
     * array. This reduces the time required for insertion but not the time required for searching for the
     * proper position.
     */

    /**
     * Problem-56
     * Given two sorted linked lists, given an algorithm for the printing common
     * elements of them.
     * Solution: The solution is based on merge sort logic. Assume the given two linked lists are: list1
     * and list2. Since the elements are in sorted order, we run a loop till we reach the end of either of
     * the list. We compare the values of list1 and list2. If the values are equal, we add it to the common
     * list. We move list1/list2/both nodes ahead to the next pointer if the values pointed by list1 was
     * less / more / equal to the value pointed by list2.
     * Time complexity O(m + n), where m is the lengh of list1 and n is the length of list2. Space
     * Complexity: O(1).
     */

}
