package juego.proceso;

public class Proceso {

    // Constantes de políticas
    public static final double PORCENTAJE_COMPRA = 0.25;
    public static final int LIMITE_DEPORTE = 10;
    public static final int LIMITE_ACCION = 15;
    public static final int LIMITE_ROMPECABEZAS = 10;

    // Juego 1
    private String nombre1;
    private String categoria1;
    private int tamanio1;
    private double precio1;
    private int licenciasDisponibles1;
    private int licenciasVendidas1;

    // Juego 2
    private String nombre2;
    private String categoria2;
    private int tamanio2;
    private double precio2;
    private int licenciasDisponibles2;
    private int licenciasVendidas2;

    // Juego 3
    private String nombre3;
    private String categoria3;
    private int tamanio3;
    private double precio3;
    private int licenciasDisponibles3;
    private int licenciasVendidas3;

    // Juego 4
    private String nombre4;
    private String categoria4;
    private int tamanio4;
    private double precio4;
    private int licenciasDisponibles4;
    private int licenciasVendidas4;

    public Proceso() {
        // Datos iniciales de ejemplo
        nombre1 = "Fifa";
        categoria1 = "deporte";
        tamanio1 = 5000;
        precio1 = 120.0;
        licenciasDisponibles1 = 30;
        licenciasVendidas1 = 10;

        nombre2 = "PuzzleMax";
        categoria2 = "rompecabezas";
        tamanio2 = 2000;
        precio2 = 80.0;
        licenciasDisponibles2 = 40;
        licenciasVendidas2 = 5;

        nombre3 = "StreetFight";
        categoria3 = "accion";
        tamanio3 = 4500;
        precio3 = 100.0;
        licenciasDisponibles3 = 20;
        licenciasVendidas3 = 8;

        nombre4 = "MotoRace";
        categoria4 = "deporte";
        tamanio4 = 3500;
        precio4 = 90.0;
        licenciasDisponibles4 = 15;
        licenciasVendidas4 = 6;
    }

    public String visualizarInformacion() {
        String info = "";

        info += "=== JUEGO 1 ===\n";
        info += "Nombre: " + nombre1 + "\n";
        info += "Categoria: " + categoria1 + "\n";
        info += "Tamanio: " + tamanio1 + " KB\n";
        info += "Precio: $" + precio1 + "\n";
        info += "Licencias disponibles: " + licenciasDisponibles1 + "\n";
        info += "Licencias vendidas: " + licenciasVendidas1 + "\n\n";

        info += "=== JUEGO 2 ===\n";
        info += "Nombre: " + nombre2 + "\n";
        info += "Categoria: " + categoria2 + "\n";
        info += "Tamanio: " + tamanio2 + " KB\n";
        info += "Precio: $" + precio2 + "\n";
        info += "Licencias disponibles: " + licenciasDisponibles2 + "\n";
        info += "Licencias vendidas: " + licenciasVendidas2 + "\n\n";

        info += "=== JUEGO 3 ===\n";
        info += "Nombre: " + nombre3 + "\n";
        info += "Categoria: " + categoria3 + "\n";
        info += "Tamanio: " + tamanio3 + " KB\n";
        info += "Precio: $" + precio3 + "\n";
        info += "Licencias disponibles: " + licenciasDisponibles3 + "\n";
        info += "Licencias vendidas: " + licenciasVendidas3 + "\n\n";

        info += "=== JUEGO 4 ===\n";
        info += "Nombre: " + nombre4 + "\n";
        info += "Categoria: " + categoria4 + "\n";
        info += "Tamanio: " + tamanio4 + " KB\n";
        info += "Precio: $" + precio4 + "\n";
        info += "Licencias disponibles: " + licenciasDisponibles4 + "\n";
        info += "Licencias vendidas: " + licenciasVendidas4 + "\n";

        return info;
    }

