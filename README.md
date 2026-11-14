# Spring Data / jOOQ / Liquibase / MySQL (legacy learning demo)

This is the **original learning example** of Spring Boot 2.4.4, jOOQ and Liquibase with a `model` table. For active improvements and integration testing, see [Liquibase-Jooq-Spring-Boot](https://github.com/kakarot987/Liquibase-Jooq-Spring-Boot).

## Environment

Uses JDK 11, Gradle wrapper, and an existing MySQL 8 database named `world`. Set `DB_URL` (optional; defaults to localhost), `DB_USER` (defaults to `app`), and **required** `DB_PASSWORD` in your environment. No DB credentials are committed. Supply a database schema and permissions before starting.

```sh
export DB_URL='jdbc:mysql://localhost:3306/world?useSSL=false&allowPublicKeyRetrieval=true'
export DB_USER=app
export DB_PASSWORD='your-local-only-password'
./gradlew bootRun
```

On startup, Liquibase applies the original changeSets. Generated jOOQ entities are checked into `src/generated-db-entities/java`, so compilation does not need a generator connection.

To regenerate jOOQ entities, first apply Liquibase migrations to the configured database, then run `./gradlew generateJooq`. The code generator reads the same `DB_URL`, `DB_USER`, and `DB_PASSWORD` environment variables.

API: `GET /getModels` lists rows; `POST /addModel` creates one (201 success, 400 missing required data, 409 DB constraint conflict). This demo has **no authenticated write endpoint**; do not expose it publicly.

This repository is retained for historical learning purposes rather than maintained as a production template.
