package productos.modelo;

public class Producto {

    private String codigo;
    private String nombre;
    private int cantidadStock;
    private double precioUnitario;

    public Producto(String codigo, String nombre, int cantidadStock, double precioUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        setCantidadStock(cantidadStock);
        setPrecioUnitario(precioUnitario);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        if (cantidadStock < 0) {
            this.cantidadStock = 0;
        } else {
            this.cantidadStock = cantidadStock;
        }
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario < 0) {
            this.precioUnitario = 0.0;
        } else {
            this.precioUnitario = precioUnitario;
        }
    }

    public double calcularValorInventario() {
        return cantidadStock * precioUnitario;
    }
}
