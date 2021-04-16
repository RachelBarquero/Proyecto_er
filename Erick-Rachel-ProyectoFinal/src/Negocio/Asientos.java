package Negocio;

import Presentacion.Principal;

public class Asientos {

    public void crear_asientos(String[][] asientos) {

        String negro = "\u001B[30m";
        String[] letras = {"A", "B", "C", "D", "E", "F"};
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        for (int y = 0; y < 15; y++) {
            for (int x = 0; x < 6; x++) {
                if (x == 1 || x == 4) {
                    asientos[y][x] = "X";
                } else {
                    asientos[y][x] = negro + numeros[y] + letras[x];
                }
            }
        }
    }

    public String asignar_asientos(int campos) {

        String c="";
        for (int x = 0; x < Principal.asientos.length; x++) {
            for (int y = 0; y < Principal.asientos[x].length; y++) {
                if (Principal.asientos[x][y].equals("X")) {

                } else {
                    while (campos != 0) {
                        c = c+"-"+Principal.asientos[x][y];
                        Principal.asientos[x][y] = "X";
                        campos--;
                        break;
                    }
                }
            }
        }
      
        return c;
    }

}
