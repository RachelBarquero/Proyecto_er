package Negocio;

import java.util.ArrayList;
import Presentacion.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.Objects;

public class Listas {

    public ArrayList<String> ruta_s = new ArrayList();

    public void llenarLista_Lugares(ArrayList<String> lugares) {
        //Lista de lugares
        lugares.add("1" + "|" + "San Jose");
        lugares.add("2" + "|" + "Alajuela");
        lugares.add("3" + "|" + "San Carlos");
        lugares.add("4" + "|" + "Puntarenas");
        lugares.add("5" + "|" + "Limon");
        lugares.add("6" + "|" + "Heredia");
        lugares.add("7" + "|" + "Cartago");
    }
    
    public void llenarLista_numeroTerminal(ArrayList<String> NumTerminal){
        NumTerminal.add("Terminal 1");
        NumTerminal.add("Terminal 2");
    }

    //Metodo de llenado de lista de usuarios
    public void llenar_lista_usuarios(ArrayList<String> usuarios) {
        //Lista de usuarios
        usuarios.add("1-1111-1111" + "|" + "Jose Pablo" + "|" + "20/04/1978" + "|" + "40" + "|" + "josepablo20@gmail.com" + "Masculino" + "|" + "|" + "admin123" + "|" + "Administrador");
    }

    public void llenarLista_rutas(String rutas) {
        Principal.rutas.add(rutas);
    }
    
    public void llenarLista_terminales(String ter) {
        Principal.terminales.add(ter);
    }

    public void llenarLista_unidades(String ter) {
        Principal.unidades.add(ter);
    }
    //Metodo de validación
    public int validar_acceso(String u, String c) {

        ArrayList<String> usu = Principal.usuarios;
        int e = 0;
        String a = "Administrador";
        String p = "Pasajero";
        String[] separar = new String[20];
        ArrayList<String> us = new ArrayList();
        ArrayList<String> con = new ArrayList();
        ArrayList<String> tip = new ArrayList();
        int pos1 = 0;
        for (int i = 0; i < usu.size(); i++) {
            separar = usu.get(i).split("\\|");
            us.add(separar[0]);
            con.add(separar[6]);
            tip.add(separar[7]);

        }
        if (us.contains(u) && con.contains(c)) {
            pos1 = us.indexOf(u);
            if (us.get(pos1).equals(u) && con.get(pos1).equals(c) && tip.get(pos1).equals(a)) {
                e = 1;
            } else if (us.get(pos1).equals(u) && con.get(pos1).equals(c) && tip.get(pos1).equals(p)) {
                e = 2;
            } else {
                e = 0;
            }
        } else {
            e = 3;
        }
        return e;
    }

    //Metodo para añadir nuevos usuarios
    public String registro_nuevo(String d) {

        ArrayList<String> usu = Principal.usuarios;
        String v = "";
        if (usu.contains(d)) {
            v = "c";
        } else {
            usu.add(d);
        }

        return v;

    }

    //Metodo para leer el contenido de las listas
    public ArrayList<String> leerLista_lugares() {

        ArrayList<String> lugar = Principal.lugares;
        String[] separar = new String[2];
        ArrayList<String> a = new ArrayList();
        for (int i = 0; i < lugar.size(); i++) {
            separar = lugar.get(i).split("\\|");
            a.add(separar[1]);
        }
        return a;
    }
    

    //Metodo para leer el contenido de las listas
    public ArrayList<String> leerLista_terminales() {

        ArrayList<String> terminal = Principal.terminales;
        String[] separar = new String[2];
        ArrayList<String> a = new ArrayList();
        for (int i = 0; i < terminal.size(); i++) {
            separar = terminal.get(i).split("\\|");
            a.add(separar[1]);
        }
        return a;
    }
    
    public ArrayList<String> leerLista_numterminales() {

        ArrayList<String> terminal = Principal.numterminales;
        ArrayList<String> a = new ArrayList();
        for (int i = 0; i < terminal.size(); i++) {
            a.add(terminal.get(i));
        }
        return a;
    }

    //Metodo para la asignacion del ID de lugares
    public String asignacion_ID(String a) {

        ArrayList<String> terminales = Principal.lugares;
        String[] separar = new String[3];
        String id = "";
        for (int i = 0; i < terminales.size(); i++) {
            separar = terminales.get(i).split("\\|");
            if (separar[1].equals(a)) {
                id = separar[0];

            }
        }
        return id;
    }
    
    public String asignacionUnidad(String ida) {

        ArrayList<String> buses = Principal.unidades;
        String[] separar = new String[4];
        ArrayList<String> idunidades = new ArrayList();
        ArrayList<String> idlugares = new ArrayList();
        ArrayList<String> asientos = new ArrayList();
        ArrayList<String> estado = new ArrayList();
        String idav = "";
        for (int i = 0; i < buses.size(); i++) {
            separar = buses.get(i).split("\\|");
            idunidades.add(separar[0]);
            idlugares.add(separar[1]);
            asientos.add(separar[2]);
            estado.add(separar[3]);
        }
        if (idlugares.contains(ida)) {
            int campo2 = idlugares.indexOf(ida);
            if (estado.get(campo2).equals("Disponible")) {
                idav = idunidades.get(campo2);

                buses.remove(campo2);
                String bus_ocupado = idunidades.get(campo2) + "|" + idlugares.get(campo2) + "|" + asientos.get(campo2) + "|" + "En Servicio";
                buses.add(campo2, bus_ocupado);

            } else if (estado.get(campo2 + 1).equals("Disponible")) {
                idav = idunidades.get(campo2 + 1);

                buses.remove(campo2 + 1);
                String bus_ocupado = idunidades.get(campo2 + 1) + "|" + idlugares.get(campo2 + 1) + "|" + asientos.get(campo2 + 1) + "|" + "En Servicio";
                buses.add(campo2 + 1, bus_ocupado);

            } else if (estado.get(campo2).equals("En Servicio") && estado.get(campo2 + 1).equals("En Servicio")) {
                idav = "n";
            }
        } else {
        }
        return idav;

    }
    
