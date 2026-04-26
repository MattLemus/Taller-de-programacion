package Cuentas.modelo;

public class Cuenta {

    private String numeroCuenta;
    private String titular;
    private double saldo;

    public Cuenta(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        setSaldo(saldo);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            this.saldo = 0.0;
        } else {
            this.saldo = saldo;
        }
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo = saldo - cantidad;
        }
    }
}