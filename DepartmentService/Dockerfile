FROM openjdk:8-jre-alpine
MAINTAINER Charantej Thota(charantej.career@gmail.com)
CMD ["mkdir","-p","app/department"]
CMD ["cd","app/department"]
COPY target/DepartmentService-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar","DepartmentService-0.0.1-SNAPSHOT.jar"]
EXPOSE 8093
