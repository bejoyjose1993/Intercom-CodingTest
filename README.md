# Intercom-Take home test Assessment

We have some customer records in a text file (customers.txt) -- one customer per line, JSON lines formatted. We want to invite any customer within 100km of our Dublin office for some food and drinks on us. Write a program that will read the full list of customers and output the names and user ids of matching customers (within 100km), sorted by User ID (ascending).

* You must use the first formula from this Wikipedia article to calculate distance. Don't forget, you'll need to convert degrees to radians.
* The GPS coordinates for our Dublin office are 53.339428, -6.257664.
* You can find the Customer list here .

# Pre-requisite
The project requires the following in order to run the project
* java version 1.8 and higher(Ref for installation :https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html)

* Apache Maven 3.6.3 and higher (Ref for installation :https://maven.apache.org/install.html)

# Application Features
* Calculating gegographical distance and finding the customer nearby the Intercom office Using Great Circle Distance Formula
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
###STEP 1] Check weather Java and Maven have been setup sucessfully using following commands.

# Author
BEJOY JOSE