    public String comprarLicencias(String nombreJuego, int cantidad) {
        if (cantidad <= 0) {
            return "La cantidad debe ser mayor que 0.";
        }

        if (nombreJuego.equalsIgnoreCase(nombre1)) {
            licenciasDisponibles1 += cantidad;
            return "Compra realizada correctamente para " + nombre1 + ".";
        } else if (nombreJuego.equalsIgnoreCase(nombre2)) {
            licenciasDisponibles2 += cantidad;
            return "Compra realizada correctamente para " + nombre2 + ".";
        } else if (nombreJuego.equalsIgnoreCase(nombre3)) {
            licenciasDisponibles3 += cantidad;
            return "Compra realizada correctamente para " + nombre3 + ".";
        } else if (nombreJuego.equalsIgnoreCase(nombre4)) {
            licenciasDisponibles4 += cantidad;
            return "Compra realizada correctamente para " + nombre4 + ".";
        } else {
            return "Juego no encontrado.";
        }
    }

    public String venderLicencias(String nombreJuego, int cantidad) {
        if (cantidad <= 0) {
            return "La cantidad debe ser mayor que 0.";
        }

        if (nombreJuego.equalsIgnoreCase(nombre1)) {
            if (cantidad <= licenciasDisponibles1) {
                licenciasDisponibles1 -= cantidad;
                licenciasVendidas1 += cantidad;
                return "Venta realizada correctamente para " + nombre1 + ".";
            } else {
                return "No hay suficientes licencias disponibles de " + nombre1 + ".";
            }
        } else if (nombreJuego.equalsIgnoreCase(nombre2)) {
            if (cantidad <= licenciasDisponibles2) {
                licenciasDisponibles2 -= cantidad;
                licenciasVendidas2 += cantidad;
                return "Venta realizada correctamente para " + nombre2 + ".";
            } else {
                return "No hay suficientes licencias disponibles de " + nombre2 + ".";
            }
        } else if (nombreJuego.equalsIgnoreCase(nombre3)) {
            if (cantidad <= licenciasDisponibles3) {
                licenciasDisponibles3 -= cantidad;
                licenciasVendidas3 += cantidad;
                return "Venta realizada correctamente para " + nombre3 + ".";
            } else {
                return "No hay suficientes licencias disponibles de " + nombre3 + ".";
            }
        } else if (nombreJuego.equalsIgnoreCase(nombre4)) {
            if (cantidad <= licenciasDisponibles4) {
                licenciasDisponibles4 -= cantidad;
                licenciasVendidas4 += cantidad;
                return "Venta realizada correctamente para " + nombre4 + ".";
            } else {
                return "No hay suficientes licencias disponibles de " + nombre4 + ".";
            }
        } else {
            return "Juego no encontrado.";
        }
    }

    public String consultarJuegoMasVendido() {
        int mayor = licenciasVendidas1;
        String nombreMayor = nombre1;

        if (licenciasVendidas2 > mayor) {
            mayor = licenciasVendidas2;
            nombreMayor = nombre2;
        }
        if (licenciasVendidas3 > mayor) {
            mayor = licenciasVendidas3;
            nombreMayor = nombre3;
        }
        if (licenciasVendidas4 > mayor) {
            mayor = licenciasVendidas4;
            nombreMayor = nombre4;
        }

        return "El juego más vendido es: " + nombreMayor + " con " + mayor + " licencias vendidas.";
    }

    public String consultarDescuento(int cantRompecabezas, int cantAccion, int cantDeporte) {
        double total = cantRompecabezas * obtenerPrecioCategoria("rompecabezas")
                + cantAccion * obtenerPrecioCategoria("accion")
                + cantDeporte * obtenerPrecioCategoria("deporte");

        if (cantRompecabezas >= 25) {
            double descuento = total * 0.20;
            double totalFinal = total - descuento;
            return "Se aplica descuento del 20%.\nTotal sin descuento: $" + total
                    + "\nDescuento: $" + descuento
                    + "\nTotal a pagar: $" + totalFinal;
        } else if (cantDeporte >= 20 && cantAccion >= 15) {
            double descuento = total * 0.15;
            double totalFinal = total - descuento;
            return "Se aplica descuento del 15%.\nTotal sin descuento: $" + total
                    + "\nDescuento: $" + descuento
                    + "\nTotal a pagar: $" + totalFinal;
        } else {
            return "No aplica descuento.\nTotal a pagar: $" + total;
        }
    }

    private double obtenerPrecioCategoria(String categoriaBuscada) {
        if (categoria1.equalsIgnoreCase(categoriaBuscada)) {
            return precio1;
        }
        if (categoria2.equalsIgnoreCase(categoriaBuscada)) {
            return precio2;
        }
        if (categoria3.equalsIgnoreCase(categoriaBuscada)) {
            return precio3;
        }
        if (categoria4.equalsIgnoreCase(categoriaBuscada)) {
            return precio4;
        }
        return 0;
    }

