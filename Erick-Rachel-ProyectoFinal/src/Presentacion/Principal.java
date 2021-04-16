package Presentacion;

import Negocio.*;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

public class Principal {

    public static Listas l = new Listas();
    public static String[][] asientos = new String[15][6];
    public static ArrayList<String> usuarios = new ArrayList<>();
    public static ArrayList<String> lugares = new ArrayList<>();
    public static ArrayList<String> terminales = new ArrayList<>();
    public static ArrayList<String> numterminales = new ArrayList<>();
    public static ArrayList<String> rutas = new ArrayList<>();
   public static ArrayList<String> unidades = new ArrayList<>();
   
    public static void main(String[] args) {

        l.llenar_lista_usuarios(usuarios);
        l.llenarLista_Lugares(lugares);
        l.llenarLista_numeroTerminal(numterminales);
        Inicio_Sesion login = new Inicio_Sesion();
        login.setVisible(true);
    }

    public static String generar(String fecha) {
        StringTokenizer st = new StringTokenizer(fecha, "/");
        String dia = st.nextToken();
        String mes = st.nextToken();
        String año = st.nextToken();
        String fecha1 = año + "-" + mes + "-" + dia;
        return fecha1;
    }

    public static String leerFecha(JDateChooser j) {
        Date date = j.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }
    
    public static String fechaHoy(){
        String fecha = "";
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        fecha = formato.format(fechaActual);
        return fecha;
    }
}
