package Datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BDHistorial_Pasajeros {

    public int id_historial = 1;

    public void insertar_historial_en_archivo(String ruta) {
        leer_archivo_historial();
        try {
            File archivo = new File("Historial Pasajeros.txt");
            BufferedWriter archi = new BufferedWriter(new FileWriter(archivo, true));
            archi.write("ID Historial: " + id_historial + "\r\n");
            id_historial = id_historial + 1;
            archi.write(ruta + "\r\n");
            archi.close();
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo" + e);
        }
    }

    public void leer_archivo_historial() {
        try {
            int cont = 1;
            File archivo = new File("Historial Pasajeros.txt");
            if (archivo.exists() == false) {
                archivo.createNewFile();
            } else {
                BufferedReader br = new BufferedReader(new FileReader(archivo));
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.contains("ID Historial:")) {
                        cont++;
                    }
                }
            }
            id_historial = cont;
        } catch (Exception e) {
            System.out.println("Error al leer el archivo" + e);
        }
    }
}
