package simpletxtprocessor;

import simpletxtprocessor.algorithmfactory.TextProcessingAlgorithmFactory;
import simpletxtprocessor.processingalgorithms.AbstractTextProcessingAlgorithm;
import simpletxtprocessor.textprocessor.SimpleTextProcessor;

public class RunSimpleTextProcessor
{
    public static void main(String[] args) {
        String fileFullName = "";
        if (args.length > 0)
            fileFullName = args[0];
        else {
            System.out.println("Please specify file name in command line.");
            return;
        }

        SimpleTextProcessor simpleTextProcessor = new SimpleTextProcessor();
        //get dependency
        AbstractTextProcessingAlgorithm textProcessingAlgorithm = TextProcessingAlgorithmFactory.getInstance().getTextProcessingAlgorithm();
        //inject dependency
        simpleTextProcessor.setTextProcessingAlgorithm(textProcessingAlgorithm);

        System.out.println("Processing file: " + fileFullName);
        System.out.println("Perform: " + simpleTextProcessor.getTextProcessingAlgorithm().getDescription());
        System.out.println("...");
        try {
            String resultFileName = simpleTextProcessor.processText(fileFullName);
            System.out.println("Result file: " + resultFileName);
        }
        catch (Exception ex) {
            System.out.println("ERROR: " + ex.toString());
            ex.printStackTrace();
        }

    }
}
