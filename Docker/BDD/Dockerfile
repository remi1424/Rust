FROM mysql:latest 
ENV MYSQL_ROOT_PASSWORD=root \
    MYSQL_DATABASE=my_database \
    MYSQL_USER=user \
    MYSQL_PASSWORD=user
COPY database_script.sql /docker-entrypoint-initdb.d/
COPY script.sql /docker-entrypoint-initdb.d/
EXPOSE 3306
