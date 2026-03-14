# Service Queue System

Service Queue System is a backend application designed to manage vehicle queues in service centers.
The system allows administrators and workers to manage service queues efficiently.

## Features

* Create and manage users (Admin / Worker roles)
* Register vehicles entering the service queue
* Automatically assign queue numbers
* Track service status (Waiting, In Progress, Completed)
* Manage service boxes and queue flow

## Technologies

* Java
* Spring Boot
* Liquibase
* PostgreSQL
* Gradle

## Project Structure

```
src
 ├── controller
 ├── service
 ├── dao
 │   └── entity
 ├── model
 │   └── enums
 └── config
```

## Database Migration

Database schema is managed using Liquibase migrations located in:

```
src/main/resources/liquibase
```

## How It Works

1. A customer enters their vehicle number through the system.
2. The backend registers the vehicle and assigns a queue number.
3. Workers manage the queue from the admin panel.
4. Vehicles are called in order and processed by available service boxes.

## Future Improvements

* Authentication system
* Monitor screen for queue display
* Notification system
* REST API documentation

## Author

Riyad Rahimov
