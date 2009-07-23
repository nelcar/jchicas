/**
 * Se importan paquetes necesarios para esta clase
 */


import java.util.Scanner;


/*
 * Universidad del Valle de Guatemala
 * Autor: Julio r. Chias sett
 * Programa:  Main.java
 * Descripcion: Clase que posee los menus del programa
 * Seccion:
 * Algoritmo y estructura de datos
 */


public class Main {

    public static void main(String[] args) {

        /**
         * Se declaran las variables de la clase
         */



        String op;
        String placa = "";
        int num=0;
        int n;
        int op1;
        int op2;


        Scanner scan = new Scanner(System.in);
        System.out.println(" \nCuantos espacios desea:  ");
        n = scan.nextInt();

        Stacks [] miStack = new Stacks [n];

        /**
         * Ciclo que recorre todos los stacks para instanciarlos
         */
        

        for (int i=0; i<n; i++){

             miStack [i] = new Stacks ();
        }


        Stacks miStack2 = new Stacks();

        /**
         * Ciclo para mostrar el menu repetitivo
         */
       
      do{
       

        System.out.println("  \n        ......:::::: Uvg::::::......          ");
        System.out.println("\nIngrese ¨ a ¨ si desea meter un  carro al parqueo: ");
        System.out.println("\nIngrese ¨ d ¨ si desea sacar un carro del parqueo: ");
        op = scan.next();

        /**
         * Switch que controla el menu de las teclas (a) y (b)
         */

     
        switch(op.charAt(0)){

            case  'a':
            {
                op1 =0;
                do{
                    op1++;

                }  // revisa stack por stack, asta que encuentre 1 a
                 while(op1 < n && miStack[op1].pointer()==10);
                
                if (op1 <= n){

                        System.out.println("Debe colocar su carro en el espacio:  " + op1);
                        op1--;
                        System.out.println("Cual es la placa de su carro: ");
                        placa = scan.next ();
                        miStack [op1].push(placa);

                }else        System.out.println("Parqueo lleno");


            }
            break;


               case  'd':
               {

                 System.out.println("\nEn que espacio desea buscar su carro:  ");
                 op1 = scan. nextInt();
                 op1--;
                 
                 System.out.println("\nIngrese la placa de su vehiculo:  ");
                 placa =scan.next ();



                  System.out.println("\nCual es el numero de parqueo: ");

                  boolean band=false;

                  try{
                  num =scan.nextInt ();
                  
                  }catch(Exception e){
                      band=true;

                    System.out.println("Error exepcion manejada debe de ingresar un numero");
                  }


              
                  if(band==false && placa.equals(miStack[op1].getVec (num))){

                      int temp =miStack[op1].pointer();

                      for(int i=num; i<miStack[op1].pointer(); i++){

                          System.out.println("Para mover el carro, se sacaron los carro con placas: " + miStack[op1].top());
                          miStack2.push(miStack[op1].pop());

                      }

                      String t = miStack[op1].pop();

                       for (int i=num; i<temp-1; i++){

                          miStack [op1].push(miStack2.pop());

                      }


                  }else  if(band==false){ System.out.println("La placa no corresponde a las de su vehiculo se le cobrar una penalizacion por la movilizacion de los vehiculos ");}
               }
                    break ;



        }

        /**
         * Ciclo para desplegar el estado del estacionamiento
         */
        
         for(int i=0; i<n; i++){
          for(int j=0; j<miStack[i].pointer(); j++){ System.out.print( miStack[i].getVec(j)+ "  ");}
          for(int j=miStack[i].pointer(); j<10; j++ ){ System.out.print("vacio ");}

          System.out.println();
        }

        System.out.print("\nIngrese 1 para continuar y 2 para cerrar: ");
        scan = new Scanner(System.in);
        op2 = scan.nextInt();
      }while(op2 == 1 );
}

}




