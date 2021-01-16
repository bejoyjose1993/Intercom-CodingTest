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
 Using this command Maven will automatically download the required dependencies, and build an executable jar file in the same root location.
 
 ###STEP 3] Use command line to navigate to the new target folder and execute the project using following command.
 ```
java -jar target/intercomest.jar
```
# Author
BEJOY JOSE
