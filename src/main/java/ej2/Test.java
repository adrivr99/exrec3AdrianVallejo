package ej2;


import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        //Creamos el tablero
        Tablero tablero = new Tablero();
        tablero.crearTablero();
        // Imprimimos el tablero
        tablero.imprimir();
        System.out.println("-----------------------------");
        // Introducimos el tablero con 0 un numero aleatorio de veces
        tablero.llenarAleatoriamente();
        tablero.imprimir();

        String result="";
        for (int i = 0; i < 8 ; i++){
            for (int j=0; j<= 8; j++)
            {
                result+= tablero.toString() + "\t";
            }
            JOptionPane.showInputDialog(null,result);
        }

    }
}
