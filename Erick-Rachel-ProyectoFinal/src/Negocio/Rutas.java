
package Negocio;
import Datos.BDRutas;


public class Rutas {
    
    BDRutas bdv= new BDRutas();
    
    public void insertarRuta_en_archivo(String ruta){
        bdv.insertarRuta_en_archivo(ruta);
    }

}
