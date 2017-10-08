FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/tablemountainhema.jar /tablemountainhema/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/tablemountainhema/app.jar"]
