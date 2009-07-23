/*
 * Universidad del Valle de Guatemala
 * Autor: Julio R. Chicas Sett
 * Programa:  Lista.java
 * Descripcion: Clase de listas
 * Seccion:
 * Algoritmo y estructura de datos
 */

public class Lista<E> implements Intefaz<E> {

    
    Nodo<E> head;

    public Lista() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public E peek() {
        Nodo<E> nn = head;
        while (nn.next != null) {
            nn = nn.next;
        }
        return nn.key;
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        } else {
            Nodo<E> nn = head;
            while (nn.next.next != null) {
                nn = nn.next;
            }
            E coso = nn.next.key;
            nn.next = null;
            return coso;

        }
    }

    public void push(E push) {

        Nodo<E> nn = head;
        if (nn == null) {
            head = new Nodo<E>(push, null);
        } else {
            while (nn.next != null) {
                nn = nn.next;
            }
            nn.next = new Nodo<E>(push, null);
        }
    }

    public String getVec(int i) {

        int a = 0;
        Nodo<E> nn = head;
        while (a < i) {
            nn = nn.next;
            a++;
        }
        return (String) nn.key;
    }

    public E sacar(int a) {
        try {
            E temp = null;

            int posicion = 0;
            Nodo<E> nn = head;
            if (a == 0) {
                head = head.next;
            } else {
                while (posicion < a - 1) {
                    posicion++;
                    nn = nn.next;

                }
                temp = nn.next.key;
                nn.next = nn.next.next;


            }
            return temp;
        } catch (Exception e) {
            System.out.println("Error...  ");
            return null;
        }
    }
}

class Nodo<T> {

    public T key;
    public Nodo<T> next;

    public Nodo(T key, Nodo<T> next) {
        this.key = key;
        this.next = next;
    }
}
