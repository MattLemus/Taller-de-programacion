package frecuencias.interfaz;

import frecuencias.negocio.FrecuenciasCardiacas;
import javax.swing.JOptionPane;

public class MainFrecuencias {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese el primer nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido:");
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de nacimiento:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de nacimiento:"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento:"));

        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, dia, mes, anio);

        JOptionPane.showMessageDialog(
                null,
                "=== INFORMACIÓN DE FRECUENCIA CARDIACA ===\n"
                        + "Nombre: " + persona.getPrimerNombre() + " " + persona.getApellido()
                        + "\nFecha de nacimiento: " + persona.getDiaNacimiento() + "/" + persona.getMesNacimiento() + "/" + persona.getAnioNacimiento()
                        + "\nEdad: " + persona.calcularEdad() + " años"
                        + "\nFrecuencia cardiaca máxima: " + persona.calcularFrecuenciaMaxima() + " pulsaciones por minuto"
                        + "\nRango de frecuencia cardiaca esperada: " + persona.calcularRangoFrecuenciaEsperada()
        );
    }
}