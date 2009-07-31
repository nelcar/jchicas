
public class ListasCirculares<E>
{
	private Node<E> head;
	private Node<E> tail;
	
	public ListasCirculares()
	{
		head = tail = null;
	}
	
	public void addFirst(E o)
	{
		if(head == null)
		{
			tail = head = new Node<E>(o, head);
		}
		else
		{
			head = new Node<E>(o, head);
			tail.next = head;
		}
	}
	
	public void addLast(E o)
	{
		if(head == null)
		{
			addFirst(o);
		}
		else
		{
			tail.next = new Node<E>(o, head);
			tail = tail.next;
		}
	}
	
	public E removeFirst()
	{
		if(head == null)
		{
			return null;
		}
		if(head == tail)
		{
			E tp = head.key;
			head = tail = null;
			return tp;
		}
		else
		{
			E tp = head.key;
			head = head.next;
			tail.next = head;
			return tp;
		}
	}
	
	public E getHead()
	{
		if(head == null) return null;
		else return head.key;
	}
}
class Node<E>
{
	public E key;
	public Node<E> next;
	
	public Node(E key, Node<E> next)
	{
		this.key = key;
		this.next = next;
	}
	
	public Node()
	{
		this(null, null);
	}
}
