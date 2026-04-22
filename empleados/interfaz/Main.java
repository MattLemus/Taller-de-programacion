package empleados.interfaz;

import empleados.negocio.Empleado;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog("Ingrese el primer nombre del empleado 1:");
        String apellido1 = JOptionPane.showInputDialog("Ingrese el apellido del empleado 1:");
        double salario1 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el salario mensual del empleado 1:")
        );

        String nombre2 = JOptionPane.showInputDialog("Ingrese el primer nombre del empleado 2:");
        String apellido2 = JOptionPane.showInputDialog("Ingrese el apellido del empleado 2:");
        double salario2 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el salario mensual del empleado 2:")
        );

        Empleado emp1 = new Empleado(nombre1, apellido1, salario1);
        Empleado emp2 = new Empleado(nombre2, apellido2, salario2);

        JOptionPane.showMessageDialog(
                null,
                "=== Salario Anual Antes del Aumento ===\n"
                        + emp1.getPrimerNombre() + " " + emp1.getApellido() + ": " + emp1.getSalarioAnual()
                        + "\n"
                        + emp2.getPrimerNombre() + " " + emp2.getApellido() + ": " + emp2.getSalarioAnual()
        );

        emp1.aumentarSalario();
        emp2.aumentarSalario();

        JOptionPane.showMessageDialog(
                null,
                "=== Salario Anual Después del Aumento del 10% ===\n"
                        + emp1.getPrimerNombre() + " " + emp1.getApellido() + ": " + emp1.getSalarioAnual()
                        + "\n"
                        + emp2.getPrimerNombre() + " " + emp2.getApellido() + ": " + emp2.getSalarioAnual()
        );
    }
}