Start the postgres container: docker compose up -d
This reads the docker-compose.yml file in the project root.
This postgres container is exposed on port 8432.
To enter the postgres CLI: docker exec -it postgres-game psql postgres://postgres:postgres@localhost:5432/
In the postgres CLI, create the necessary databases:
create database game;
create database game_test;