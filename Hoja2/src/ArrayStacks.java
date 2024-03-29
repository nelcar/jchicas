

/**
 *
 * Se importan paquetes
 */



import java.util.ArrayList;

/*
 * Universidad del Valle de Guatemala
 * Autor: Julio R. Chicas Sett
 * Programa:  ArrayStacks.java
 * Descripcion: Clase que contiene metodos para el control de stacks
 * Seccion:
 * Algoritmo y estructura de datos
 */
public class ArrayStacks<E> implements Intefaz<E> {

    int sp;
    
    ArrayList<E> vec = new ArrayList();

    public ArrayStacks() {

        sp = 0;
    }

    /**
     * Metodo que mete los elementos del stacks
     * @param s
     */
    public void push(E push) {

        if (sp < 9) {
            sp++;
            vec.add(push);
        }
    }

    /**
     * Metodo que saca el ultimo elemento del Stacks
     * @return temp
     */
    public E pop() {
        
        E temp = null;


        if (sp > 0) {
            temp =  vec.get(sp - 1);
            vec.remove(sp - 1);
            sp--;

        }

        return  temp;
    }

    /**
     * peek = top
     *  Metodo que visualiza el ultimo elemento del stacks
     * @return temp
     */
    public E peek() {

        String temp = "";

        return (vec.get(sp -1));
    }

    /**
     * Indica cuantos elementos possee el stacks
     * @return la variable sp
     */
    public boolean isEmpty() {

        return (vec.isEmpty());
    }


    public String getVec (int i){

       return (String) vec.get(i) ;

    }

     public E sacar(int a) {
        try{
        E temp = null;


        if (sp > 0) {
            temp =  vec.get(a);
            vec.remove(a);
            for (int i=a; i<vec.size()-1; i++){

                vec.set(i,vec.get(i+1) );
            }
            sp--;

        }

        return  temp;
        }catch (Exception e){
        System.out.println("Error, el numero ingresado no dispone ningun valor ");
        return null;
        }
    }

}


