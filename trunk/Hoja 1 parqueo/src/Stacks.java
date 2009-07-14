
import java.util.ArrayList;

/*
 * Universidad del Valle de Guatemala
 * Algoritmo y Estructura de Datos
Autor> Julio Chicas
 * Carne> 07470
 */

public class Stacks {

    int sp;
   // String[] vec;



   ArrayList vec = new ArrayList();

    public Stacks() {

        sp = 0;
     

    }


// indica cuantos elementos posee el stacks
    public int pointer() {

        return sp;
    }


// saca el ultimo elemento de stack
    public String pop() {


        String temp = "";

        if (sp > 0) {
            temp = (String) vec.get(sp-1);
            vec.remove (sp-1);
            sp--;

        }

        return temp;
    }



    // visualiza el ultimo elemento del stack
    public String top() {


        String temp = "";

        if (sp > 0) {
            temp = (String)vec.get(sp-1);


        }

        return temp;

    }



    // metodo que saca los elementos del stack
    public void push(String s) {

        if (sp < 9) {
            sp++;
            vec.add(s)  ;
            
        }

    }


    // metodo que se encarga de devolver el elemnto deseado
    public String getVec (int i){

       return (String) vec.get(i) ;

    }
}