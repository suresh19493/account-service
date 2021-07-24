Account Service
1. Download project and unzip
2. Goto inside the project directory and run 'mvn install'
3. Currently, The project connects to postgreSQL, If you want change to MySQL then \n
	`a. Uncomment mysql properties in application.properties \n
	 b. Comment postgresql properties in application.properties\n
	 c. Comment postgresql dependency in pom.xml\n
	 d. Uncomment mysql dependency in pom.xml`

5. Connect to database and Run the SQL scripts inside the project based on the database you choose(MySQL, PostgreSQL).
6. Start the server using the command 'mvn spring-boot:run'
7. Consume the endpoints are
    a. Get all accounts endpoint
    'http://localhost:8080/account/all'
    b.Get Transactions by account number
    'http://localhost:8080/account/transactions/{accountNumber}
    'example:' http://localhost:8080/account/transactions/795809719'
