Ollama AI Spring Boot Integration
This project demonstrates how to integrate Spring AI with Ollama to run Large Language Models (LLMs) like Llama 3 locally. It provides a simple REST API to interact with the model.

🚀 Getting Started
Follow these steps to get the project up and running on your local machine.

Prerequisites
Java 17 or higher: Ensure you have JDK 17+ installed.

Maven: For dependency management.

1.Ollama:

2.Download and install Ollama from ollama.com.

3.Once installed, pull the Llama 3 model by running:
   Bash
    ollama run llama3

🛠️ Installation & Setup
Clone the repository:
 Bash
   git clone https://github.com/your-username/Ollama-Ai-Model-Integration.git
   cd Ollama-Ai-Model-Integration

Configure Environment:
The application is configured to connect to Ollama at http://localhost:11434. Ensure Ollama is running in the background. If your Ollama port differs, update src/main/resources/application.properties:


Properties
spring.ai.ollama.base-url=http://localhost:11434
spring.ai.ollama.chat.model=llama3

Build the project:
mvn clean install

Run the application:
mvn spring-boot:run


API Usage
The application exposes a single GET endpoint that accepts a prompt as a path variable.

Endpoint: GET /api/{prompt}

Example Request:
GET http://localhost:8080/api/Explain quantum physics in one sentence


Example Response:
"Quantum physics is the study of matter and energy at the most fundamental level, where particles behave in ways that defy classical logic, such as being in two places at once."


🏗️ Project Structure
AIController.java: A REST controller that uses ChatModel to process prompts.

pom.xml: Includes the spring-ai-bom and the spring-ai-starter-model-ollama dependency.

application.properties: Defines the AI model (Llama 3) and connection settings.


🧩 Technologies UsedTechnologyPurposeSpring Boot 4.0.3Application FrameworkSpring AIAI Model OrchestrationOllamaLocal LLM RuntimeLlama 3The Language ModelMavenBuild & Dependency Management