    public String buscarLugar(String id) {
        ArrayList<String> lugar = Principal.lugares;
        String[] separar = new String[2];
        String n = "";
        for (int i = 0; i < lugar.size(); i++) {
            separar = lugar.get(i).split("\\|");
            if (separar[0].equals(id)) {
                n = separar[1];

            }
        }
        return n;
    }
    
     public String duracion_total(String d1, String d2) {

        String[] separar = d1.split(" ");
        String[] separar2 = d2.split(" ");
        int di1 = Integer.parseInt(separar[0]);
        int h1 = Integer.parseInt(separar[2]);
        int m1 = Integer.parseInt(separar[5]);
        int di2 = Integer.parseInt(separar2[0]);
        int h2 = Integer.parseInt(separar2[2]);
        int m2 = Integer.parseInt(separar2[5]);

        int dias = di1 + di2;
        int horas = h1 + h2;
        int minutos = m1 + m2;

        String dt = String.valueOf(dias) + " dias " + String.valueOf(horas) + " horas y "
                + String.valueOf(minutos) + " minutos";

        return dt;
    }

      public ArrayList<String> buscarRutas(String as, String al, String fs) {

        ArrayList<String> v_d = new ArrayList();

        for (String ruta : Principal.rutas) {
            String[] separar = ruta.split("\\|");
            if (separar[2].compareTo(fs) == 0 && separar[4].compareTo(as) == 0) {
                if (separar[7].compareTo(al) == 0) {
                    String na = buscarLugar(separar[0]);
                    String ruta_disponible = na + "|" + separar[4] + "|" + "Directo" + "|" + separar[7] + "|" + separar[3] + "|"
                            + separar[6] + "|" + separar[8] + "|" + separar[1];
                    v_d.add(ruta_disponible);
                } else {
                    for (String ruta2 : Principal.rutas) {
                        String[] separar2 = ruta2.split("\\|");
                        int costo1 = Integer.parseInt(separar[1]);
                        int costo2 = Integer.parseInt(separar2[1]);
                        int costo_total = costo1 + costo2;
                        String dt = duracion_total(separar[8], separar2[8]);
                        //separar2[2] es la fecha de salida de la segunda ruta, hay que verificar que sea mayor que fs
                        if (separar2[4].compareTo(separar[7]) == 0 && separar2[7].compareTo(al) == 0 && separar2[5].equals(fs)) {
                            String na = buscarLugar(separar[0]);
                            String ruta_disponible = na + "|" + separar[4] + "|" + separar[7] + "|" + separar2[7] + "|" + separar[3] + "|"
                                    + separar2[6] + "|" + dt + "|" + String.valueOf(costo_total);
                            v_d.add(ruta_disponible);
                        }
                    }
                }
            }
        }
        return v_d;
    }
    public String calcularEdad(String edad) {
        String fechaActual = Principal.fechaHoy();
        Date da = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        fechaActual = df.format(da);

        String[] aFechaIng = edad.split("-");
        Integer aniosInicio = Integer.parseInt(aFechaIng[0]);
        Integer mesInicio = Integer.parseInt(aFechaIng[1]);
        Integer diaInicio = Integer.parseInt(aFechaIng[2]);

        String[] aFecha = fechaActual.split("/");
        Integer diaActual = Integer.parseInt(aFecha[0]);
        Integer mesActual = Integer.parseInt(aFecha[1]);
        Integer aniosActual = Integer.parseInt(aFecha[2]);

        int b = 0;
        int dias = 0;
        int mes;
        int anios = 0;
        int meses = 0;
        mes = mesInicio - 1;
        if (mes == 2) {
            if ((aniosActual % 4 == 0) && ((aniosActual % 100 != 0) || (aniosActual % 400 == 0))) {
                b = 29;
            } else {
                b = 28;
            }
        } else if (mes <= 7) {
            if (mes == 0) {
                b = 32;
            } else if (mes % 2 == 0) {
                b = 30;
            } else {
                b = 31;
            }
        } else if (mes > 7) {
            if (mes % 2 == 0) {
                b = 31;
            } else {
                b = 30;
            }
        }

        if ((aniosInicio > aniosActual) || (Objects.equals(aniosInicio, aniosActual) && mesInicio > mesActual)
                || (Objects.equals(aniosInicio, aniosActual) && Objects.equals(mesInicio, mesActual) && diaInicio > diaActual)) {
        } else if (mesInicio <= mesActual) {
            anios = aniosActual - aniosInicio;
            if (diaInicio <= diaActual) {
                meses = mesActual - mesInicio;
                dias = b - (diaInicio - diaActual);
            } else {
                if (Objects.equals(mesActual, mesInicio)) {
                    anios = anios - 1;
                }
                meses = (mesActual - mesInicio - 1 + 12) % 12;
                dias = b - (diaInicio - diaActual);
            }
        } else {
            anios = aniosActual - aniosInicio - 1;
            if (diaInicio > diaActual) {
                meses = mesActual - mesInicio - 1 + 12;
                dias = b - (diaInicio - diaActual);
            } else {
                meses = mesActual - mesInicio + 12;
                dias = diaActual - diaInicio;
            }
        }
        String an = "Años";
        String me = "Meses";
        String di = "Dias";
        if (anios == 1) {
            an = "Año";
        }
        if (meses == 1) {
            me = "Mes";
        }
        if (dias == 1) {
            di = "Dias";
        }
        return anios + " " + an;
    }
}
