# Quarkus' reactive application following hexagonal architecture, DDD and synchronous CQRS

This is an example of reactive application following DDD and the Hexagonal Architecture, implementing also
a synchronous CQRS. This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Prerequisites

Start a PostgreSQL database using Docker:

```
$ docker run --ulimit memlock=-1:-1 -it --rm=true --memory-swappiness=0 --name quarkus_test -e POSTGRES_USER=quarkus_test -e POSTGRES_PASSWORD=quarkus_test -e POSTGRES_DB=quarkus_test -p 5432:5432 postgres:10.5
```

Start a Redis Client using Docker:

```
$ docker run --ulimit memlock=-1:-1 -it --rm=true --memory-swappiness=0 --name redis_quarkus_test -p 6379:6379 redis:5.0.6 
```

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-hex-arch-ddd-1.0.0-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application is now runnable using `java -jar target/quarkus-hex-arch-ddd-1.0.0-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/quarkus-hex-arch-ddd-1.0.0-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.html.

# Command Mode

Guide: https://quarkus.io/guides/command-mode-reference
