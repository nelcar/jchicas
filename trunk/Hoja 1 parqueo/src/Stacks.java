
import java.util.ArrayList;

/*
 * Universidad del Valle de Guatemala
 * Autor: Julio R. Chicas Sett
 * Programa:  Stacks.java
 * Descripcion: Clase que contiene metodos para el control de stacks
 * Seccion:
 * Algoritmo y estructura de datos
 */


public class Stacks {

    int sp;
   ArrayList vec = new ArrayList();

    public Stacks() {

        sp = 0;
    
    }

    /**
     * Indica cuantos elementos possee el stacks
     * @return la variable sp
     */
    public int pointer() {

        return sp;
    }

    /**
     * Metodo que saca el ultimo elemento del Stacks
     * @return temp
     */
 
    public String pop() {


        String temp = "";

        if (sp > 0) {
            temp = (String) vec.get(sp-1);
            vec.remove (sp-1);
            sp--;

        }

        return temp;
    }



    /**
     *  Metodo que visualiza el ultimo elemento del stacks
     * @return temp
     */
   
    public String top() {


        String temp = "";

        if (sp > 0) {
            temp = (String)vec.get(sp-1);


        }

        return temp;

    }



    /**
     * Metodo que saca los elementos del Stacks
     * @param s
     */
   
    public void push(String s) {

        if (sp < 9) {
            sp++;
            vec.add(s)  ;
            
        }

    }


    /**
     * Metodo que se encarga de devolver el elemento deseado
     * @param i
     * @return vec
     */
    
    public String getVec (int i){

       return (String) vec.get(i) ;

    }
}