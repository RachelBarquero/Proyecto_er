/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.BDTerminales;

/**
 *
 * @author erick vinicio
 */
public class Terminales {

    BDTerminales bdv = new BDTerminales();

    public void insertarTerminal_en_archivo(String ruta) {
        bdv.insertarTerminal_en_archivo(ruta);
    }
}
