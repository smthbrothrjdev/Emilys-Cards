Start the postgres container: docker compose up -d
This reads the docker-compose.yml file in the project root.
This postgres container is exposed on port 8432.
To enter the postgres CLI: docker exec -it emilys-cards psql postgres://postgres:postgres@localhost:5432/
