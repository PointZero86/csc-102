package lab6;

import java.util.NoSuchElementException;

/**
 * Class For The Creation & Management Of Linked Lists
 * @author Jorge Luis Pabon
 * @version 1.0
 */
public class LinkedNodes { // One Must Imagine A Train...
    private Node first; // Node Variable That Looks At The 1st Element
    // private Node last; // Node Varaible That Looks At The Last Element

    // Constructor
    public LinkedNodes() {
        first = null; // Reference To 1st Element
        // last = null; // Reference To Last Element
    }

    /**
     * Get 1st Element In The List
     * @return 1st Element In The List
     * @throws NoSuchElementException If List Is Empty
     */
    public Object getFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.data;    
    }

    /**
     * Get Last Element In The List
     * @return Last Element In The List
     * @throws NoSuchElementException If List Is Empty
     */
    public Object getLast() {
        // Caboose -> Traveling To -> Locomotive
        if (first == null) { // There Was Never A List..
            throw new NoSuchElementException();
        }
        Node currentNode = first; // Start At The Caboose
        while (currentNode.next != null) { // While We Can Go Forward..
            currentNode = currentNode.next; // Move Forward!
        }
        return currentNode.data; // Return Last Element In List
    }

    /**
     * Add An Element To The Beginning Of The List
     * @param element to add
     */
    public void addFirst(Object element) {
        Node newNode = new Node(); // New Node Created
        newNode.data = element; // Store The Element We Want To Add
        newNode.next = first; // "Moving" The 1st Element Up
        first = newNode; // 1st Element Is Now Added
    }

    /**
     * Add An Element To The End Of The List
     * @param element to add
     */
    public void addLast(Object element) {
        Node currentNode = first; // Start At The Caboose
        while (currentNode.next != null) { // While We Can Go Forward..
            currentNode = currentNode.next; // Move Forward!
        }
        Node newNode = new Node(); // Create New Node At The End
        newNode.data = element; // Store The Element We Want To Add
        currentNode.next = newNode; // Link The Last Node To The New Node
    }

    /**
     * Find An Element In The List
     * @param element to find
     * @return the node containing the element
     */
    public Object find(Object element) {
        Node currentNode = first; // Start At The Back
        while (currentNode.data != element) { // While We Haven't Found It..
            currentNode = currentNode.next; // Move Forward!
        }
        return currentNode; // Return The Node Containing The Element
    }

    /**
     * Remove An Element From The Beginning
     * @param element to remove
     */
    public Object removeFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        Object holdingElement = first.data; // Save Whatever That Was
        first = first.next; // Eyes Moved To 2nd Element
        return holdingElement;        
    }

    /**
     * Remove An Element From The End
     * @param element to remove
     */
    public Object removeLast(Object element) {
        Node tempNode; // For Use Later
        if (first == null) {
            throw new NoSuchElementException();
        }
        while (first.next != null) { // While We Can Go Forward..
            tempNode = first; // Eh
            first = first.next; // Move Forward!
            if (first == null) {
            }
        }
        Object holdingElement = first.data; // Save Whatever That Was
        first = null; // Remove The Last Element
        return holdingElement;
    }





    /**
     * Node Inner Class To Store Element & Reference To Next Node
     */
    static class Node {
        public Object data;
        public Node next;
    }

    /**
     * Linked List Iterator Inner Class
     */
    class LinkedListIterator implements ListIterator {
        private Node position;
        private Node previous;
        private boolean isAfterNext;
        public LinkedListIterator() {
            position = null;
            previous = null;
            isAfterNext = false;
        }

        @Override
        public boolean hasNext() {
            if (position == null) {
                return first != null;
            }
            else {
                return position.next != null;
            }
        }

        @Override
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            previous = position;
            isAfterNext = true;
            if (position == null) {
                position = first;
            }
            else {
                position = position.next;
            }
            return position.data;
        }

        public void remove() {
            if (!isAfterNext) {
                throw new IllegalStateException();
            }
            if (position == first) {
                removeFirst();
            }
            else {
                previous.next = position.next;
            }
            position = previous;
            isAfterNext = false;
        }
    }


    public ListIterator listIterator() {
        return new LinkedListIterator();
    }
}
