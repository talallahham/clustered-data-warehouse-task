# Code Documentation for (Clustered Data Warehouse) Project

## Introduction
This document serves as comprehensive documentation for the Clustered Data Warehouse project. The primary goal of this project is to receive payload data from requests, validate the data, and store it into the database. Initially, I designed the project structure and outlined the flow to ensure efficient implementation.

The project utilizes Spring Boot (Maven) for its implementation. Handling and validating the data, particularly the deal details, is a crucial aspect of this project. In Spring Boot, there are various methods available for data validation, including built-in and custom approaches. For this project, I opted to utilize Exceptions for data validation. This choice offers cleaner code and greater control over the project's behavior.

In the Deal Data Transfer Object (DTO), I chose to use the String type. This decision allows for more precise error detection since Spring Boot seamlessly converts any given type into a string without encountering issues. Consequently, the DTO can accommodate any type of data, enhancing error detection capabilities.

## Project Flow
1. **Data Reception**: Deal details are received via HTTPS requests to the "/api/deal/save" endpoint. This endpoint is configured with a POST method to facilitate data submission to the database.

2. **Data Validation**: Upon receiving deal details, the data is validated using the `validateData()` function implemented in the `DealService` class. Data validation is crucial for ensuring the integrity and correctness of the data. If the validation fails, a `RuntimeException` is thrown and appropriately handled in the `DealController` class. In Successful validation case the process proceeds to execute the `saveDeal()` method.

3. **Duplicate Detection**: Before saving the deal data, the system checks for duplicate entries based on the deal ID. If a duplicate entry is detected, a `RuntimeException` is thrown and appropriately handled in the `DealController` class.

4. **Saving Deal Data**: After successful validation and duplicate detection, the deal data is saved into the database. The `DealController` class sends a response with a message indicating successful data storage and returns a 200 status code.

## Logging
Logging plays a crucial role in tracking the flow of data and debugging potential issues within the application. Throughout the project, logging statements are strategically placed to provide insights into the execution path and any encountered errors or exceptions. By leveraging logging effectively throughout the project, it becomes easier to trace the execution flow, identify potential issues, and maintain the overall health of the application.

## Testing
Testing is conducted using JUnit and Mockito to ensure the reliability and correctness of the code. Various test scenarios, including edge cases and normal cases, are implemented to validate the functionality of the application.

## Docker
The project utilizes Docker for containerization. Two Docker images are employed: one for the MongoDB database and another for the Spring Boot application. These images are combined in the `docker-compose.yml` file, providing a convenient deployment solution.

## How to Run the Project


- You can utilize the provided `Makefile` within the project directory. Ensure that the `Makefile` plugins are properly installed in your IDE for seamless integration. And also ensure that maven installed in your system. For the `Makefile` to work properly.
  1. **Build the Application**: Install/Build docker images for the application:
    ```bash
    make build
    ```

  2. **Run the Application**: Start the application using Docker Compose by running:
    ```bash
    make run
    ```

   This command will launch the application in a Docker container, as specified in the `docker-compose.yml` file.

  3. **Stop the Application**: To stop the running containers, use the following command:
    ```bash
    make stop
    ```

  4. **Run Tests**: You can run tests using Maven by executing:
    ```bash
    make test
    ```

  5. **Help Command**: To view available commands and their descriptions, use:
    ```bash
    make help
    ```

These commands provided by the `Makefile` streamline common project operations and simplify the process of building, running, testing, and cleaning the project.



