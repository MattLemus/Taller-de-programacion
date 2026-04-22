package frecuencias.negocio;

public class FrecuenciasCardiacas {

    private String primerNombre;
    private String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;

    public FrecuenciasCardiacas(String primerNombre, String apellido, int diaNacimiento, int mesNacimiento, int anioNacimiento) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
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

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int calcularEdad() {
        return 2026 - anioNacimiento;
    }

    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    public String calcularRangoFrecuenciaEsperada() {
        double minimo = calcularFrecuenciaMaxima() * 0.50;
        double maximo = calcularFrecuenciaMaxima() * 0.85;
        return minimo + " - " + maximo + " pulsaciones por minuto";
    }
}