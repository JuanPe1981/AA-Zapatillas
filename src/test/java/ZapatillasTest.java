import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class ZapatillasTest {

    @Test
    public void testZapatilla() {
        Zapatilla zapatilla = new Zapatilla("Adidas","blanca", 42, 22.99f);
        Zapatilla result = new Zapatilla("Adidas","blanca", 42, 22.99f);
        Assert.assertEquals(zapatilla,result);
    }
}
