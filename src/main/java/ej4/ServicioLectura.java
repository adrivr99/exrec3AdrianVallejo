package ej4;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioLectura {
    //Método para leer el archivo CSV
    public static ArrayList<Autobus> CSVAutobus(String idFichero) {
        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        ArrayList<Autobus> listaAutobuses = new ArrayList<>();

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            datosFichero.nextLine();
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(",");
                Autobus autobus = new Autobus();
                autobus.setCodLinea(Integer.parseInt(tokens[0]));
                autobus.setNombreLinea(tokens[1]);
                autobus.setObservaciones(tokens[2]);
                autobus.setCabeceraIda(tokens[3]);
                autobus.setCabeceraVuelta(tokens[4]);
                autobus.setSentido(Integer.parseInt(tokens[5]));
                autobus.setOrden(Integer.parseInt(tokens[6]));
                autobus.setCodParada(Integer.parseInt(tokens[7]));
                autobus.setNombreParada(tokens[8]);
                autobus.setDireccion(tokens[9]);
                listaAutobuses.add(autobus);
            }
            return listaAutobuses;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // Método para generar un JSON de la lista de autobuses de linea elegida,
    // Se le pasa tambien un String que será el nombre del archivo
    public static void generarJSON(ArrayList<AutobusJSON> listaAutobusJSON, String nombreLinea) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);
        mapeador.writeValue(new File("./lineas/" + nombreLinea +".json"),
                listaAutobusJSON);
    }
}
