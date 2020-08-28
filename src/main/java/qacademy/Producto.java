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

    public Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }
}
