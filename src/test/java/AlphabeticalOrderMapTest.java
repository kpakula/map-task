import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlphabeticalOrderMapTest {
    private static final String[] INITIAL = { "a", "aa", "ab", "b"};

    @Test
    public void testMapSizeEquals() {
        AlphabeticalOrderMap orderMap = new AlphabeticalOrderMap();
        orderMap.addWordsToMap(INITIAL);

        Assertions.assertEquals(2, orderMap.size());
    }

    @Test
    public void testMapSizeNotEquals() {
        AlphabeticalOrderMap orderMap = new AlphabeticalOrderMap();
        orderMap.addWordsToMap(INITIAL);

        Assertions.assertNotEquals(5, orderMap.size());
    }

    @Test
    public void testMapContainsKey() {
        AlphabeticalOrderMap orderMap = new AlphabeticalOrderMap();
        orderMap.addWordsToMap(INITIAL);

        Assertions.assertTrue(orderMap.containsKey('a'));
    }

    @Test
    public void testMapNotContainsKey() {
        AlphabeticalOrderMap orderMap = new AlphabeticalOrderMap();
        orderMap.addWordsToMap(INITIAL);

        Assertions.assertFalse(orderMap.containsKey('c'));
    }

    @Test
    public void testMapContainsKeyAndHasEqualsNumberOfElements() {
        AlphabeticalOrderMap orderMap = new AlphabeticalOrderMap();
        orderMap.addWordsToMap(INITIAL);

        Assertions.assertEquals(3, orderMap.getKeyElementsSize('a'));
    }

    @Test
    public void testMapContainsKeyAndHasNotEqualsNumberOfElements() {
        AlphabeticalOrderMap orderMap = new AlphabeticalOrderMap();
        orderMap.addWordsToMap(INITIAL);

        Assertions.assertNotEquals(5, orderMap.getKeyElementsSize('b'));
    }

    @Test
    public void testMapNotContainsKeyNumberOfElementsShouldBeZero() {
        AlphabeticalOrderMap orderMap = new AlphabeticalOrderMap();
        orderMap.addWordsToMap(INITIAL);

        Assertions.assertEquals(0, orderMap.getKeyElementsSize('c'));
    }
}
