FROM ubuntu:latest
RUN apt update && apt install -y apache2
COPY ../../codigo/ /var/www/html/
EXPOSE 80
CMD ["apachectl", "-D", "FOREGROUND"]