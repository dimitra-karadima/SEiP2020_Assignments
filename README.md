[![Build Status](https://travis-ci.com/dimitra-karadima/SEiP2020_Assignments.svg?token=qqNB8JtSMr3RMpx7yqHb&branch=master)](https://travis-ci.com/dimitra-karadima/SEiP2020_Assignments)
# SEiP2020_Assignments

All of my practical assignments for SEiP are stored here.

## Getting Started

These instructions will get you a copy of the Maven project up and running in order to create a histogram chart from a grades txt file.
Clone this repository by opening your Git Bash and entering the following command: ```git clone https://github.com/dimitra-karadima/SEiP2020_Assignments.git```

**Note:** If the code is still not merged to the master branch, then you first need to get to the development branch to get the code:
1. Open Git Bash and browse to the repository with: ```cd SEiP2020_Assignments```.
2. Change to the development branch with: ```git checkout development```.

Now you are ready to follow the next steps. If the code is merged just ignore the above steps.

### Prerequisites

If you only want to run the project you just want to download only Git Bash.
But if you want to modify the code you will need to more things, Eclipse IDE and Maven.
Below, you can find the links on how to download and install each program.
1. [Git Bash](https://www.stanleyulili.com/git/how-to-install-git-bash-on-windows/)
2. [Eclipse IDE](https://www.ntu.edu.sg/home/ehchua/programming/howto/EclipseJava_HowTo.html)
3. [Maven](https://mkyong.com/maven/how-to-install-maven-in-windows/)

### Installing

A step by step series of examples that tell you how to get a development env running

1. You need to have the code in your computer. Check the command in the Getting Started section.
2. Open your Eclipse IDE and select in the File area and select Open Projects from File System.
3. In the import source select Directory and browse in your computer to find the path where you saved the code in the first step.
4. Press Finish and you have the code in your Eclipse IDE.

You can now change anything you want in the code, from the java files to the pom.xml files.
With any little change there is a whole different program.

## Dependencies
The dependencies in the Maven project are:
1. The parent named seip2020_practical_assignments.
2. A Maven module named [gradeshistogram](seip2020_practical_assignments/gradeshistogram/README.md).
3. A Maven module named [unittesting](seip2020_practical_assignments/unittesting/README.md).

## Deployment

Now, if you want to run the project here is a step guide for you! We assume that you have already cloned the repository in your computer as shown in the Getting Started section.
1. Open Command Prompt.
2. Navigate where you cloned the repository. There will be a folder named ```SEiP2020_Assignments```.
3. Enter in this folder with: ```cd SEiP2020_Assignments```.
3. Build the Maven project by: ```mvn install``` or ```mvn package```

If you want to create a histogram based on a txt file you store grades, click [here](seip2020_practical_assignments/gradeshistogram/README.md).

If you want to do basic arithmetic operations, click [here](seip2020_practical_assignments/unittesting/README.md). The arithmetic operations return the correct result as they are tested for their functionality.

##Generate Code Coverage

In order to generate a report of the code coverage produced by JaCoCo execute the following Maven command : ```mvn clean package jacoco:report```

The code coverage will be located in ```target/site/jacoco``` for each module of the project.

##Continuous Integration service

This project utilizes the TravisCI services in order to test and build the project every commit pushed to this repository.

The build badge that is placed in the first line of this README is updated in every commit.
It can either be green or red, depending whether the build has passed or failed respectively.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Author

* **Dimitra Karadima** [Github profile](https://github.com/dimitra-karadima)

## License

This project is licensed under the MIT License - see the [LICENSE](https://github.com/dimitra-karadima/SEiP2020_Assignments/blob/master/LICENSE) file for details
