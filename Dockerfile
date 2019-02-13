FROM java:8
EXPOSE 8080
VOLUME /tmp
ADD target/spring-boot-boilerplate-1.0.0.jar spring-boot-boilerplate.jar
RUN bash -c 'touch /spring-boot-boilerplate.jar'
ENTRYPOINT ["java","-jar","spring-boot-boilerplate.jar"]