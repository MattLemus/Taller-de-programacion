package productos.vista;

/*
Enunciado:
Crear una clase Producto que represente un producto de una tienda.
Debe guardar código, nombre, cantidad en stock y precio unitario.
La clase debe tener constructor, métodos get y set, y un metodo para calcular
el valor total del inventario. Si la cantidad o el precio son negativos,
deben quedar en 0.

Fuente:
Ejercicio generado con apoyo de IA a partir del tema:
Programación Orientada a Objetos básica en Java, clases, objetos,
constructores, getters, setters, validaciones y uso de Scanner.

Prompt utilizado:
"Genera un ejercicio básico de Programación Orientada a Objetos en Java,
similar a los ejercicios de clases Factura, Empleado y Fecha. Debe incluir
atributos privados, constructor, métodos get y set, validaciones, un metodo
de cálculo y una clase de prueba usando Scanner."
*/

import productos.modelo.Producto;
import java.util.Scanner;

public class ProductoMain {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el código del producto: ");
        String codigo = entrada.nextLine();

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese la cantidad en stock: ");
        int cantidad = entrada.nextInt();

        System.out.print("Ingrese el precio unitario: ");
        double precio = entrada.nextDouble();

        Producto producto = new Producto(codigo, nombre, cantidad, precio);

        System.out.println("\n=== Información del Producto ===");
        System.out.println("Código: " + producto.getCodigo());
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Cantidad en stock: " + producto.getCantidadStock());
        System.out.println("Precio unitario: " + producto.getPrecioUnitario());
        System.out.println("Valor total del inventario: " + producto.calcularValorInventario());

        entrada.close();
    }
}
