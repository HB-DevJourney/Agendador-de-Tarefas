FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY build/libs/gerenciador-tarefas-0.0.1-SNAPSHOT.jar /app/gerenciador-tarefas.jar

EXPOSE 8081

CMD ["java", "-jar", "/app/gerenciador-tarefas.jar"]