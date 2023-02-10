package com.mycompany.lab4p1_salvadormacias;

import java.util.Scanner;

public class LAB4P1_salvadormacias {

    public static Scanner lea = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salida = true;
        do {
            System.out.println("Bienvenido al menu!");
            System.out.println("Estas son las opciones disponibles: ");
            System.out.println("1.Substitute\n2.Palindroma\n3.Contenida o no\n4.Salir");
            System.out.println("Ingrese opcion : ");
            int opc = lea.nextInt();
            switch (opc) {
                case 1: {
                    System.out.println("Ingrese una cadena (con el simbolo %d ): ");
                    lea.nextLine();
                    String cadena1 = lea.nextLine();
                    System.out.println("Ingrese cadena que hara la substitucion:  ");
                    lea.nextLine();
                    String cadena2 = lea.nextLine();
                    String resultante = "";
                    cadena1.replaceAll("%d", cadena2);
                    resultante += cadena1 ;
                    System.out.println("Resultado: " + resultante);

                }//fin case 1
                break;

                case 2: {
                    System.out.println("Ingrese una palabra: ");
                    lea.nextLine();
                    String palabra = lea.nextLine();
                    String invertida = "";
                    for (int i = palabra.length() - 1; i >= 0; i--) {
                        invertida = invertida + palabra.charAt(i);
                    }
                    if (palabra.equals(invertida)) {
                        System.out.println("La palabra es palindroma ");
                    } else {
                        System.out.println("La palabra no es palindroma");

                    }

                }//fin case 2
                break;

                case 3: {
                    System.out.println("Ingrese una cadena(larga): ");
                    lea.nextLine();
                    String larga = lea.nextLine();
                    System.out.println("Ingrese una cadena(corta): ");
                    lea.nextLine();
                    String corta = lea.nextLine();
                    int contiene;
                    if (larga.length() > corta.length()) {
                        contiene = larga.indexOf(corta);
                        if (contiene != -1) {
                            System.out.println("La cadena corta esta contenida en la cadena larga");
                        } else {
                            System.out.println("La cadena corta no  esta contenida en la cadena larga ");

                        }
                    } else {
                        System.out.println("La segunda cadena tiene que ser menor a la primera cadena");

                    }
                }//fin case 3
                break;
                
                case 4: {
                    salida = false;
                    System.out.println("Se abandonara el programa");

                }//fin case 4
                break;

                default:
                    System.out.println("Opcion ingresada no es valida");
                    System.out.println("--------------------------------------------------------------------------------");

            }//fin switch

        } while (salida != false);//fin while

    }
}
