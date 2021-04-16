
package Negocio;

import Datos.BDUnidades;

public class Unidades {
    
    BDUnidades bdv = new BDUnidades();
    
     public void insertarUnidad_en_archivo(String ruta) {
        bdv.insertarUnidad_en_archivo(ruta);
    
     }
     
      public static String generarPlaca (){
       String Placa = "";
        int a;  
        String CaracteresNoDeseados = "AEIOU";
        
        for (int i = 0; i < 6; i++){
            if (i < 3){ 
                do {
                a = (int) (Math.random() * 26 + 65);
            }while (a == 65 || a == 69 || a == 73 || a == 79 || a == 85);
            
            char letra = (char) a;
           
                Placa = Placa + "" + letra;
  
            } else {       
                if (i == 3) {
                Placa = Placa + "-";
                }
                Placa = Placa + "" +(int)(Math.random()*3);
            }
        
       }
        return Placa;
      }

}
