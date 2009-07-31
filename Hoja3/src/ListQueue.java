
public class ListQueue<E> extends AbstractQueue<E>
{
	CircularList<E> list;
	
	public ListQueue()
	{
		num = 0;
		list = new CircularList<E>();
	}
	
	public E removeLast()
	{
		E tp = list.removeFirst();
		
		if(tp == null) return null;
		else
		{
			num--;
			return tp;
		}
	}

	public E peek() 
	{
		return list.getHead();
	}

	public void addFirst(E q)
	{
		list.addLast(q);
		num++;
	}
	
	
}
