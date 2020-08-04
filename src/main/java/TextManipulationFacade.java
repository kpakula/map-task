public class TextManipulationFacade {

    public static String[] processText(String text){
        String lowerCaseText = WordParser.toLowerCase(text);
        String replacedNonAlphanumerical = WordParser.replaceAllNonAlphanumericalChars(lowerCaseText);
        return WordParser.splitBySpaceChar(replacedNonAlphanumerical);
    }


}
