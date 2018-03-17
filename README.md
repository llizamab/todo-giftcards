Todo-Giftcards
===================

Proyecto full-stack de desarrollo de sitio web para gestion de venta de giftcards. Implementación del front-end con boostrap 4 y Angular 5. Implementación del back-end con microservicios rest con SpringBoot y base de datos PostgreSql.

Gestión de compilación con Maven y Java 1.8. Despliegue y ambiente de desarrollo con contenedores Docker.

> **Proyectos:**
> 
> - giftcard-bbdd
> - giftcard-services
> - ~~giftcard-view:~~ *(Proyecto PHP deprecated)*
> - giftcards-frontend

> **Tecnologías:**
> 
> - Maven 3
> - Java 1.8
> - Spring boot
> - Typescript
> - Boostrap 4
> - Angular 5
> - Docker

===================
# Levantar proyecto en modo desarrollo
- Ejecutar en la raiz
  > ./launch.sh
- Acceder a [http:localhost:80]

===================
## giftcard-bbdd

- Limpiar bbdd
	> mvn flyway:clean

- Cargar bbdd
  > mvn flyway:migrate
  
===================
## giftcard-services

- Limpiar y compilar
	> mvn clean install

- Levantar servicios rest
  > mvn spring-boot:run

===================
## giftcards-frontend

- Instalar dependencias
	> npm install

- Compilar aplicación
  > npm build

- Levantar aplicación
  > npm serve --open
  
===================
## Comandos docker

- Generar imagen del contenedor front-end
  > docker build -f "./giftcards-frontend/DockerfileDev" -t giftcards-frontend ./giftcards-frontend
  
- Levantar el stack de contenedores
  > docker-compose up

