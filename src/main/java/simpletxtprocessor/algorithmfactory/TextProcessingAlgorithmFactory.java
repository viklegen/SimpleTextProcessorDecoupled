package simpletxtprocessor.algorithmfactory;

import simpletxtprocessor.processingalgorithms.AbstractTextProcessingAlgorithm;

import java.util.Properties;

public class TextProcessingAlgorithmFactory {
    private final static String PROPERTY_FILE_NAME = "textprocessor.properties";
    private final static String PROPERTY__ALGORITHM_CLASS_NAME = "algorithm.class";

    private static TextProcessingAlgorithmFactory instance;
    private Properties props;
    private AbstractTextProcessingAlgorithm textProcessingAlgorithm;

    static {
        instance = new TextProcessingAlgorithmFactory();
    }

    public static TextProcessingAlgorithmFactory getInstance() {
        return instance;
    }

    public AbstractTextProcessingAlgorithm getTextProcessingAlgorithm() {
        return textProcessingAlgorithm;
    }

    private TextProcessingAlgorithmFactory() {
        props = new Properties();
        try {
            props.load(TextProcessingAlgorithmFactory.class.getResourceAsStream("../../" + PROPERTY_FILE_NAME));
            String algorithmClass = props.getProperty(PROPERTY__ALGORITHM_CLASS_NAME);
            textProcessingAlgorithm = (AbstractTextProcessingAlgorithm)Class.forName(algorithmClass).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
