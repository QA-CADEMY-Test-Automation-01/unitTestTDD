package qacademy.market;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TiendaTest {

    @Test
    public void testImporteTotalCompraEjemplo() {
        //Arrange
        Factura factura = new Factura();
        factura.comprar(new Producto("Pan", 1));
        factura.comprar(new Producto("Fideos", 5));
        factura.comprar(new Producto("Bolsa de leche", 6));
        int valorEsperado = 12;
        //Act
        int valorCalculado = factura.importeTotal();
        //Assert
        assertEquals(valorEsperado, valorCalculado);
    }

    @Test
    public void testDetalle() {
        //Arrange
        String expected = "**** Detalle ****\nPan Bs. 1\nFideos Bs. 5\nBolsa de leche Bs. 6\n\nTotal Bs. 12";
        Factura factura = new Factura();
        factura.comprar(new Producto("Pan", 1));
        factura.comprar(new Producto("Fideos", 5));
        factura.comprar(new Producto("Bolsa de leche", 6));
        //Act
        String actual = factura.getDetalle();
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testDetalleConCantidad() {
        //Arrange
        String expected = "**** Detalle ****\n3 Pan Bs. 1\n2 Fideos Bs. 5\n1 Bolsa de leche Bs. 6\n\nTotal Bs. 19";
        Factura factura = new Factura();
        factura.comprar(new Producto("Pan", 1, 3));
        factura.comprar(new Producto("Fideos", 5, 2));
        factura.comprar(new Producto("Bolsa de leche", 6, 1));
        //Act
        String actual = factura.getDetalleConCantidad();
        //Assert
        assertEquals(expected, actual);
    }

}