    public String darJuegoMenosVendido() {
        if (licenciasVendidas1 == licenciasVendidas2 &&
                licenciasVendidas2 == licenciasVendidas3 &&
                licenciasVendidas3 == licenciasVendidas4) {
            return "NINGUNO";
        }

        int menor = licenciasVendidas1;
        String nombreMenor = nombre1;

        if (licenciasVendidas2 < menor) {
            menor = licenciasVendidas2;
            nombreMenor = nombre2;
        }
        if (licenciasVendidas3 < menor) {
            menor = licenciasVendidas3;
            nombreMenor = nombre3;
        }
        if (licenciasVendidas4 < menor) {
            menor = licenciasVendidas4;
            nombreMenor = nombre4;
        }

        return nombreMenor;
    }

    public String darComprasPorPorcentaje() {
        String juegoMenosVendido = darJuegoMenosVendido();

        if (juegoMenosVendido.equals("NINGUNO")) {
            return "NINGUNO";
        }

        int cantidadBase = obtenerLicenciasVendidasPorNombre(juegoMenosVendido);
        double limite = cantidadBase * PORCENTAJE_COMPRA;

        String respuesta = "";

        if (licenciasDisponibles1 < limite) {
            respuesta += nombre1 + " ";
        }
        if (licenciasDisponibles2 < limite) {
            respuesta += nombre2 + " ";
        }
        if (licenciasDisponibles3 < limite) {
            respuesta += nombre3 + " ";
        }
        if (licenciasDisponibles4 < limite) {
            respuesta += nombre4 + " ";
        }

        if (respuesta.equals("")) {
            return "NINGUNO";
        }

        return respuesta;
    }

    public String metodo1() {
        return "Juegos que se deberian comprar segun la politica porcentaje: " + darComprasPorPorcentaje();
    }

    public boolean seDebeComprarPorCategoria(String nombreJuego) {
        if (nombreJuego.equalsIgnoreCase(nombre1)) {
            return validarCategoria(categoria1, licenciasDisponibles1);
        } else if (nombreJuego.equalsIgnoreCase(nombre2)) {
            return validarCategoria(categoria2, licenciasDisponibles2);
        } else if (nombreJuego.equalsIgnoreCase(nombre3)) {
            return validarCategoria(categoria3, licenciasDisponibles3);
        } else if (nombreJuego.equalsIgnoreCase(nombre4)) {
            return validarCategoria(categoria4, licenciasDisponibles4);
        }
        return false;
    }

    public String metodo2() {
        String respuesta = "";

        if (seDebeComprarPorCategoria(nombre1)) {
            respuesta += nombre1 + " ";
        }
        if (seDebeComprarPorCategoria(nombre2)) {
            respuesta += nombre2 + " ";
        }
        if (seDebeComprarPorCategoria(nombre3)) {
            respuesta += nombre3 + " ";
        }
        if (seDebeComprarPorCategoria(nombre4)) {
            respuesta += nombre4 + " ";
        }

        if (respuesta.equals("")) {
            return "NINGUNO";
        }

        return respuesta;
    }

    private boolean validarCategoria(String categoria, int licenciasDisponibles) {
        if (categoria.equalsIgnoreCase("deporte")) {
            return licenciasDisponibles < LIMITE_DEPORTE;
        } else if (categoria.equalsIgnoreCase("accion")) {
            return licenciasDisponibles < LIMITE_ACCION;
        } else if (categoria.equalsIgnoreCase("rompecabezas")) {
            return licenciasDisponibles < LIMITE_ROMPECABEZAS;
        }
        return false;
    }

    private int obtenerLicenciasVendidasPorNombre(String nombreJuego) {
        if (nombreJuego.equalsIgnoreCase(nombre1)) {
            return licenciasVendidas1;
        } else if (nombreJuego.equalsIgnoreCase(nombre2)) {
            return licenciasVendidas2;
        } else if (nombreJuego.equalsIgnoreCase(nombre3)) {
            return licenciasVendidas3;
        } else if (nombreJuego.equalsIgnoreCase(nombre4)) {
            return licenciasVendidas4;
        }
        return 0;
    }
}