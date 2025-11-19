public abstract class Producto {

    private String nombre;

    private double precioBase;

    public Producto(String nombre, double precioBase) {

        this.nombre = nombre;

        this.precioBase = precioBase;

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public double getPrecioBase() {

        return precioBase;

    }

    public void setPrecioBase(double precioBase) {

        this.precioBase = precioBase;

    }

    public abstract double calcularPrecioFinal();

    public void mostrarInformacion() {

        System.out.println("Nombre: " + nombre);

        System.out.println("Precio base: $" + precioBase);

    }

}