public class ProductoFisico extends Producto implements DescuentoAplicable {

    private double costoEnvio;
    private double impuestoIVA; // porcentaje ejemplo 12%

    public ProductoFisico(String nombre, double precioBase, double costoEnvio, double impuestoIVA) {
        super(nombre, precioBase);
        this.costoEnvio = costoEnvio;
        this.impuestoIVA = impuestoIVA;
    }

    @Override
    public double calcularPrecioFinal() {
        double ivaCalculado = getPrecioBase() * (impuestoIVA / 100);
        return getPrecioBase() + ivaCalculado + costoEnvio;
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
        System.out.println("Tipo producto: Físico");
        System.out.println("Costo de envío: $" + costoEnvio);
        System.out.println("IVA: " + impuestoIVA + "%");
        System.out.println("Precio final: $" + calcularPrecioFinal());
        System.out.println("-----------------------------------");
    }
}
