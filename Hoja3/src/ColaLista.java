
public class ColaLista<E> extends ColaAbstracta<E>
{
	ListasCirculares<E> list;
	
	public ColaLista()
	{
		num = 0;
		list = new ListasCirculares<E>();
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
