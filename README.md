# Finance Dashboard Backend

## Description
This project is a backend system for managing financial records with role-based access.

## Features
- User roles (ADMIN, ANALYST, VIEWER)
- Financial records CRUD
- Dashboard summary (income, expense, balance)
- Role-based access control

## Tech Stack
- Spring Boot
- PostgreSQL
- JPA (Hibernate)

## How to Run
1. Configure database in application.properties
2. Run project using:
   mvn spring-boot:run

## APIs

### User
POST /users
GET /users

### Records
POST /records
GET /records
DELETE /records/{id}

### Dashboard
GET /dashboard/summary