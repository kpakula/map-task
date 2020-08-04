public class WordParser {

    private static final String SPACE = " ";

    public static String replaceAllNonAlphanumericalChars(String word) {
        return word.replaceAll("[^A-Za-z0-9 ]", "");
    }



    private static String[] splitBy(String word, String sign) {
        return word.split(sign);
    }

    public static String[] splitBySpaceChar(String word) {
        return splitBy(word, SPACE);
    }


    public static String toLowerCase(String word) {
        return word.toLowerCase();
    }
}
