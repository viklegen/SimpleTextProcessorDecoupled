package simpletxtprocessor.processingalgorithms;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Sort the lines of a text alphabetically
 */
public class SortTextLinesAscendingAlgorithm implements AbstractTextProcessingAlgorithm {

    @Override
    public ArrayList<String> processText(ArrayList<String> lines) {
        Collections.sort(lines);
        return lines;
    }

    @Override
    public String getDescription() {
        return "Sort the lines of a text alphabetically.";
    }
}
