/*
 * Universidad del Valle de Guatemala
 * Autor: Julio R. Chicas Sett
 * Programa:  Intefaz.java
 * Descripcion: intefaz
 * Seccion:
 * Algoritmo y estructura de datos
 */

public interface Intefaz <E> {

    	public void push(E push);
	public E pop();
	public boolean isEmpty();
	public E peek();
        public String getVec(int i);
        public E sacar(int a);

}
