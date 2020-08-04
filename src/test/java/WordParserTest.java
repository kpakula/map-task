import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordParserTest {
    private static final String EXPECTED = "a b c d e f g";

    @Test
    public void testReplaceDotsInString() {
        String initial = "a. b. c. d. e. f. g.";
        String replaced = WordParser.replaceAllNonAlphanumericalChars(initial);

        Assertions.assertEquals(EXPECTED, replaced);
    }

    @Test
    public void testReplaceCommaInString() {
        String initial = "a, b, c, d, e, f, g,";
        String replaced = WordParser.replaceAllNonAlphanumericalChars(initial);

        Assertions.assertEquals(EXPECTED, replaced);
    }

    @Test
    public void testReplaceAsteriskInString() {
        String initial = "a* b* c d* e* f* g*";
        String replaced = WordParser.replaceAllNonAlphanumericalChars(initial);

        Assertions.assertEquals(EXPECTED, replaced);
    }

    @Test
    public void testDoNotReplaceInString() {
        String initial = "a b c d e f g";
        String replaced = WordParser.replaceAllNonAlphanumericalChars(initial);

        Assertions.assertEquals(EXPECTED, replaced);
    }
}
