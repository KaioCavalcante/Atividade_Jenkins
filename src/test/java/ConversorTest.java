import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTest {

    Conversor conversor = new Conversor();

    @Test
    public void testeFahrenheitParaCelsiusEbulicao() {
        assertEquals(100, conversor.fahrenheitParaCelsius(212));
    }

    @Test
    public void testeFahrenheitParaCelsiusCongelamento() {
        assertEquals(0, conversor.fahrenheitParaCelsius(32));
    }

    @Test
    public void testeCelsiusParaFahrenheitEbulicao() {
        assertEquals(212, conversor.celsiusParaFahrenheit(100));
    }

    @Test
    public void testeCelsiusParaFahrenheitCongelamento() {
        assertEquals(32, conversor.celsiusParaFahrenheit(0));
    }
}
