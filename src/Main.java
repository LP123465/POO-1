public class Main {
    public static void main(String[] args) {

        // Crear un objeto Libro utilizando el constructor sin parámetros
        Libro libro1 = new Libro();
        System.out.println("Detalles del libro 1 (por defecto):");
        System.out.println(libro1.obtenerDetalles());

        // Actualizar el precio del libro 1
        libro1.actualizarPrecio(29.99);
        System.out.println("\nDespués de actualizar el precio del libro 1:");
        System.out.println(libro1.obtenerDetalles());

        // Crear un objeto Libro utilizando el constructor con parámetros
        Libro libro2 = new Libro("El Quijote", "Miguel de Cervantes", "978-1234567890", 39.99);
        System.out.println("\nDetalles del libro 2:");
        System.out.println(libro2.obtenerDetalles());

        // Actualizar el precio del libro 2
        libro2.actualizarPrecio(34.99);
        System.out.println("\nDespués de actualizar el precio del libro 2:");
        System.out.println(libro2.obtenerDetalles());
    }
}
