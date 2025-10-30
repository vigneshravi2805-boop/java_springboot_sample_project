
---

## 🧠 Features

- REST API built with **Spring Boot**
- Simple **User** model with in-memory data
- **Endpoints**:
  - `GET /api/users` — List all users
  - `POST /api/users` — Add a new user
  - `GET /api/users/hello` — Returns “Hello from Spring Boot Backend!”
  - `GET /api/users/vignesh` — Returns “he is a good boy”
- **Dockerized** for easy deployment

---

## ⚙️ How to Run Locally

### Prerequisites
- Java 17+
- Maven 3+
- Docker (optional, for containerized run)

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/spring-boot-sample.git
   cd spring-boot-sample

Build and run the application:

mvn clean install
mvn spring-boot:run


Access the API:

http://localhost:8080/api/users/hello

Run with Docker

Build the Docker image:

docker build -t spring-boot-sample .


Run the container:

docker run -p 8080:8080 spring-boot-sample


Test in browser or Postman:

http://localhost:8080/api/users

http://localhost:8080/api/users/hello


Example Request
POST /api/users
curl -X POST http://localhost:8080/api/users \
-H "Content-Type: application/json" \
-d '{"name": "Vignesh", "email": "vignesh@example.com"}'


Response:

"User added successfully!"

