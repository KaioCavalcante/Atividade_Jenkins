import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTest {

    Conversor conversor = new Conversor();

    @Test
    public void testeFahrenheitParaCelsius() {
        double resultado = conversor.fahrenheitParaCelsius(212);
        assertEquals(100, resultado);
    }

    @Test
    public void testeCelsiusParaFahrenheit() {
        double resultado = conversor.celsiusParaFahrenheit(100);
        assertEquals(212, resultado);
    }
}