# Student Management API

This is a simple Spring Boot application that manages student data using a PostgreSQL database. The application provides a REST API for CRUD operations on student entities.

## 📂 Project Structure
```
learning-spring-boot/
│── demo/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com.example.demo/
│   │   │   │   ├── student/
│   │   │   │   │   ├── Student.java
│   │   │   │   │   ├── StudentConfig.java
│   │   │   │   │   ├── StudentController.java
│   │   │   │   │   ├── StudentRepository.java
│   │   │   │   │   ├── StudentService.java
│   │   │   │   ├── DemoApplication.java
│   │   │   ├── resources/
│   │   │   │   ├── application.properties
│   │   ├── test/java/com.example.demo/
│   │   │   ├── DemoApplicationTests.java
│── pom.xml
│── README.md
```

## 🚀 Getting Started

### 1️⃣ Prerequisites
Make sure you have installed:
- **Java 21**
- **Maven**
- **Docker** (for running PostgreSQL)

### 2️⃣ Clone the Repository
```bash
git clone https://github.com/your-username/your-repo.git
cd your-repo/demo
```

### 3️⃣ Run PostgreSQL in Docker
To start a PostgreSQL container, use:
```bash
docker run --name student-db1 -p 5432:5432 -d \
  -e POSTGRES_PASSWORD=postgres \
  -e POSTGRES_USER=postgres \
  -e POSTGRES_DB=student postgres
```

### 4️⃣ Configure Database Connection
Modify `src/main/resources/application.properties` if needed:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/student
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.format_sql=true
server.error.include-message=always
```

### 5️⃣ Build and Run the Application
Run the following command:
```bash
mvn spring-boot:run
```

### 6️⃣ API Endpoints
| Method | Endpoint | Description |
|--------|---------|------------|
| GET | `/api/students` | Get all students |
| POST | `/api/students` | Add a new student |
| PUT | `/api/students/{id}?name=NewName&email=new@email.com` | Update student details |
| DELETE | `/api/students/{id}` | Delete a student |

### 7️⃣ Example JSON for POST request
```json
{
  "name": "John Doe",
  "email": "john.doe@example.com",
  "birthday": "2000-05-15"
}
```

## 🛠 Technologies Used
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Docker**
- **Maven**

## 📜 License
This project is open-source and available under the [MIT License](LICENSE).
```

👉 **Replace `your-username/your-repo.git`** with the actual GitHub repository URL before using. 🚀
