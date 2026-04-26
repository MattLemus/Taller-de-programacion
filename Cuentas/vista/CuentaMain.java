package Cuentas.vista;

/*
Enunciado:
Crear una clase Cuenta que represente una cuenta bancaria básica.
Debe guardar número de cuenta, nombre del titular y saldo.
La clase debe tener constructor, métodos get y set, un metodo para depositar
dinero y otro para retirar dinero. Si el saldo inicial es negativo,
debe quedar en 0.0. Si el depósito es negativo, no debe aceptarse.
Si el retiro es mayor al saldo, no debe realizarse.

Fuente:
Ejercicio generado con apoyo de IA a partir del tema:
Programación Orientada a Objetos básica en Java, clases, objetos,
constructores, getters, setters, validaciones y uso de JOptionPane.

Prompt utilizado:
"Genera un ejercicio básico de Programación Orientada a Objetos en Java
sobre una clase Cuenta bancaria. Debe incluir atributos privados, constructor,
getters, setters, validaciones, métodos depositar y retirar, y una clase
de prueba usando JOptionPane."
*/

import Cuentas.modelo.Cuenta;
import javax.swing.JOptionPane;

public class CuentaMain {

    public static void main(String[] args) {

        String numeroCuenta = JOptionPane.showInputDialog("Ingrese el número de cuenta:");
        String titular = JOptionPane.showInputDialog("Ingrese el nombre del titular:");

        double saldoInicial = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el saldo inicial:")
        );

        Cuenta cuenta = new Cuenta(numeroCuenta, titular, saldoInicial);

        double deposito = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el valor a depositar:")
        );

        cuenta.depositar(deposito);

        double retiro = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el valor a retirar:")
        );

        cuenta.retirar(retiro);

        JOptionPane.showMessageDialog(
                null,
                "=== Información de la Cuenta ===\n"
                        + "Número de cuenta: " + cuenta.getNumeroCuenta() + "\n"
                        + "Titular: " + cuenta.getTitular() + "\n"
                        + "Saldo final: " + cuenta.getSaldo()
        );
    }
}