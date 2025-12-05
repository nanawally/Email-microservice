# ===== Stage 1: Build the application =====
FROM gradle:8.7-jdk21 AS builder
WORKDIR /app

# Copy everything and build the JAR
COPY . .
RUN gradle build -x test

# ===== Stage 2: Package the application =====
FROM eclipse-temurin:21-jdk
WORKDIR /app

# Copy the built JAR from the builder stage
COPY --from=builder /app/build/libs/*.jar /app/email.jar

# Expose the port the microservice runs on
EXPOSE 8070

# Run the application
ENTRYPOINT ["java", "-jar", "/app/email.jar"]

