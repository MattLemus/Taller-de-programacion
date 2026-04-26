package reservas.modelo;

public class ReservaHotel {

    private String nombreCliente;
    private String tipoHabitacion;
    private int noches;
    private int personas;
    private double precioPorNoche;

    public ReservaHotel(String nombreCliente, String tipoHabitacion, int noches, int personas) {
        this.nombreCliente = nombreCliente;
        this.tipoHabitacion = tipoHabitacion;
        setNoches(noches);
        setPersonas(personas);
        asignarPrecioPorNoche();
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
        asignarPrecioPorNoche();
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        if (noches < 1) {
            this.noches = 1;
        } else {
            this.noches = noches;
        }
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        if (personas < 1) {
            this.personas = 1;
        } else {
            this.personas = personas;
        }
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    private void asignarPrecioPorNoche() {
        if (tipoHabitacion.equalsIgnoreCase("simple")) {
            precioPorNoche = 35.0;
        } else if (tipoHabitacion.equalsIgnoreCase("doble")) {
            precioPorNoche = 55.0;
        } else if (tipoHabitacion.equalsIgnoreCase("suite")) {
            precioPorNoche = 90.0;
        } else {
            tipoHabitacion = "simple";
            precioPorNoche = 35.0;
        }
    }

    public double calcularSubtotal() {
        return noches * precioPorNoche;
    }

    public double calcularCargoPersonasExtra() {
        if (personas > 2) {
            return (personas - 2) * 10.0 * noches;
        } else {
            return 0.0;
        }
    }

    public double calcularDescuento() {
        if (noches >= 7) {
            return (calcularSubtotal() + calcularCargoPersonasExtra()) * 0.15;
        } else if (noches >= 4) {
            return (calcularSubtotal() + calcularCargoPersonasExtra()) * 0.08;
        } else {
            return 0.0;
        }
    }

    public double calcularIVA() {
        return (calcularSubtotal() + calcularCargoPersonasExtra() - calcularDescuento()) * 0.15;
    }

    public double calcularTotal() {
        return calcularSubtotal() + calcularCargoPersonasExtra() - calcularDescuento() + calcularIVA();
    }
}