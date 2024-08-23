**Notification Service**
##
Overview
The Notification Service is a backend service designed to manage notification templates, criteria, and to process notifications for patients based on defined criteria. This service integrates with the Patient Service to receive updates and manage notifications.

**Tech Stack**
##
Java: Programming language used for the service.
Spring Boot: Framework used for creating RESTful APIs.
Maven: Build tool used for dependency management and project configuration.
PostgreSQL/MySQL: RDBMS used for storing notification templates and target criteria.
Queue Mechanism: For receiving patient updates from the Patient Service.
Features
Notification Templates: Defines templates with criteria such as gender and age.
Database Design: Stores notification templates and target criteria.
Criteria Evaluation: Evaluates new patient records to determine if they match any notification criteria.
Send Notifications (Nice to Have): Designed to integrate with notification systems for sending messages.

**API Endpoints**
##
Create Template: POST /api/v1/templates
Get Templates: GET /api/v1/templates
Create Criterion: POST /api/v1/criteria
Evaluate Patient: POST /api/v1/patients/evaluate
Send Notification: POST /api/v1/notifications
##
**Queue Mechanism**
Purpose: To receive patient updates from the Patient Service and process notifications based on defined criteria.
Integration: Listens for messages from the queue and processes them accordingly.
Setup and Installation
Clone the Repository: git clone <repository-url>
Navigate to the Project Directory: cd notification-service
Install Dependencies: mvn install
Run the Application: mvn spring-boot:run
**Documentation**
Swagger: API documentation is available at /swagger-ui.html.
