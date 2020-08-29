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
        for (Producto producto : productoList) {
            total += (producto.getPrecio() * producto.getCantidad());
        }
        return total;
    }

    public String getDetalle() {
        String formatoDetalle = "**** Detalle ****\n";
        for (Producto item: productoList) {
            formatoDetalle = formatoDetalle.concat(String.format("%s Bs. %s\n", item.getNombre(), item.getPrecio()));
        }
        formatoDetalle = formatoDetalle.concat(String.format("\nTotal Bs. %s", this.importeTotal()));
        return formatoDetalle;
    }

    public String getDetalleConCantidad() {
        String formatoDetalle = "**** Detalle ****\n";
        for (Producto item: productoList) {
            formatoDetalle = formatoDetalle.concat(String.format("%s %s Bs. %s\n",item.getCantidad(), item.getNombre(), item.getPrecio()));
        }
        formatoDetalle = formatoDetalle.concat(String.format("\nTotal Bs. %s", this.importeTotal()));
        return formatoDetalle;
    }
}
