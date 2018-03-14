# NoSQL - Design

Ce projet est un projet Maven. Il nécessite les dépendances suivantes :
- ``` org.mongodb.morphia ``` : framework de mapping objet-relationnel pour la base MongoDB
- ``` redis.clients ``` : client Java pour Redis (Jedis)

Le package ``` TP3.maven.archetype.quickstart ``` contient les classes représentant les objets (Address, Article, Person) ainsi que les classes pour lancer le projet (AppMongoDB ou AppRedis selon le serveur de base de données que l'on utilise).