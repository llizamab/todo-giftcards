#!/bin/sh

# compilo el backend
mvn clean install

# compilo la imagen
docker build -t giftcards-frontend ./giftcards-frontend

# levanto el compose
docker-compose -d up
