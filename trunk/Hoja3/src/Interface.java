
/** Universidad del Valle de Guatemala
 *  Algoritmos y estructura de Datos
 *  Julio R. Chicas Sett
 *  Carne: 07470
 *
 */
public interface Interface<E> {

   public void addFirst(E value) throws ColaLLenaException;
   public E removeLast() throws ColaVaciaException;
   public E peek () throws ColaVaciaException;


}
