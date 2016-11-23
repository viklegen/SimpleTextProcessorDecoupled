package simpletxtprocessor.processingalgorithms;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * Create list of words in text with occurrence frequency.
 */

public class ListWordsWithOccurrenceFrequency implements AbstractTextProcessingAlgorithm {
    public static final String COLUMN_SEPARATOR = "\t\t";

    @Override
    public ArrayList<String> processText(ArrayList<String> lines) {
        TreeMap<String, Integer> wordsMapWithCount = new TreeMap<>();
        for (String line : lines) {
            String[] wordsInLine = line.split(" ");
            for (String word : wordsInLine) {
                if (wordsMapWithCount.containsKey(word))
                    wordsMapWithCount.put(word, wordsMapWithCount.get(word) + 1);
                else
                    wordsMapWithCount.put(word, 1);
            }
        }

        ArrayList<String> wordList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMapWithCount.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            wordList.add(key + COLUMN_SEPARATOR + value);
        }

        return wordList;
    }

    @Override
    public String getDescription() {
        return "Create list of words with occurrence frequency.";
    }
}
