package qacademy;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private List<Producto> productoList = new ArrayList<>();
    public void comprar(Producto producto) {
        this.productoList.add(producto);
    }

    public int importeTotal() {
        int total = 0;
        for ( Producto producto : productoList) {
            total += producto.getPrecio() ;
        }
        return total;
    }
}
