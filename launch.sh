#!/bin/sh

# compilo el backend
mvn clean install

# compilo la imagen
docker build -f "./giftcards-frontend/DockerfileDev" -t giftcards-frontend ./giftcards-frontend

# levanto el compose
docker-compose -d up

# ejecuto la carga de la bbdd
./giftcards-bbdd/mvn flyway:clean flyway:migrate

# levanto el backend
./giftcards-services/mvn spring-boot:run

