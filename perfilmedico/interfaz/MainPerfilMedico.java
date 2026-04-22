package perfilmedico.interfaz;

import perfilmedico.negocio.PerfilMedico;
import java.util.Scanner;

public class MainPerfilMedico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Ingrese el sexo: ");
        String sexo = sc.nextLine();

        System.out.print("Ingrese el día de nacimiento: ");
        int dia = sc.nextInt();

        System.out.print("Ingrese el mes de nacimiento: ");
        int mes = sc.nextInt();

        System.out.print("Ingrese el año de nacimiento: ");
        int anio = sc.nextInt();

        System.out.print("Ingrese la altura en cm: ");
        double altura = sc.nextDouble();

        System.out.print("Ingrese el peso en kg: ");
        double peso = sc.nextDouble();

        PerfilMedico perfil = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        System.out.println("\n=== PERFIL MÉDICO ===");
        System.out.println("Nombre: " + perfil.getPrimerNombre() + " " + perfil.getApellido());
        System.out.println("Sexo: " + perfil.getSexo());
        System.out.println("Fecha de nacimiento: " + perfil.getDiaNacimiento() + "/" + perfil.getMesNacimiento() + "/" + perfil.getAnioNacimiento());
        System.out.println("Altura: " + perfil.getAlturaCm() + " cm");
        System.out.println("Peso: " + perfil.getPesoKg() + " kg");
        System.out.println("Edad: " + perfil.calcularEdad() + " años");
        System.out.println("BMI: " + String.format("%.2f", perfil.calcularBMI()) + " - " + perfil.getCategoriaBMI());
        System.out.println("Frecuencia cardiaca máxima: " + perfil.calcularFrecuenciaMaxima() + " pulsaciones por minuto");
        System.out.println("Rango de frecuencia cardiaca esperada: " + perfil.calcularRangoFrecuencia());

        System.out.println("\n--- Tabla de BMI ---");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso: 30 o más");

        sc.close();
    }
}