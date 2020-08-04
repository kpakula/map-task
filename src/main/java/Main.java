import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        AlphabeticalOrderMap alphabeticalMap = new AlphabeticalOrderMap();
        String[] processedText = TextManipulationFacade.processText(text);

        alphabeticalMap.addWordsToMap(processedText);
        System.out.println(alphabeticalMap);
    }
}
