package Negocio;

import Datos.BDHistorial_Pasajeros;

public class Historial {

    BDHistorial_Pasajeros bdh = new BDHistorial_Pasajeros();

    public void insertar_historial_en_archivo(String ruta) {
        bdh.insertar_historial_en_archivo(ruta);
    }

}
