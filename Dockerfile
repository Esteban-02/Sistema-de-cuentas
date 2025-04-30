# Imagen base de Java 21
FROM openjdk:21

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el jar compilado
COPY target/*.jar app.jar

# Exponer el puerto de Spring Boot (por defecto)
EXPOSE 8080

# Comando para correr la app
ENTRYPOINT ["java", "-jar", "app.jar"]
