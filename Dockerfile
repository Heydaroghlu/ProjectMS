# 1. Java 11 image seçirik
FROM openjdk:11-jdk-slim
RUN apk add --no-cache-openjdk11
# 2. Tətbiqin işləəcəyi qovluğu müəyyən edirik
WORKDIR /app

# 3. Tətbiqin JAR faylını konteynerə kopyalayırıq
COPY build/libs/ProjectMS-0.0.1-SNAPSHOT.jar /app.jar

# 4. Java tətbiqini işə salırıq
ENTRYPOINT ["java", "-jar", "/projectms.jar"]
