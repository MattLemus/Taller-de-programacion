package rectangulos.visual;

/*
Enunciado:
Crear una clase Rectangulo que represente un rectángulo.
Debe guardar base y altura. La clase debe tener constructor, métodos get y set,
un metodo para calcular el área y otro metodo para calcular el perímetro.
Si la base o la altura son negativas, deben quedar en 0.0.

Fuente:
Ejercicio generado con apoyo de IA a partir del tema:
Programación Orientada a Objetos básica en Java, clases, objetos,
constructores, getters, setters, validaciones y uso de Scanner.

Prompt utilizado:
"Genera un ejercicio básico de Programación Orientada a Objetos en Java
sobre una clase Rectangulo. Debe tener atributos privados, constructor,
getters, setters, validación de valores negativos, métodos para calcular
área y perímetro, y una clase de prueba usando Scanner."
*/

import rectangulos.modelo.Rectangulo;
import java.util.Scanner;
import java.util.Locale;

public class RectanguloMain {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Ingrese la base del rectángulo: ");
        double base = entrada.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = entrada.nextDouble();

        Rectangulo rectangulo = new Rectangulo(base, altura);

        System.out.println("\n=== Información del Rectángulo ===");
        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());

        entrada.close();
    }
}