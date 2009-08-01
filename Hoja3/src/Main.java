import java.util.ArrayList;
/**
 * Universidad del Valle de Guatemala
 * Algoritmos y estructura de Datos
 * Julio Chicas
 * Carne 07470
 *
 */

public class Main {

	 public static void main(String[] args) {
            

        int time = 0;
        int count = 1;

        ArrayList<Client> corto1 = new ArrayList<Client>();

      /**
       * Se condicion que genera a los 50 personas
       */
        for (int i = 0; i < 50; i++) {
            Client newClient = new Client((int) Math.round(Math.random() * 480), (int) Math.round(Math.random() * 30));
           corto1.add(newClient);
        }

        Client[] corto2 = new Client[corto1.size()];
        corto1.toArray(corto2);

        for (int each = 0; each < corto2.length; each++) {
            for (int other = each + 1; other < corto2.length; other++) {
                Client anotherPerson = corto2[other];
                if (corto2[each].compareTo(anotherPerson) < 0) { //then, switch
                    Client currentPerson = corto2[each];
                    corto2[each] = corto2[other];
                    corto2[other] = currentPerson;
                }
            }
        }

       
        ColaLista<Client> list = new ColaLista<Client>();

        for (int i = 0; i < 50; i++) {
            
            list.addFirst(corto2[i]);
        }


        /**
         * Se crean las colas
         */

        ColaLista<Client> cola1 = new ColaLista<Client>();
        ColaLista<Client> cola2 = new ColaLista<Client>();
        ColaLista<Client> cola3 = new ColaLista<Client>();
        ColaLista<Client> cola4 = new ColaLista<Client>();

        
        while (time < 480) {
            try {
                if (list.peek().t1 == time) {
                    switch (count) {
                        case 1: {
                            cola1.addFirst(list.removeLast());
                            System.out.println("Ingreso, cola 1");
                        }
                        case 2: {
                            cola2.addFirst(list.removeLast());
                            System.out.println("Ingreso, cola 2");
                        }
                        case 3: {
                            cola3.addFirst(list.removeLast());
                            System.out.println("Ingreso, cola 3");
                        }
                        case 4: {
                            cola4.addFirst(list.removeLast());
                            System.out.println("Ingreso, cola 4");
                        }
                    }
                    if (count == 4) {
                        count = 1;
                    } else {
                        count++;
                    }

                }
            } catch (Exception e) {
            }

            try {
                if ((time - cola1.peek().t1) == cola1.peek().t2) {
                    cola1.removeLast();
                    System.out.println("Se retiro un cliente de la cola 1");
                }
                if ((time - cola2.peek().t1) == cola2.peek().t2) {
                    cola2.removeLast();
                    System.out.println("Se retiro un cliente de la cola 2");
                }
                if ((time - cola3.peek().t1) == cola3.peek().t2) {
                    cola3.removeLast();
                    System.out.println("Se retiro un cliente de la cola 3");
                }
                if ((time - cola4.peek().t1) == cola4.peek().t2) {
                    cola4.removeLast();
                    System.out.println("Se retiro un cliente de la cola 4");
                }

            } catch (Exception E) {
            }




            time++;
        }

        int suma=0;

        for(int k=0 ; k<50 ; k++){
            suma += corto2[k].t2;
        }

        int promedio =  suma/50;
        System.out.println("\nEl tiempo total: " + suma);
        System.out.println("\nEl tiempo promedio es: " + promedio);

    }
}
/**
 *  Clase cliente que se implementa de comparable
 * 
 * @author jchicas
 */

class Client implements Comparable<Client> {

    int t1;
    int t2;

    public Client(int t1, int t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public int compareTo(Client o) {
        if (o.t1 < this.t1) {
            return -1;
        } else if (o.t1 > this.t1) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "(" + t1 + ", " + t2 + ")";
    }
}
