
/** Universidad del Valle de Guatemala
 *  Algoritmos y estructura de Datos
 *  Julio R. Chicas Sett
 *  Carne: 07470
 *
 *
 */

class ColaLLenaException extends Exception {

    public ColaLLenaException(){
        this ("Cola LLena");
    }

    public ColaLLenaException(String message){
        super(message);
    }

}
