package lab6;

/**
 * Generic Linked List Iterator Interface
 * @author Jorge Luis Pabon
 * @version 1.0
 */
public interface ListIterator {
    /**
     * Should Move Iterator To The Next Element
     * @return the next element
     */
    Object next();

    /**
     * Is There An Element In The Next Position?
     * @return true if there is an element
     */
    boolean hasNext();

    /* Unused
     * Add An Element To The Position Before The Iterator
     * And The Iterator Will Be After It
     * Think Of It Like A Text Cursor
     * @param element element to add
    void add(Object element);
    */ 

}
