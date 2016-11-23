package simpletxtprocessor.processingalgorithms;

import java.util.ArrayList;

public interface AbstractTextProcessingAlgorithm {
    public ArrayList<String> processText(ArrayList<String> lines);
    public String getDescription();
}
