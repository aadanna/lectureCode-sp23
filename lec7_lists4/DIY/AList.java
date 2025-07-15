package lec7_lists4.DIY;

/** This is a fill in the blanks version of the SLList class
 *  in case you want to try to figure out how to write it yourself.
 *  After writing your methods, you can run the AListTest file.
 */

int size;
int item;
Node next;
Node prev;
Node sentinel;


public class AList {
    /** Creates an empty list. */
    private Node(Node before, int thingy, Node after) {

        this.next = after;
        this.item = thingy;
        this.prev = before;
        
    }
    
    
    public AList() {
        size = 0;
        sentinel = new Node(sentinel, -1, sentinel);
    }
    

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return 0;        
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return 0;        
    }

    /** Returns the number of items in the list. */
    public int size() {
        return this.size;        
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {
        return 0;
    }
} 
