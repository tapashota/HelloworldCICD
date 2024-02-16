# README #

This README would normally document whatever steps are necessary to get your application up and running.

### What is this repository for? ###

* Quick summary
* Version
* [Learn Markdown](https://bitbucket.org/tutorials/markdowndemo)

### How do containerise app in docker? ###

* Create a Dockerfile based on your configuration.
    *   FROM openjdk:8-alpine
        EXPOSE 8080
        ADD target/HelloWorld.jar HelloWorld.jar
        ENTRYPOINT ["java","-jar","/HelloWorld.jar"]

* Build the docker image: docker build -t [tag_name] .
* Run the docker image: docker run -p host_port:container_port image_name
* Dependencies
* Database configuration
* How to run tests
* Deployment instructions


### How to configure MYSQL in Docker ###

* Pull the lates mysql docker image from docker hub: [docker pull mysql]
* Verify the images: docker images
* Run the mysql in docker using: [docker run --name mysql-docker -e MYSQL_ROOT_PASSWORD=Trh@18012013 -p 3306:3306 -d mysql:latest]
* Verify the connection either MYSQL Workbench or docker terminal:
    *  docker exec -it mysql-docker bash
    * mysql -u root -p
    * Enter the password
    * verify the database and table details or verify on MYSQL Workbench tool


### How to deploy docker images in kubernetes###

* Install kubernetes CLI : [brew install kubectl]
* Install kubernetes minikub: [brew install minikube]
* Start Minikube: [minikube start]
* Check 
* Code review
* Other guidelines

### CICD Flow ###

* Install Jenkins for Automation CICD: [brew install jenkins-lts]
* Start Jenkins: [brew services start jenkins-lts]
* To check service status: [brew services]
* Stop Jenkins: [brew services stop jenkins-lts] 
* Start Docker Container
* Start Minikube :[minikube start] | minikube status
* Sync Minikube with Docker: eval $(minikube docker-env)
* Create deployment.yaml file and define docker images details and execute: [kubectl apply -f helloworld-k8s-deployment.yaml]
* Check the deployment object: kubectl get deployments
* Check the pod status: kubectl get pods 
* Other community or team contact