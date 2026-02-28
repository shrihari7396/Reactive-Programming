# Reactive Programming Learning

Welcome to my Reactive Programming learning repository! 🚀

This repository is dedicated to exploring and mastering the concepts of **Reactive Programming** within the **Spring Boot** ecosystem. It serves as a practical playground to understand non-blocking, asynchronous application development using Project Reactor.

## 📌 Project Overview

This is a Maven-based Spring Boot project focused on **Spring WebFlux**. It demonstrates fundamental reactive types and how to handle data streams reactively.

### Key Concepts Explored:
- **Project Reactor**: The core library used for building reactive applications.
- **Mono**: Represents a reactive sequence of 0 or 1 item.
- **Flux**: (Upcoming/Explored) Represents a reactive sequence of 0 to N items.
- **Subscribers**: Understanding the `CoreSubscriber` interface, including handling `onSubscribe`, `onNext`, `onError`, and `onComplete` lifecycle events.
- **Non-blocking I/O**: The fundamental shift from traditional thread-per-request blocking models to asynchronous event-loop models.

## 🛠️ Technology Stack
- **Java**: Java 17
- **Spring Boot**: Version 3.5.6
- **Spring WebFlux**: For building reactive web applications (`spring-boot-starter-webflux`).
- **Project Reactor**: Core reactive library (`reactor-test` for testing reactive streams).
- **Lombok**: To reduce boilerplate code.

## 📂 Repository Structure
- `Reactive Programming Learning/src/main/java/springboot/lear/reactiveProgramming/`: Contains the main Spring Boot application.
- `Reactive Programming Learning/src/test/java/springboot/lear/reactiveProgramming/`: Contains JUnit tests that demonstrate the behavior of reactive streams (e.g., creating a `Mono` and attaching a custom `CoreSubscriber`).

## 🚀 How to Run & Test
1. Clone the repository:
   ```bash
   git clone https://github.com/shrihari7396/reactive-Programming.git
   ```
2. Navigate to the project directory:
   ```bash
   cd "reactive-Programming/Reactive Programming Learning"
   ```
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```
4. **Run the Tests**: The best way to see reactive programming in action in this repository is to run the test cases provided in `ReactiveProgrammingLearningApplicationTests.java`.
   ```bash
   mvn test
   ```
   *Watch the console output to see how the `Mono` emits data and how the subscriber reacts!*

---
*Embracing the reactive paradigm for highly scalable and resilient systems! 🌊*
