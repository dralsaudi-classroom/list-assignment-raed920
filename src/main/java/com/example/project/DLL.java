package com.example.project;

public class DLL<T> {
	private DLLNode<T> head;
	private DLLNode<T> current;

    public DLL() {
        head = current = null;
    }
    public boolean empty() {
        return head == null;
    }
    public boolean last() {
        return current.next == null;
    }
    public boolean first() {
        return current.previous == null;
    }
    public boolean full() {
        return false;
    }
    public void findFirst() {
        current = head;
    }
    public void findNext() {
        current = current.next;
    }
    public void findPrevious() {
        current = current.previous;
    }
    public T retrieve() {
        return current.data;
    }
    public void update(T val) {
        current.data = val;
    }
    public void insert(T val) {
        DLLNode<T> tmp = new DLLNode<T>(val);
        if(empty()) {
            current = head = tmp;
        }
        else {
            tmp.next = current.next;
            tmp.previous = current;
            if(current.next != null)
                current.next.previous = tmp;
            current.next = tmp;
            current = tmp;
        }
    }
    public void remove() {
        if(current == head) {
            head = head.next;
            if(head != null)
               head.previous = null;
        }
        else {
            current.previous.next = current.next;
            if(current.next != null)
               current.next.previous = current.previous;
        }
        if(current.next == null)
            current = head;
        else
            current = current.next;
    }
    public void removeBetween(T e1, T e2) {
    DLLNode<T> x = null, y = null;
    current = head;

    // Step 1: Find node containing e1
    while (current != null && !current.data.equals(e1)) {
        current = current.next;
    }

    // If e1 is not found, return
    if (current == null) return;
    
    x = current; // x is the node with e1

    // Step 2: Continue from e1 and find node containing e2
    current = current.next; // Start after e1
    while (current != null && !current.data.equals(e2)) {
        current = current.next;
    }

    // If e2 is not found, return
    if (current == null) return;

    y = current; // y is the node with e2

    // Step 3: Remove all nodes between x and y
    x.next = y; // Skip all nodes between e1 and e2
    y.previous = x; // Link y's previous to e1

    // Step 4: Move current to head after successful removal
    current = head;


       
        // throw new UnsupportedOperationException("Not supported yet.");
        // Write the method removeBetween, member of the class DoubleLinkedList. The method
        // takes two elements e1 and e2, and removes all the elements between the two elements
        // (e1 and e2 not included). If e1 or e2 or both doesn’t exist, no element will be removed. You can assume the elements to be unique, e1 comes before e2, and that
        // e1 ̸= e2. Current is moved to head if the removal is successful. Do not call any
        // methods and do not use any auxiliary data structures. The method signature
        // is: public void removeBetween(T e1, T e2).
        // Example 3.1. Given the list: A ↔ B ↔ C ↔ D ↔ E ↔ F, removeBetween(’B’,
        // ’E’) results in: A ↔ B ↔ E ↔ F.
    }
}
