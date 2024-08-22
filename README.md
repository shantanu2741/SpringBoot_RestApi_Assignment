# SpringBoot_RestApi_Assignment


This is a Spring Boot application that provides an API for searching manufacturers based on location, nature of business, and manufacturing processes. The API is built as part of assignment for Makersharks.


## Prerequisites
- Java 17 or later
- Maven 3.6.0
- MySQL database server
- Spring Tool Suite (STS) 
- Postman for API testing

## Getting Started

1. **Clone the Repository**

## Configure the Database

**A MySQL database named makersharks**


- DB configurations in application.properties file with MySQL database credentials:
spring.datasource.url=jdbc:mysql://localhost:3306/makersharks
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update

- I have created Database and Tables for following queries
- create database makersharks;
- use makersharks;
- INSERT INTO suppliers VALUES 
(3,'makersharks enterprizes', 'India', 'MOULDING',  'SMALL_SCALE' ,'http://makersharks_enterprizes-moulding.com' ),
(2,'makersharks consulting', 'India', 'D_PRINTING',  'SMALL_SCALE','http://makersharks_consulting-3dprints.com');


**Build the Application**
Used Spring Tool Suite (STS).

The API will be accessible at http://localhost:8080.
I have tested api using Postman.

**API Request using Postman:**
- Open Postman and create a new POST request.
- Set the URL to http://localhost:8080/api/supplier/query.
- Under the Body tab, select x-www-form-urlencoded and add the following parameters:
- location: e.g., India
- natureOfBusiness: e.g., SMALL_SCALE
- manufacturingProcesses: e.g., D_PRINTING
- page: e.g., 0
- size: e.g., 10
- Click Send to make the request.


Description: Retrieves a list of manufacturers based on location, nature of business, and manufacturing processes.
Request Parameters:
- location (String): The location of the manufacturer (e.g., India).
- natureOfBusiness (String): The nature of the business (e.g., SMALL_SCALE).
- manufacturingProcesses (String): The manufacturing process (e.g., D_PRINTING).
- page (int): The page number (default is 0).
- size (int): The number of records per page (default is 10).
- Response: Returns a paginated list of manufacturers matching the given criteria.
![image](https://github.com/user-attachments/assets/061d88ea-c65d-49f8-affc-0410c2b22133)

So I have successfuly created Rest API  Using SpringBoot and tested using Postman.
