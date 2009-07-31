
/** Universidad del Valle de Guatemala
 *  Algoritmos y estructura de Datos
 *  Julio R. Chicas Sett
 *  Carne: 07470
 *
 *
 */

class ColaVaciaException extends Exception {

    public ColaVaciaException(){
        this ("Cola Vacia");
    }

    public ColaVaciaException(String message){
        super(message);
    }
}
