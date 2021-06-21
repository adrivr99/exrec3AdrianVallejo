package ej2;

import java.util.Arrays;
import java.util.Random;

public class Tablero {
    private final char[][] matriz = new char[8][8];

    public Tablero() {
    }

    public void crearTablero(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = 'X';
            }
        }
    }

    // Método para imprimir la matriz
    public void imprimir() {
        for (char[] chars : matriz) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.printf(" %c ", chars[i]);
            }
            System.out.println();
        }
    }

    // Método para llenar la matriz aleatoriamente con valores 0 un numero de veces aleatorio
    // En posiciones aleatorias
    public void llenarAleatoriamente(){
        Random rd = new Random();
        int numero = rd.nextInt(15)+10;
        for (int z = 0; z < numero; z++){
            matriz [rd.nextInt(8)][rd.nextInt(8)] = 'O';
        }
    }

    @Override
    public String toString() {
        return "Tablero{" +
                "matriz=" + Arrays.toString(matriz) +
                '}';
    }
}
