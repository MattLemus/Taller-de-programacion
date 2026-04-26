package estudiantes.modelo;

public class Estudiante {

    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudiante(String nombre, String apellido, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.apellido = apellido;
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = validarNota(nota1);
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = validarNota(nota2);
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = validarNota(nota3);
    }

    private double validarNota(double nota) {
        if (nota < 0) {
            return 0.0;
        } else if (nota > 10) {
            return 10.0;
        } else {
            return nota;
        }
    }

    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
}