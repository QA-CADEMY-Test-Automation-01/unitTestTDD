package qacademy;

public class Producto {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    private int precio;

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    private int cantidad;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre, int precio, int cantidad) {
        this(nombre, precio);
        this.cantidad = cantidad;
    }


}
