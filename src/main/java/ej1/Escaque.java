package ej1;

import java.util.Arrays;

public class Escaque {
    private final char[][] matriz = new char[8][8];

    public Escaque() {
    }

    // Método para crear el tablero
    // Se suman las posiciones i y j y si el resto de dividirlos entre dos es igual a 0 colocamos casilla B
    // si en el caso de que sea diferente de cero se coloca casilla N
    public void crearTablero(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if ((i + j) % 2 == 0){
                    matriz [i][j] = 'B';
                } else if ((i + j) % 2 != 0){
                    matriz [i][j] = 'N';
                }
            }
        }
    }

    public char[][] getMatriz() {
        return matriz;
    }

    //Método para imprimir por pantalla la matriz
    public void imprimir() {
        for (char[] chars : matriz) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.printf(" %c ", chars[i]);
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Escaque{" +
                "matriz=" + Arrays.toString(matriz) +
                '}';
    }
}
