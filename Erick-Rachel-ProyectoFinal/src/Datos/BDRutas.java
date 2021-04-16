package Datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class BDRutas {
    
    public int id_rutas=1;
    
    public void insertarRuta_en_archivo(String ruta) {
        leer_archivo_ruta();
        try {
            File archivo = new File("Rutas.txt");
            BufferedWriter archi = new BufferedWriter(new FileWriter(archivo, true));
            archi.write("ID Ruta: " + id_rutas + "\r\n");
            id_rutas = id_rutas + 1;
            archi.write(ruta + "\r\n");
            archi.close();
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo" + e);
        }
    }
    
    public void leer_archivo_ruta(){
         try {
            int cont = 1;
            File archivo = new File("Rutas.txt");
            if(archivo.exists()==false){
                archivo.createNewFile();
            }
            else{
                BufferedReader br = new BufferedReader(new FileReader(archivo));
                String line;
                while ((line = br.readLine()) != null) {
                    if(line.contains("ID Ruta:")){
                        cont++;
                    }
                }
            }
            id_rutas = cont;
              } catch (Exception e) {
            System.out.println("Error al leer el archivo" + e);
        }
    }
     public void EliminarArchivo_ruta(){
        try {
            File archivo = new File("Rutas.txt");
            archivo.delete();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el archivo",
                    "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
}

}
