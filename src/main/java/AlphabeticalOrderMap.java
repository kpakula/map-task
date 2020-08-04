import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class AlphabeticalOrderMap {
    private Map<Character, TreeSet<String>> characterToWords;

    public AlphabeticalOrderMap() {
        this.characterToWords = new HashMap<>();
    }

    public void addWordsToMap(String[] words) {
        for (String word: words) {
            this.addWordToMap(word);
        }
    }

    private void addWordToMap(String word){
        char[] wordCharacters = word.toCharArray();

        for (Character character: wordCharacters) {
            TreeSet<String> setWithWords;

            if(characterToWords.containsKey(character)) {
                setWithWords = characterToWords.get(character);
            } else {
                setWithWords = new TreeSet<>();
            }

            setWithWords.add(word);
            characterToWords.put(character, setWithWords);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Character, TreeSet<String>> set: characterToWords.entrySet()) {
            stringBuilder.append(set.getKey());
            stringBuilder.append(": ");

            Iterator<String> itr = set.getValue().iterator();
            while (itr.hasNext()) {
                stringBuilder.append(itr.next());
                if (itr.hasNext()) {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append("\n");
        }


        return stringBuilder.toString();
    }

    public Map<Character, TreeSet<String>> getCharacterToWords() {
        return characterToWords;
    }

    public void setCharacterToWords(Map<Character, TreeSet<String>> characterToWords) {
        this.characterToWords = characterToWords;
    }

    public int size() {
        return this.characterToWords.size();
    }

    public boolean containsKey(Character key) {
        return this.characterToWords.containsKey(key);
    }

    public int getKeyElementsSize(Character key) {
        if (containsKey(key)) return this.characterToWords.get(key).size();
        else return 0;
    }
}
