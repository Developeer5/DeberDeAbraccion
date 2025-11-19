//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Productos dados en la guía
        ProductoFisico laptop = new ProductoFisico("Laptop Gamer", 1200.0, 25.0, 12.0);
        ProductoFisico smartphone = new ProductoFisico("Smartphone X", 800.0, 15.0, 12.0);
        ProductoDigital curso = new ProductoDigital("Curso Java Avanzado", 50.0, 10.0);
        ProductoDigital ebook = new ProductoDigital("Ebook Clean Code", 20.0, 2.0);

        // 3 productos nuevos
        ProductoFisico monitor = new ProductoFisico("Monitor 4K", 300.0, 20.0, 12.0);
        ProductoDigital videojuego = new ProductoDigital("Videojuego Indie", 15.0, 3.0);
        ProductoFisico teclado = new ProductoFisico("Teclado Mecánico", 90.0, 10.0, 12.0);

        // Carrito
        CarritoCompras carrito = new CarritoCompras();

        carrito.agregarProducto(laptop);
        carrito.agregarProducto(smartphone);
        carrito.agregarProducto(curso);
        carrito.agregarProducto(ebook);
        carrito.agregarProducto(monitor);
        carrito.agregarProducto(videojuego);
        carrito.agregarProducto(teclado);

        // Mostrar productos
        System.out.println("=== Profesor este deber lo hice con IA, ya que no tuve tiempo, recien pude sentarme a hacer ===");
        System.out.println("=== CONTENIDO DEL CARRITO ===");
        carrito.mostrarProductos();

        // Total
        System.out.println("Total general del carrito: $" + carrito.calcularTotal());

        // Vaciar carrito
        carrito.vaciarCarrito();
        System.out.println("\nCarrito vaciado.");
        carrito.mostrarProductos();
    }
}
