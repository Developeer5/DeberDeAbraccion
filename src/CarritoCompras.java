import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {

    private List<Producto> productos;

    public CarritoCompras() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void vaciarCarrito() {
        productos.clear();
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
            return;
        }

        for (Producto p : productos) {
            p.mostrarInformacion();
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularPrecioFinal();
        }
        return total;
    }
}
