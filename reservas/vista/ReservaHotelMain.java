package reservas.vista;

/*
Enunciado:
Crear una clase ReservaHotel que represente una reserva de hotel.
Debe guardar nombre del cliente, tipo de habitación, número de noches,
número de personas y precio por noche.

El tipo de habitación debe tener estos precios:
simple: 35.0
doble: 55.0
suite: 90.0

La clase debe tener:
constructor, métodos get y set, un metodo para calcular subtotal,
un metodo para calcular cargo por personas extra, un metodo para calcular
descuento, un metodo para calcular IVA y un metodo para calcular el total.

Reglas:
Si las noches son menores que 1, deben quedar en 1.
Si las personas son menores que 1, deben quedar en 1.
Si el tipo de habitación no es simple, doble o suite, debe quedar como simple.
Si hay más de 2 personas, se cobra 10.0 adicionales por cada persona extra
por cada noche.
Si la reserva es de 4 a 6 noches, se aplica 8% de descuento.
Si la reserva es de 7 noches o más, se aplica 15% de descuento.
El IVA es del 15%.

Luego debes hacer una clase de prueba que:
pida los datos con JOptionPane,
cree el objeto,
muestre el subtotal,
cargo por personas extra,
descuento,
IVA y total final.

Fuente:
Ejercicio generado con apoyo de IA a partir del tema:
Programación Orientada a Objetos básica en Java, clases, objetos,
constructores, getters, setters, validaciones y uso de JOptionPane.

Prompt utilizado:
"Genera un ejercicio más difícil de Programación Orientada a Objetos en Java
usando JOptionPane. Debe incluir una clase ReservaHotel con atributos privados,
constructor, getters, setters, validaciones, varios métodos de cálculo,
descuentos, IVA y una clase main con ventanas emergentes."
*/

import reservas.modelo.ReservaHotel;
import javax.swing.JOptionPane;

public class ReservaHotelMain {

    public static void main(String[] args) {

        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");

        String tipoHabitacion = JOptionPane.showInputDialog(
                "Ingrese el tipo de habitación:\n"
                        + "simple\n"
                        + "doble\n"
                        + "suite"
        );

        int noches = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el número de noches:")
        );

        int personas = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el número de personas:")
        );

        ReservaHotel reserva = new ReservaHotel(nombreCliente, tipoHabitacion, noches, personas);

        JOptionPane.showMessageDialog(
                null,
                "=== RESERVA DE HOTEL ===\n"
                        + "Cliente: " + reserva.getNombreCliente() + "\n"
                        + "Tipo de habitación: " + reserva.getTipoHabitacion() + "\n"
                        + "Noches: " + reserva.getNoches() + "\n"
                        + "Personas: " + reserva.getPersonas() + "\n"
                        + "Precio por noche: " + reserva.getPrecioPorNoche() + "\n\n"
                        + "Subtotal: " + reserva.calcularSubtotal() + "\n"
                        + "Cargo por personas extra: " + reserva.calcularCargoPersonasExtra() + "\n"
                        + "Descuento: " + reserva.calcularDescuento() + "\n"
                        + "IVA: " + reserva.calcularIVA() + "\n"
                        + "Total final: " + reserva.calcularTotal()
        );
    }
}