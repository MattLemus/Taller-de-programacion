package empleados.negocio;

public class Empleado {

    private String primerNombre;
    private String apellido;
    private double salarioMensual;

    public Empleado(String primerNombre, String apellido, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;

        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        } else {
            this.salarioMensual = 0.0;
        }
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        } else {
            this.salarioMensual = 0.0;
        }
    }

    public double getSalarioAnual() {
        return salarioMensual * 12;
    }

    public void aumentarSalario() {
        salarioMensual = salarioMensual * 1.10;
    }
}