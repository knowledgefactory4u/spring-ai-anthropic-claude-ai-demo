# Spring AI Anthropic Claude AI Demo

This is a Spring Boot application that demonstrates integration with Anthropic Claude AI models using the `spring-ai-anthropic-spring-boot-starter`.

## Features
- Exposes a REST endpoint `/ask-ai` to interact with the Claude AI model.
- Uses Anthropic's API to generate AI-powered responses.
- Easily configurable with `application.properties`.

## Prerequisites
- Java 21
- Maven
- Anthropic API Key

## Project Structure
```
spring-ai-anthropic-claude-ai-demo/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.example.demo.controller/
│   │   │   │   └── AIController.java
│   │   │   ├── com.example.demo.service/
│   │   │   │   └── AIService.java
│   │   ├── resources/
│   │   │   └── application.properties
```

## Configuration
Update `src/main/resources/application.properties` with your Anthropic API details:
```properties
spring.ai.anthropic.api-key=YOUR_API_KEY
spring.ai.anthropic.model=your-chosen-model
```

## Build and Run
1. Build the project:
   ```bash
   mvn clean install
   ```

2. Run the application:
   ```bash
   mvn spring-boot:run
   ```

3. Access the endpoint:
   ```
   GET http://localhost:8080/ask-ai?question=What+is+the+capital+of+France%3F
   ```

## Example Request
### Request
```bash
curl "http://localhost:8080/ask-ai?question=What+is+the+capital+of+France%3F"
```

### Response
```json
{
  "response": "The capital of France is Paris."
}
```

## Dependencies
- Spring Boot 3.4.1
- Spring Web
- `spring-ai-anthropic-spring-boot-starter`

## License
This project is licensed under the MIT License.

---

### Author
**Sibin Muhammed A R**  
[LinkedIn](https://www.linkedin.com/in/sibin-muhammed/) | [GitHub](https://github.com/sibinmuhammed)
