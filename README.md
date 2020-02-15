# Telco PoC
## Account service

A renowned telco asked our team to develop a way to retrieve all the customers details based on three input data: account id, customer id & phone number. The solution we proposed was to do three microservices to retrieve the data from a view that they created from the database do that we can consume mock customer information.
This service purpose is to return the customer information when the input is a given account service number (accountId).
There are 2 other services that returns the same information but based on different input, i. e. phone number or customer personal id (DNI).

The technology stack for the backend tier of the application was Spring Boot 2, Java 8, Hibernate ORM and Keycloack integration for Single Sign-On.
Due to some restrictions we had to ask for the Oracle Database connector to be uploaded into their private artifactory so that we can run the application.

Given that the view was not normalized we had the challenge of mapping the database without duplicating data in objects.

