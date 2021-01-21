# DiscountCalculatorSpring

## Prerequisite:
* Eclipse
* Java sdk 11
* Spring framework
  * [Link to Spring](https://repo.spring.io/release/org/springframework/spring/5.3.2/spring-5.3.2-dist.zip)
* common logging 
  * [Link To common Logging](https://downloads.apache.org//commons/logging/binaries/commons-logging-1.2-bin.zip)


## To run:
* Import all the project in eclipse

1. First you need to add the SPRING LIBRARIES to the project. You can download the latest version of Spring binaries from their website - [Link to Spring](https://repo.spring.io/release/org/springframework/spring/5.3.2/spring-5.3.2-dist.zip). After you download the JARs, extract it to a local folder, let the folder name be - 'Spring Framework'.



2. Follow the steps below to add the JARs to the project build path:



- Go to 'Window' -> 'Preferences'
- Go to 'Java' -> 'Build Path' -> 'User Libraries'
- On the 'User Libraries' section that opens, click on 'New' to add new user library.
- Give the user library name - 'Spring'. Click on 'OK'.
- Now, click on the button - 'Add External JARs' from the right panel.
- Browse to the folder - 'Spring Framework', and select all the JAR files in that folder
(it might also be in the lib folder, select all the jar from the lib folder).
- Click on 'Open'. All the JAR files will now get added to the user library.

3. Now, you would need Apache Commons Logging library. Download the latest version from Apache website -[Link To common Logging](https://downloads.apache.org//commons/logging/binaries/commons-logging-1.2-bin.zip). After you download the JARs, extract it to a local folder, let the folder name be - 'Commons Logging'.



4. Follow the steps as in 'Step - 2' above, to create a new user library, and add the JAR files to it.



5. Now, to add the newly created libraries to your project:
- Right-click on the project - 'DiscountCalculatorSpring'.
- Go to 'Build Path' -> 'Configure Build Path'.
- Go to 'Libraries' tab. Click on 'Add Library' button from the right panel.
- Select 'User Library'. Click on 'Next'.
- Select the check box - 'Spring'. Click on 'Finish'. Then click on 'OK'. The user library will get added to your project.



6. Similarly, add the user library to the project - 'DiscountCalculatorSpringClient'.


* run DiscountCalculatorSpringClient

