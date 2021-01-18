# Intercom-Take home test Assessment

We have some customer records in a text file (customers.txt) -- one customer per line, JSON lines formatted. We want to invite any customer within 100km of our Dublin office for some food and drinks on us. Write a program that will read the full list of customers and output the names and user ids of matching customers (within 100km), sorted by User ID (ascending).

* You must use the first formula from this Wikipedia article to calculate distance. Don't forget, you'll need to convert degrees to radians.
* The GPS coordinates for our Dublin office are 53.339428, -6.257664.
* You can find the Customer list here .

# Prerequisite 
The project requires the following in order to run the project
* java version 1.8 and higher(Ref for installation :https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html)

* Apache Maven 3.6.3 and higher (Ref for installation :https://maven.apache.org/install.html)

# Application Features
* Calculating geographic distance and finding the customer nearby the Intercom office Using Great Circle Distance Formula
(https://en.wikipedia.org/wiki/Great-circle_distance).
* Generating invitation list in an output text file.

# Code Run Guide
###STEP 1] Check weather Java and Maven have been setup sucessfully using following commands.
```
java -version
```
```
mvn -version
```
###STEP 2] Use git commands or as .zip, to download the application and extract the project.
Git Guide: - https://documentation.alphasoftware.com/documentation/pages/HowTo/Other/Download%20GitHub%20Project.xml

###STEP 3] Once application is setup in local repository, navigate to its root folder using terminal (containing "pom.xml" file) and run the following command:
```
mvn clean install
```

```
....

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.intercom.test.CustomerPOJOTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.137 sec
Running com.intercom.test.InvitationListCreatorTest
2
[user_id=2, name=Christina, user_id=4, name=Olive]
Invalid Geographic Coordinates
Universally Accepted Standards
Latitude Between <-90,90> and Longitude Between <-180,180>
Given Input:-
Latitude:- -95.30000305175781 Longitude-8.112000465393066


Invalid Geographic Coordinates
Universally Accepted Standards
Latitude Between <-90,90> and Longitude Between <-180,180>
Given Input:-
Latitude:- 53.0 Longitude-270.0


List of customers in range:
[user_id=4, name=Ian Kehoe, user_id=5, name=Nora Dempsey, user_id=6, name=Theresa Enright, user_id=8, name=Eoin Ahearn, user_id=11, name=Richard Finnegan, user_id=12, name=Christina McArdle, user_id=13, name=Olive Ahearn, user_id=15, name=Michael Ahearn, user_id=17, name=Patricia Cahill, user_id=23, name=Eoin Gallagher, user_id=24, name=Rose Enright, user_id=26, name=Stephen McArdle, user_id=29, name=Oliver Ahearn, user_id=30, name=Nick Enright, user_id=31, name=Alan Behan, user_id=39, name=Lisa Ahearn]
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.831 sec
Running com.intercom.test.ReuseableUtilitiesTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.147 sec

Results :

Tests run: 7, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- jacoco-maven-plugin:0.8.3:report (post-unit-test) @ IntercomeAssessement ---
[INFO] Loading execution data file D:\Resume\Full Time\Full Stack Developer\Temp\Intercom\Intercom_Assessement\target\jacoco.exec
[INFO] Analyzed bundle 'IntercomeAssessement' with 4 classes
[INFO]
[INFO] --- maven-dependency-plugin:2.8:copy-dependencies (copy-dependencies) @ IntercomeAssessement ---
[INFO] Copying jackson-databind-2.12.1.jar to D:\Resume\Full Time\Full Stack Developer\Temp\Intercom\Intercom_Assessement\target\libs\jackson-databind-2.12.1.jar
[INFO] Copying junit-4.11.jar to D:\Resume\Full Time\Full Stack Developer\Temp\Intercom\Intercom_Assessement\target\libs\junit-4.11.jar
[INFO] Copying jackson-annotations-2.12.1.jar to D:\Resume\Full Time\Full Stack Developer\Temp\Intercom\Intercom_Assessement\target\libs\jackson-annotations-2.12.1.jar
[INFO] Copying junit-platform-engine-1.4.0.jar to D:\Resume\Full Time\Full Stack Developer\Temp\Intercom\Intercom_Assessement\target\libs\junit-platform-engine-1.4.0.jar
[INFO] Copying opentest4j-1.1.1.jar to D:\Resume\Full Time\Full Stack Developer\Temp\Intercom\Intercom_Assessement\target\libs\opentest4j-1.1.1.jar
[INFO] Copying junit-jupiter-engine-5.4.0.jar to D:\Resume\Full Time\Full Stack Developer\Temp\Intercom\Intercom_Assessement\target\libs\junit-jupiter-engine-5.4.0.jar
[INFO] Copying hamcrest-core-1.3.jar to D:\Resume\Full Time\Full Stack Developer\Temp\Intercom\Intercom_Assessement\target\libs\hamcrest-core-1.3.jar
[INFO] Copying junit-jupiter-api-5.4.0.jar to D:\Resume\Full Time\Full Stack Developer\Temp\Intercom\Intercom_Assessement\target\libs\junit-jupiter-api-5.4.0.jar
[INFO] Copying junit-platform-commons-1.4.0.jar to D:\Resume\Full Time\Full Stack Developer\Temp\Intercom\Intercom_Assessement\target\libs\junit-platform-commons-1.4.0.jar
[INFO] Copying jackson-core-2.12.1.jar to D:\Resume\Full Time\Full Stack Developer\Temp\Intercom\Intercom_Assessement\target\libs\jackson-core-2.12.1.jar
[INFO] Copying apiguardian-api-1.0.0.jar to D:\Resume\Full Time\Full Stack Developer\Temp\Intercom\Intercom_Assessement\target\libs\apiguardian-api-1.0.0.jar
[INFO]
[INFO] --- jacoco-maven-plugin:0.8.3:report (report) @ IntercomeAssessement ---
[INFO] Loading execution data file D:\Resume\Full Time\Full Stack Developer\Temp\Intercom\Intercom_Assessement\target\jacoco.exec
[INFO] Analyzed bundle 'IntercomeAssessement' with 4 classes
[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ IntercomeAssessement ---
[INFO] Building jar: D:\Resume\Full Time\Full Stack Developer\Temp\Intercom\Intercom_Assessement\target\IntercomeAssessement-1.0.jar
[INFO]
[INFO] --- maven-install-plugin:2.4:install (default-install) @ IntercomeAssessement ---
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.5/plexus-utils-3.0.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.5/plexus-utils-3.0.5.pom (2.5 kB at 20 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.1/plexus-3.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.1/plexus-3.1.pom (19 kB at 162 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-digest/1.0/plexus-digest-1.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-digest/1.0/plexus-digest-1.0.pom (1.1 kB at 8.8 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.7/plexus-components-1.1.7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.7/plexus-components-1.1.7.pom (5.0 kB at 41 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-8/plexus-container-default-1.0-alpha-8.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-8/plexus-container-default-1.0-alpha-8.pom (7.3 kB at 57 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.5/plexus-utils-3.0.5.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-digest/1.0/plexus-digest-1.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-digest/1.0/plexus-digest-1.0.jar (12 kB at 45 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.5/plexus-utils-3.0.5.jar (230 kB at 646 kB/s)
[INFO] Installing D:\Resume\Full Time\Full Stack Developer\Temp\Intercom\Intercom_Assessement\target\IntercomeAssessement-1.0.jar to C:\Users\bejoy\.m2\repository\com\intercome\IntercomeAssessement\1.0\IntercomeAssessement-1.0.jar
[INFO] Installing D:\Resume\Full Time\Full Stack Developer\Temp\Intercom\Intercom_Assessement\pom.xml to C:\Users\bejoy\.m2\repository\com\intercome\IntercomeAssessement\1.0\IntercomeAssessement-1.0.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  19.135 s
[INFO] Finished at: 2021-01-18T02:50:35Z
[INFO] ------------------------------------------------------------------------
```
 Using this command Maven will automatically download the required dependencies, and build an executable jar file in the same root location.
 
 ###STEP 3] Use command line to navigate to the new target folder and execute the project using following command.
 ```
java -jar target/intercomest.jar
```
# Author
BEJOY JOSE
