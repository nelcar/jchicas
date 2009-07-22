/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jchicas
 */
public class Lista <E> implements Intefaz <E> {



    	Nodo<E> head;

	public Lista()
	{
		head = null;
	}

	public boolean isEmpty()
	{
		return head == null;
	}

	public E peek()
	{
		if(head == null) return null;
		else return head.key;
	}

	public E pop()
	{
		if(isEmpty())
		{
			return null;
		}
		else
		{
			Nodo<E> nn = head;
			head = nn.next;
			return nn.key;
		}
	}

	public void push(E push)
	{
		head = new Nodo<E>(push, head);
	}
}



class Nodo<T>
{
	public T key;
	public Nodo<T> next;

	public Nodo(T key, Nodo<T> next)
	{
		this.key = key;
		this.next = next;
	}
}
