package simpletxtprocessor.textprocessor;

import simpletxtprocessor.io.TxtFileReader;
import simpletxtprocessor.io.TxtFileWriter;
import simpletxtprocessor.processingalgorithms.AbstractTextProcessingAlgorithm;

import java.io.IOException;
import java.util.ArrayList;

public class SimpleTextProcessor {
    private final String RESULT_FILE_SUFFIX = "_out";

    private AbstractTextProcessingAlgorithm textProcessingAlgorithm;

    public void setTextProcessingAlgorithm(AbstractTextProcessingAlgorithm textProcessingAlgorithm)  {
        this.textProcessingAlgorithm = textProcessingAlgorithm;
    }

    public AbstractTextProcessingAlgorithm getTextProcessingAlgorithm() {
        return this.textProcessingAlgorithm;
    }

    public String processText(String fileFullName) throws IOException {
        if (textProcessingAlgorithm == null) {
            throw new RuntimeException(
                    "You must set the property textProcessingAlgorithm of class:"
                            + SimpleTextProcessor.class.getName());
        }
        TxtFileReader txtFileReader = new TxtFileReader();
        ArrayList<String> lines = txtFileReader.read(fileFullName);
        lines = textProcessingAlgorithm.processText(lines);
        TxtFileWriter fileWriter = new TxtFileWriter();
        String resultFileFullName = fileFullName + RESULT_FILE_SUFFIX;
        fileWriter.write(lines, resultFileFullName);
        return resultFileFullName;
    }

}
