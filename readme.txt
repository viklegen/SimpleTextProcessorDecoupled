# Project Name: SimpleTextProcessorDecoupled

Project description.

SimpleTextProcessorDecoupled reads specified in command line argument text file, performs some text processing 
and write result in file with same name as input file plus "_out" suffix.
Text processing algoritm decoupled from SimpleTextProcessor and injected in runtime as dependency.
To set text processing algorithms dependency for SimpleTextProcessor property file textprocessor.properties is used.
TextProcessingAlgorithmFactory instantiate processing algorithms that wil be injected.

Text processing algoritm must implement AbstractTextProcessingAlgorithm interface.
There are two implementation of AbstractTextProcessingAlgorithm:
- ListWordsWithOccurrenceFrequency  - Create list of words in text file with occurrence frequency;
- SortTextLinesAscendingAlgorithm - Sort the lines of a text alphabetically.
For text processing usedaAlgorithm that specified in textprocessor.properties.
Any new appropriate algorithm can be implemented and used without any changed in SimpleTextProcessor. 


## Installation

Install JDK 1.7 or later.

## Usage
Build project
Specify file name that will be processed as command line argument in runSimpleTextProcessorDecoupled.cmd 
Run runSimpleTextProcessorDecoupled.cmd 



## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request 


## History

Version 1.0 created 2016-11-23

