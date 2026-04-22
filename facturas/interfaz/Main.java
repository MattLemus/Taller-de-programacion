package facturas.interfaz;

import java.util.Scanner;
import facturas.negocio.Factura;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número de pieza: ");
        String numeroPieza = sc.nextLine();

        System.out.print("Ingrese descripción de la pieza: ");
        String descripcionPieza = sc.nextLine();

        System.out.print("Ingrese cantidad: ");
        int cantidad = sc.nextInt();

        System.out.print("Ingrese precio por artículo: ");
        double precioPorArticulo = sc.nextDouble();

        Factura factura = new Factura(numeroPieza, descripcionPieza, cantidad, precioPorArticulo);

        System.out.println("\n--- FACTURA ---");
        System.out.println("Número de pieza: " + factura.getNumeroPieza());
        System.out.println("Descripción de la pieza: " + factura.getDescripcionPieza());
        System.out.println("Cantidad: " + factura.getCantidad());
        System.out.println("Precio por artículo: " + factura.getPrecioPorArticulo());
        System.out.println("Monto total: " + factura.obtenerMontoFactura());

        sc.close();
    }
}