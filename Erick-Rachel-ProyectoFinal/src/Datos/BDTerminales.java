/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class BDTerminales {

    public int id_rutas = 1;

    public void insertarTerminal_en_archivo(String terminal) {
        leer_archivo_terminal();
        try {
            File archivo = new File("Terminales.txt");
            BufferedWriter archi = new BufferedWriter(new FileWriter(archivo, true));
            archi.write("ID terminal: " + id_rutas + "\r\n");
            id_rutas = id_rutas + 1;
            archi.write(terminal + "\r\n");
            archi.close();
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo" + e);
        }
    }

    public void leer_archivo_terminal() {
        try {
            int cont = 1;
            File archivo = new File("Terminales.txt");
            if (archivo.exists() == false) {
                archivo.createNewFile();
            } else {
                BufferedReader br = new BufferedReader(new FileReader(archivo));
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.contains("ID terminal:")) {
                        cont++;
                    }
                }
            }
            id_rutas = cont;
        } catch (Exception e) {
            System.out.println("Error al leer el archivo" + e);
        }
    }
     public void EliminarArchivo_terminal(){
        try {
            File archivo = new File("Terminales.txt");
            archivo.delete();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el archivo",
                    "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
}
   
}
