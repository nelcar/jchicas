
import java.util.Scanner;

/*
 * Universidad del Valle de Guatemala
 * Autor: Julio R. Chicas Sett
 * Programa:  NewMain.java
 * Descripcion: Clase q contra todo las implementacion llamada MAIN
 * Seccion:
 * Algoritmo y estructura de datos
 */

public class NewMain {

  
    public static void main(String[] args) {

/**
 * Se declaran las variables de la clase
 */
        String op = "0";
        int op2 = 0;
        String placa = "";
        
        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("Que estructura desea utilizar:  ");
            System.out.println("Precione 1, para ARRAYSTACKS:   ");
            System.out.println("Presione 2, para LISTAS:  ");
            op = scan.next();

            if (op.charAt(0) == '1') {
                ArrayStacks coso1 = new ArrayStacks();


                do {
                System.out.println("  \n        ......:::::: Uvg::::::......          ");
                System.out.println("\nIngrese ¨ a ¨ si desea meter un  carro al parqueo: ");
                System.out.println("\nIngrese ¨ b ¨ si desea sacar un carro del parqueo: ");
                System.out.println("\nIngrese ¨ c ¨ si desea ver el carro del parqueo: ");
                System.out.println("\nIngrese ¨ d ¨ si desea ver el carro del parqueo: ");
                op = scan.next();


                switch (op.charAt(0)) {

                    case 'a': {

                        System.out.println("Cual es la placa de su carro: ");
                        placa = scan.next();
                        coso1.push(placa);

                    }
                    break;


                    case 'b': {
                        System.out.println("Para buscar en la posicion debe de ingresar el rango de 0 a 9");
                        System.out.println("\nEn que posicion desea sacar el Carro: ");
                        int posicion;
                        posicion = scan.nextInt();
                        coso1.sacar(posicion);


                    }
                    break;


                    case 'c': {

                        System.out.println("Que posicion desea ver el carro: ");

                        int posicion;
                        posicion = scan.nextInt();
                        System.out.println((String) coso1.getVec(posicion));

                    }
                    break;

                    case 'd': {


                        System.out.println("\n ....::: Reinicializacion del menu:::....  ");
                        op="d";
                    }break;


                }
                }
                while (op != "d");
            }


            if (op.charAt(0) == '2') {
                Lista coso2 = new Lista();
            

            do {


                System.out.println("  \n        ......:::::: Uvg::::::......          ");
                System.out.println("\nIngrese ¨ a ¨ si desea meter un  carro al parqueo: ");
                System.out.println("\nIngrese ¨ b ¨ si desea sacar un carro del parqueo: ");
                System.out.println("\nIngrese ¨ c ¨ si desea ver el carro del parqueo: ");
                System.out.println("\nIngrese ¨ d ¨ si desea ver el carro del parqueo: ");
                op = scan.next();

                switch (op.charAt(0)) {

                    case 'a': {

                        System.out.println("Cual es la placa de su carro: ");
                        placa = scan.next();
                        coso2.push(placa);

                    }
                    break;


                    case 'b': {

                        System.out.println("En que posicion desea sacar el Carro: ");
                        int posicion;
                        posicion = scan.nextInt();
                        coso2.sacar(posicion);

                    }
                    break;


                    case 'c': {

                        System.out.println("Que posicion desea ver el carro: ");

                        int posicion;
                        posicion = scan.nextInt();
                        System.out.println((String) coso2.getVec(posicion));

                    }
                    break;
                    case 'd': {


                        System.out.println("\n ....::: Reinicializacion del menu:::.... ");
                        op="d";
                    }break;


                }}
                while (op != "d");
            


            }} while (op != "3");







        }

}
