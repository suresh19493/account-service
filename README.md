#Account Service

## Installation

1. Download project and unzip
2. Goto inside the project directory and run the following command
   ```mvn install```
3. Currently, The project connects to postgreSQL, If you want change to MySQL then 
	```
	 a. Uncomment mysql properties in application.properties 
	 b. Comment postgresql properties in application.properties
	 c. Comment postgresql dependency in pom.xml
	 d. Uncomment mysql dependency in pom.xml
	 ```

5. Connect to database and Run the SQL scripts inside the project based on the database you choose(MySQL, PostgreSQL).

## Start Server
6. To start the server using the command ```mvn spring-boot:run```

## Consume endpoints

7. Open browser and type the below url
    a. Get all accounts endpoint
    ```[http://localhost:8080/account/all](http://localhost:8080/account/all)```
    b.Get Transactions by account number
    ```http://localhost:8080/account/transactions/{accountNumber}
    example: http://localhost:8080/account/transactions/795809719```
