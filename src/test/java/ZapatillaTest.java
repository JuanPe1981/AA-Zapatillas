import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class ZapatillaTest {

    @Test
    public void ZapatillaNombreTest() {
        Zapatilla zapatilla = new Zapatilla("Nike", "Rojo", 44, 49.99);
        String nombre  = zapatilla.getNombre();
        assertEquals("Nike", nombre);
        assertSame("Nike", nombre);
    }

    @Test
    public void ZapatillaColorTest() {
        Zapatilla zapatilla = new Zapatilla("Nike", "Rojo", 44, 49.99);
        String color  = zapatilla.getColor();
        assertEquals("Rojo", color);
        assertSame("Rojo", color);
    }

    @Test
    public void ZapatillaNumeroTest() {
        Zapatilla zapatilla = new Zapatilla("Nike", "Rojo", 44, 49.99);
        int numero = zapatilla.getNumero();
        assertEquals(44, numero);
        assertSame(44, numero);
    }

    @Test
    public void ZapatillaPrecioTest() {
        Zapatilla zapatilla = new Zapatilla("Nike", "Rojo", 44, 49.99);
        double precio = zapatilla.getPrecio();
        assertEquals(49.99, precio);
    }
}
