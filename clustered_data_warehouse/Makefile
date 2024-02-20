DOCKER_COMPOSE := docker-compose
DOCKER_COMPOSE_FILE := src/main/resources/docker-compose.yml
SPRING_APP_NAME := ClusteredDataProject.jar
SPRING_APP_PATH := target/ClusteredDataProject.jar

build:
	docker pull mongo:latest
	docker build -t clustered-data-warehouse-project .

run:
	$(DOCKER_COMPOSE) -f $(DOCKER_COMPOSE_FILE) up

stop:
	$(DOCKER_COMPOSE) -f $(DOCKER_COMPOSE_FILE) down

test:
	mvn test

help:
	@echo "Available commands:"
	@echo "  make build         : To build/install the docker images for the application"
	@echo "  make run           : Run the application using Docker Compose"
	@echo "  make stop          : Stop the running containers"
	@echo "  make test          : Run tests using Maven"
	@echo "  make help          : Display this help message"
