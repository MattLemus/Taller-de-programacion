package juego.principal;

import java.util.Scanner;
import juego.proceso.Proceso;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Proceso appStore = new Proceso();

        int opcion;

        do {
            System.out.println("\n========== MENU APPSTORE ==========");
            System.out.println("1. Visualizar la informacion detallada de cada juego");
            System.out.println("2. Comprar licencias de un juego");
            System.out.println("3. Vender licencias de un juego");
            System.out.println("4. Consultar el juego mas vendido");
            System.out.println("5. Consultar descuentos aplicados por volumen de compra");
            System.out.println("6. Consultar juego menos vendido");
            System.out.println("7. Consultar compras por politica porcentaje");
            System.out.println("8. Consultar compras por politica categoria");
            System.out.println("9. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n" + appStore.visualizarInformacion());
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del juego: ");
                    String nombreCompra = sc.nextLine();
                    System.out.print("Ingrese cantidad de licencias a comprar: ");
                    int cantidadCompra = sc.nextInt();
                    sc.nextLine();
                    System.out.println(appStore.comprarLicencias(nombreCompra, cantidadCompra));
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del juego: ");
                    String nombreVenta = sc.nextLine();
                    System.out.print("Ingrese cantidad de licencias a vender: ");
                    int cantidadVenta = sc.nextInt();
                    sc.nextLine();
                    System.out.println(appStore.venderLicencias(nombreVenta, cantidadVenta));
                    break;

                case 4:
                    System.out.println(appStore.consultarJuegoMasVendido());
                    break;

                case 5:
                    System.out.print("Ingrese cantidad de licencias de rompecabezas: ");
                    int cantRompecabezas = sc.nextInt();
                    System.out.print("Ingrese cantidad de licencias de accion: ");
                    int cantAccion = sc.nextInt();
                    System.out.print("Ingrese cantidad de licencias de deporte: ");
                    int cantDeporte = sc.nextInt();
                    sc.nextLine();
                    System.out.println(appStore.consultarDescuento(cantRompecabezas, cantAccion, cantDeporte));
                    break;

                case 6:
                    System.out.println("Juego menos vendido: " + appStore.darJuegoMenosVendido());
                    break;

                case 7:
                    System.out.println(appStore.metodo1());
                    break;

                case 8:
                    System.out.println("Juegos que se deben comprar segun politica categoria: " + appStore.metodo2());
                    break;

                case 9:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 9);

        sc.close();
    }
}