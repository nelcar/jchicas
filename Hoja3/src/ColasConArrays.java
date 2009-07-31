

/** Universidad del Valle de Guatemala
 *  Algoritmos y estructura de Datos
 *  Julio R. Chicas Sett
 *  Carne: 07470
 *  
 *
 */
public class ColasConArrays<E> extends AbstractQueue{



     E[] cola = (E[]) new Object[10];
     int elementos;

    public ColasConArrays(){
        for(int i=0; i<10; i++ ){
            cola[i]=null;
        }

        elementos = 0;
    }



    public void addFirst(Object value) throws ColaLLenaException{
        if(elementos==10){
            throw new ColaLLenaException("No se pueden agregar mas elementos a la cola");
        }

        cola[elementos] = (E) value;
        elementos++;
    }

    public Object removeLast() throws ColaVaciaException{

        if(cola[0] == null){
            throw new ColaVaciaException();
        }

        Object ReturnValue = cola[0];

        for(int i = 0; i<9 ; i++){
            cola[i] = cola[i+1];

        }
        elementos--;
        return ReturnValue;
    }

    public Object peek() throws ColaVaciaException {

        if(cola[0] == null){
            throw new ColaVaciaException();
        }
        
       return cola[0];

    }


    
}
