/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author jchicas
 * @param <E>
 */


public class ColasCirculares <E>  {

    protected Node<E> tail;
    protected int count;

    public ColasCirculares() 
    {
        tail = null;
        count = 0;
    }

    /**
     *
     * @param value
     */

    public void addFirst(E value) 


    {

        Node<E> temp = new Node<E>(value);
        if (tail == null) { // first value added
            tail = temp;
            tail.setNext(tail);
        } else { // element exists in list
            temp.setNext(tail.next());
            tail.setNext(temp);
        }
        count++;
    }

    /**
     *
     * @return
     */

    public E removeLast() // pre:
    {

        
        Node<E> finger = tail;
        while (finger.next() != tail) {
            finger = finger.next();
        }

// finger now points to second-to-last value

        Node<E> temp = tail;
        if (finger == tail) {
            tail = null;
        } else {
            finger.setNext(tail.next());
            tail = finger;
        }
        count--;
        return temp.value();

    }
}




