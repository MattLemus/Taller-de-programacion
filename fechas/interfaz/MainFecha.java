package fechas.interfaz;

import fechas.negocio.Fecha;
import java.util.Scanner;

public class MainFecha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el mes: ");
        int mes = sc.nextInt();

        System.out.print("Ingrese el día: ");
        int dia = sc.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = sc.nextInt();

        Fecha fecha = new Fecha(mes, dia, anio);

        System.out.println("Fecha ingresada: " + fecha.mostrarFecha());

        sc.close();
    }


}