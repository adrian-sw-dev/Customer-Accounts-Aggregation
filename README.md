# Customer-Accounts-Aggregation

The application need to be imported as a maven project in the IDE.

Java 11 version is used. You cand change that by modify <java.version> tag in the pom.xml file.

The application uses a embedded database (apache derby) to store information.
There are 3 tables in database:  customers, accounts and transactions.

In this project we have an API that contains 4 endpoints.
Postman is a recommended tool for running these endpoints.
Endpoint prefix: http://localhost:8080

- /init endpoint need to be executed first in order to load the database with some default values (POST request)

- /login authenticate a customer in the application with an username in the request body (POST request)
 
 Example:
 {
    "username" : "john"
 }
 
 This endpoint generate a jwt token that can be used later to obtain accounts and transaction for the authenticated user / customer.

- / accounts, /transactions can be executed using the generated jwt token as an Authorization key in the Header of the request (GET requests)
