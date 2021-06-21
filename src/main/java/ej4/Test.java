package ej4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static ej4.ServicioLectura.generarJSON;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        // Generamos una lista de autobuses a partir de la lecturar del csv
        ArrayList<Autobus> listaAutobus= ServicioLectura.CSVAutobus("lineasyparadas.csv");


        boolean codExist = false;
        System.out.println("Introduce un codigo de linea: ");
        int codLinea = teclado.nextInt();
        do{
            ArrayList<AutobusJSON> listaAutobusJSON = new ArrayList<>();
            String nombreLinea = null;
            for (Autobus autobus: listaAutobus){
                if (autobus.getCodLinea() == codLinea){
                    AutobusJSON autobusJSON = new AutobusJSON();
                    autobusJSON.setCodigoParadaJSON(autobus.getCodParada());
                    autobusJSON.setNombreParadaJSON(autobus.getNombreParada());
                    autobusJSON.setDireccionJSON(autobus.getDireccion());
                    listaAutobusJSON.add(autobusJSON);
                    nombreLinea = autobus.getNombreLinea();
                    codExist = true;
                }
            }
            generarJSON(listaAutobusJSON, nombreLinea);
        }while(!codExist);
    }
}
