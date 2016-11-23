package simpletxtprocessor.processingalgorithms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import simpletxtprocessor.textprocessor.SimpleTextProcessor;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ListWordsWithOccurrenceFrequencyTest {
    private ArrayList<String> textLines = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        textLines.add("First line of text.");
        textLines.add("Second line of text.");
        textLines.add("Next line.");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCalculateWorldsOccurrenceInAlphabetOrder() throws Exception {
        AbstractTextProcessingAlgorithm textProcessingAlgorithm = new ListWordsWithOccurrenceFrequency();
        ArrayList<String> resultList = textProcessingAlgorithm.processText(textLines);
        assertEquals("First" + ListWordsWithOccurrenceFrequency.COLUMN_SEPARATOR + "1", resultList.get(0));
        assertEquals("Next" + ListWordsWithOccurrenceFrequency.COLUMN_SEPARATOR + "1", resultList.get(1));
        assertEquals("line" + ListWordsWithOccurrenceFrequency.COLUMN_SEPARATOR + "2", resultList.get(3));
        assertEquals("line." + ListWordsWithOccurrenceFrequency.COLUMN_SEPARATOR + "1", resultList.get(4));
    }

}