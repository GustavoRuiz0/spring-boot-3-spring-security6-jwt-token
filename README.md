# Spring Boot 3, Spring Security 6, and JWT Token Authentication

![Java](https://img.shields.io/badge/Java-8%2B-orange) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-blue) ![Spring Security](https://img.shields.io/badge/Spring%20Security-6-green) [![LinkedIn](https://img.shields.io/badge/Connect%20on-LinkedIn-blue)](https://www.linkedin.com/in/gustavo-ruiz-810a851b5/)
![GPL License](https://img.shields.io/badge/License-GPL-blue)

Welcome to the **Spring Boot 3, Spring Security 6, and JWT Token Authentication** project. This project demonstrates how to integrate Spring Boot, Spring Security, and JWT (JSON Web Token) for secure user authentication and authorization.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Contributing](#contributing)
- [Contact](#contact)

## Introduction

The **Spring Boot 3, Spring Security 6, and JWT Token Authentication** project provides a practical example of user authentication and authorization using Spring Boot and JWT. It showcases how to implement a secure authentication system with role-based access control.

## Features

- User registration and login with JWT-based authentication.
- Role-based authorization for controlling user access to different parts of the application.
- Secure password hashing and salting using industry best practices.
- Integration with PostgreSQL database for storing user information.

## Technologies Used

- ![Java](https://img.shields.io/badge/Java-8%2B-orange): Programming language for building the application.
- ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-blue): Framework for creating production-ready Spring applications.
- ![Spring Security](https://img.shields.io/badge/Spring%20Security-6-green): Framework for securing Spring applications.
- ![JWT](https://img.shields.io/badge/JWT-JSON%20Web%20Token-yellow): Token-based authentication using JSON Web Tokens.
- ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue): Database for storing user-related data.

## Getting Started

Follow these steps to set up and run the project on your local machine:

1. Clone the repository: `git clone https://github.com/GustavoRuiz0/spring-boot-3-spring-security6-jwt-token.git`
2. Navigate to the project directory: `cd spring-boot-3-spring-security6-jwt-token`
3. Update the database configuration in `application.properties` file.
4. Build the project: `./mvnw clean install` (or equivalent for Windows: `mvnw.cmd clean install`)
5. Run the application: `./mvnw spring-boot:run` (or equivalent for Windows: `mvnw.cmd spring-boot:run`)

## Configuration

- Database Configuration: Update the `application.properties` file with your PostgreSQL database credentials.

## Usage

1. Register a new user using the `POST /auth/register` endpoint.
2. Obtain a JWT by logging in using the `POST /auth/login` endpoint.
3. Include the JWT in the headers of protected endpoints for authorized access.

## Endpoints

- `POST /auth/register`: Register a new user.
- `POST /auth/login`: Obtain a JWT by logging in.
- More endpoints for specific resources can be added as per your application's requirements.

## Contributing

Contributions are welcome! If you'd like to contribute, please fork the repository and create a pull request.

## Contact

Connect with the project author on [LinkedIn](https://www.linkedin.com/in/gustavo-ruiz-810a851b5/) for any questions or suggestions.

---

**License:** This project is licensed under the terms of the [GNU General Public License (GPL)](LICENSE).
