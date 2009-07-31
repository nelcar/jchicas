import java.util.ArrayList;

public class Bank {

	public static void main(String[] args) 
	{	
		int time = 0;
        ArrayList<Client> sortedClients = new ArrayList<Client>();
        
        //Generates the 50 clients for the bank simulation
        for (int i = 0 ; i<50 ; i++)
        {
            Client newClient = new Client((int) Math.round(Math.random()*480),(int) Math.round(Math.random()*30));
            sortedClients.add(newClient);
        }
        
        Client[] SortedClientsArray = new Client[sortedClients.size()];
        sortedClients.toArray(SortedClientsArray);
        
        //Sorts the clients
        for (int each = 0; each < SortedClientsArray.length ; each++ )
        {
        	for (int other = each+1; other < SortedClientsArray.length ; other++){
                                Client anotherPerson = SortedClientsArray[other];
                                if (SortedClientsArray[each].compareTo(anotherPerson) < 0) { //then, switch
                                        Client currentPerson = SortedClientsArray[each];
                                        SortedClientsArray[each] = SortedClientsArray[other];
                                        SortedClientsArray[other] = currentPerson;
                                }
                        }
                }
        
        
        ListQueue<Client> list = new ListQueue<Client>();
        
        for(int i = 0; i < 50; i++)
        {
        	System.out.println(SortedClientsArray[i].t1 + ", " + SortedClientsArray[i].t2);
        	list.addFirst(SortedClientsArray[i]);
        }
        
        while(time < 480)
        {
        	if(list.peek().t1 == time)
        	{
        		list.removeLast();
        		System.out.println("Entra cliente al banco: " + time);
        	}
        	else
        	{
        		System.out.println(time);
        	}
        	time++;
        }




        
        
        
	}
}

class Client implements Comparable<Client>
{
    
    int t1;
    int t2;
    
    public Client(int t1, int t2)
    {
        this.t1 = t1;
        this.t2 = t2;
    }

    public int compareTo(Client o) 
    {
                if (o.t1 < this.t1) return -1;
                else if (o.t1 > this.t1) return 1;
                else return 0;
	}
}