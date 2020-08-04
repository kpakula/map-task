import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TextManipulationFacadeTest {
    private static final String[] EXPECTED = { "ala", "ma", "kota", "kot", "koduje", "w", "javie", "kota"};


    @Test
    public void testProcessTextIsValid() {
        String initial = "Ala ma kota, kot koduje w Javie kota";
        String[] actual = TextManipulationFacade.processText(initial);
        Assertions.assertArrayEquals(EXPECTED, actual);
    }

    @Test
    public void testProcessTextIsNotValid() {
        String initial = "Ala ma kota, kot koduje w Javie kota filemona";
        String[] actual = TextManipulationFacade.processText(initial);
        Assertions.assertFalse(Arrays.equals(EXPECTED, actual));
    }

    @Test
    public void testProcessTextIsEqualElementLength() {
        String initial = "Ala ma kota, kot";
        String[] actual = TextManipulationFacade.processText(initial);

        Assertions.assertEquals(4, actual.length);
    }

    @Test
    public void testProcessTextIsNotEqualElementLength() {
        String initial = "Ala ma kota";
        String[] actual = TextManipulationFacade.processText(initial);

        Assertions.assertNotEquals(4, actual.length);
    }

}
