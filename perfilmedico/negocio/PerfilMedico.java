package perfilmedico.negocio;

public class PerfilMedico {

    private String primerNombre;
    private String apellido;
    private String sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double alturaCm;
    private double pesoKg;

    public PerfilMedico(String primerNombre, String apellido, String sexo,
                        int diaNacimiento, int mesNacimiento, int anioNacimiento,
                        double alturaCm, double pesoKg) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.alturaCm = alturaCm;
        this.pesoKg = pesoKg;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public double getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(double alturaCm) {
        this.alturaCm = alturaCm;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public int calcularEdad() {
        return 2026 - anioNacimiento;
    }

    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    public String calcularRangoFrecuencia() {
        double minimo = calcularFrecuenciaMaxima() * 0.50;
        double maximo = calcularFrecuenciaMaxima() * 0.85;
        return minimo + " - " + maximo + " pulsaciones por minuto";
    }

    public double calcularBMI() {
        double alturaMetros = alturaCm / 100.0;
        return pesoKg / (alturaMetros * alturaMetros);
    }

    public String getCategoriaBMI() {
        double bmi = calcularBMI();

        if (bmi < 18.5) {
            return "Bajo peso";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 29.9) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }
    }
}