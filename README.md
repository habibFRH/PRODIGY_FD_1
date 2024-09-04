# User Authentication System

This project implements a robust user authentication system with secure login and registration functionality. Built using modern technologies, the system ensures that only authenticated users can access protected routes.

## Features

- **User Registration & Login:** Users can create accounts and log in securely.
- **Protected Routes:** Certain routes and features are restricted to authenticated users only.
- **Password Security:** Passwords are hashed and stored securely using industry-standard mechanisms.
- **Session Management:** Maintains user sessions across multiple requests to keep users logged in.

## Technology Stack

- **Backend:**
  - [Spring Boot](https://spring.io/projects/spring-boot)
  - [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
  - [Spring Security](https://spring.io/projects/spring-security)
  - [Lombok](https://projectlombok.org/)
  - [MySQL](https://www.mysql.com/)
  
- **Frontend:**
  - [React.js](https://reactjs.org/)
  - [Tailwind CSS](https://tailwindcss.com/)

## Getting Started

### Prerequisites

- Java 11 or higher
- Node.js and npm
- MySQL server

### Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/habibFRH/PRODIGY_FD_1.git
    cd your-repo-name
    ```

2. **Backend Setup:**

    - Navigate to the backend directory:
      ```bash
      cd backend
      ```

    - Update the `application.properties` file with your MySQL database credentials.

    - Build the project:
      ```bash
      ./mvnw clean install
      ```

    - Run the application:
      ```bash
      ./mvnw spring-boot:run
      ```

3. **Frontend Setup:**

    - Navigate to the frontend directory:
      ```bash
      cd frontend
      ```

    - Install dependencies:
      ```bash
      npm install
      ```

    - Start the development server:
      ```bash
      npm start
      ```

4. **Access the application:**
    - Open your browser and go to `http://localhost:3000`.

## Usage

- **Sign Up:** Create a new account by providing the required details.
- **Log In:** Use your credentials to log in securely.
- **Access Protected Routes:** Once logged in, you can access routes that require authentication.

## Contributing

Contributions are welcome! Please fork this repository, make your changes, and submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Acknowledgments

- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
- [React.js Documentation](https://reactjs.org/docs/getting-started.html)
- [Tailwind CSS Documentation](https://tailwindcss.com/docs)

