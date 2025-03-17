# Address Book App

## Description
The Address Book App is a Spring Boot-based application that allows users to manage contacts efficiently. It provides features such as adding, updating, deleting, and retrieving contacts with a structured backend.

## Tech Stack
- **Backend:** Spring Boot (Java)
- **Database:** MySQL (configured via application properties)
- **Build Tool:** Maven
- **Authentication:** JWT (JSON Web Tokens)

## Installation & Setup
1. Clone the repository:
   ```sh
   git clone https://github.com/Aditya1424/address-book-app.git
   ```
2. Navigate to the project directory:
   ```sh
   cd address-book-app
   ```
3. Configure the database in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```
4. Build the project using Maven:
   ```sh
   mvn clean install
   ```
5. Run the application:
   ```sh
   mvn spring-boot:run
   ```

## API Endpoints
### Authentication
- `POST /auth/register` - Register a new user
- `POST /auth/login` - Login and receive a JWT

### Contacts
- `GET /contacts` - Retrieve all contacts
- `GET /contacts/{id}` - Retrieve a specific contact
- `POST /contacts` - Add a new contact
- `PUT /contacts/{id}` - Update a contact
- `DELETE /contacts/{id}` - Delete a contact

## License
This project is licensed under the MIT License.

---
### Contributors
- [Aditya Gupta](https://github.com/Aditya1424)


