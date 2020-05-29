# Source code analyzer

A project reading a file from a given location and calculating its metrics(LOC,NOM,NOC).

## Getting Started

These instructions will get you the source code analyzer up and running. We suppose that you have everything you need already from the main README file.

## Deployment

We assume that you already followed the steps shown in the corresponding section of the main README file. You now have to follow the bellow steps:
1. Enter in the folder gradeshistogram/target with: ```cd sourcecodeanalyzer/target```.
2. Run the program by entering in the command line: ```java –jar “jar-with-dependencies” arg0 arg1 arg2 arg3 arg4```, where arg0=  “JavaSourceCodeInputFile” (e.g., src/test/resources/TestClass.java) ,arg1 = “sourceCodeAnalyzerType” [regex|strcomp] ,arg2 = “SourceCodeLocationType” [local|web] ,arg3 = “OutputFilePath” (e.g.,../output_metrics_file) ,arg4 =“OutputFileType” [csv|json] .For example: ```java -jar sourcecodeanalyzer-0.0.1-SNAPSHOT-jar-with-dependencies.jar ../src/test/resources/TestClass.java regex local output_metrics_file csv```.

The program will now run and create a file with the name you gave in the path you also gave.

#UML Diagram

<img src="seip2020_practical_assignments/sourcecodeanalyzer/UML Diagram.png" alt="UML_Diagram"/>

##Design patterns

There were some design patterns used in this module and are show in the UML Diagram above.
First of all the Factory on the Strategy pattern. It was used in all types(FileExporters,SourceCodeAnalyzers,SourceFileReaders). The idea for all 3 types were pretty much the same and it was that this would make all 3 types more easily extendible.

Benefits: As far as it goes for the FileExporters it was used in order for the method to be more suitable for the file exporter that was given by the user. We didn't want in every single method to have if-else cases because if a new type FileExporter was going to be introduced we had to add to every single method the new if case. So we provided a common inteface for all types of file exporters. Now if we want to add a new type of File Exporter we just need to just create a new class that implements this interface and ovverides the anstract method of the interface. The same goes for the other two types. It was not easily extendible before since we had to add a new if case to the methods used by these types.

Tradeoffs: More classes are used now in order to serve those patterns, meaning that the code is more complex. Now it is far more maintanable but no so easily understandable, since a lot of classes communicate with each other(Factory with the Concrete Objects) and it is kind of tricky.

Roles:
* Factory: MetricsExporterFactory, AnalyzerTypeFactory, SourceFileReaderFactory
* Strategy(interface): MetricsExporter, AnalyzerType, SourceFileReader
* Concrete Objects: CsvExporter,JsonExporter and NullExporter(MetricsExporter), Regex,Strcomp and NullAnalyzer(AnalyzerType), Web, Local and NullFileReader(SourceFileReader)


Moreover the Facade design pattern was used in order to mask complex code and serve as a front-facing interface.

Benefits: The client will now be provided simplified access to the functionality of the module. Subsystem independence and portability are also promoted by the Facade pattern through the de-coupling the subsystem for the clients and other subsystem. Thus, the system can be used as an independent library because it hides any implementation details from the DemoClient.

Tradeoffs: One more class to the system without providing any functionality. It is just used as an interface.

Roles:
* Facade class implements the Facade pattern
* Every class that is covered in orenge in the UML diagram can be used as a library

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Author

* **Dimitra Karadima** [Github profile](https://github.com/dimitra-karadima)

## License

This project is licensed under the MIT License - see the [LICENSE](https://github.com/dimitra-karadima/SEiP2020_Assignments/blob/master/LICENSE) file for details
