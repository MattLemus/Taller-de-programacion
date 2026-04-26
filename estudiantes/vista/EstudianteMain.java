package estudiantes.vista;

/*
Enunciado:
Crear una clase Estudiante que represente a un estudiante.
Debe guardar nombre, apellido, primera nota, segunda nota y tercera nota.
La clase debe tener constructor, métodos get y set, y un metodo para calcular
el promedio. Si una nota es menor que 0, debe quedar en 0.0.
Si una nota es mayor que 10, debe quedar en 10.0.

Fuente:
Ejercicio generado con apoyo de IA a partir del tema:
Programación Orientada a Objetos básica en Java, clases, objetos,
constructores, getters, setters, validaciones y uso de JOptionPane.

Prompt utilizado:
"Genera un ejercicio básico de Programación Orientada a Objetos en Java
sobre una clase Estudiante. Debe incluir atributos privados, constructor,
getters, setters, validación de notas entre 0 y 10, un metodo para calcular
el promedio y una clase de prueba usando JOptionPane."
*/

import estudiantes.modelo.Estudiante;
import javax.swing.JOptionPane;

public class EstudianteMain {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del estudiante:");

        double nota1 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese la primera nota:")
        );

        double nota2 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese la segunda nota:")
        );

        double nota3 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese la tercera nota:")
        );

        Estudiante estudiante = new Estudiante(nombre, apellido, nota1, nota2, nota3);

        JOptionPane.showMessageDialog(
                null,
                "=== Información del Estudiante ===\n"
                        + "Nombre completo: " + estudiante.getNombreCompleto() + "\n"
                        + "Nota 1: " + estudiante.getNota1() + "\n"
                        + "Nota 2: " + estudiante.getNota2() + "\n"
                        + "Nota 3: " + estudiante.getNota3() + "\n"
                        + "Promedio final: " + estudiante.calcularPromedio()
        );
    }
}