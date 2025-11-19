public class ProductoDigital extends Producto implements DescuentoAplicable {

    private double costoLicencia;

    public ProductoDigital(String nombre, double precioBase, double costoLicencia) {
        super(nombre, precioBase);
        this.costoLicencia = costoLicencia;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() + costoLicencia;
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        double descuento = getPrecioBase() * (porcentaje / 100);
        double nuevoPrecio = getPrecioBase() - descuento;
        setPrecioBase(nuevoPrecio);
        return nuevoPrecio;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo producto: Digital");
        System.out.println("Costo licencia: $" + costoLicencia);
        System.out.println("Precio final: $" + calcularPrecioFinal());
        System.out.println("-----------------------------------");
    }
}
