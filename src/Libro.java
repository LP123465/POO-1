public class Libro {

    // Atributos de la clase
    private String titulo;
    private String autor;
    private String ISBN;
    private double precio;

    // Constructor sin parámetros (valores por defecto)
    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.ISBN = "000-0000000000";
        this.precio = 0.0;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, String ISBN, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
    }

    // Método para obtener los detalles del libro
    public String obtenerDetalles() {
        return "Título: " + this.titulo + "\n" +
                "Autor: " + this.autor + "\n" +
                "ISBN: " + this.ISBN + "\n" +
                "Precio: $" + this.precio;
    }

    // Método para actualizar el precio del libro
    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    // Getters y Setters (opcional si se desea más flexibilidad)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
