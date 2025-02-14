# 1. Java 11 image seçirik
FROM openjdk:11-jdk-slim

# 2. Tətbiqin işləəcəyi qovluğu müəyyən edirik
WORKDIR /app

# 3. Tətbiqin JAR faylını konteynerə kopyalayırıq
COPY build/libs/${project.name}.jar /app/app.jar

# 4. Java tətbiqini işə salırıq
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
