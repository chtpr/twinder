# Twinder Scalable Distributed Systems App

## Description
A Tinder inspired app developed to to gain experience building a scalable distributed system. The client employs concurrency to send hundreds of thousands of swipes to servers hosted on AWS as fast as possible. These servers act as producers of an event-driven architecture that dispatch these messages to a RabbitMQ queue. These messages are then inserted into an AWS database in batches by consumers decoupled from the producers, thus allowing them to be scaled, updated, and deployed independently. At the same time, the client executes queries to gain data insights such as user match statistics. 

## Architecture
<img width="850" src="https://github.com/chtpr/twinder/assets/85713199/25ba0648-7de0-4275-bf72-40d802e06e7d">

## Results and Benchmarks 
  - [V1](https://docs.google.com/document/d/1UB7qoXpdGMtLOugPBx7to5ycT9yCyUZZxGBHra77IQQ/edit) 
  - [V2](https://docs.google.com/document/d/1zlJFh40zVsUun9HlFS5IfBl1hXXD09OWTIJxbxruAcE/edit) 
  - [V3](https://docs.google.com/document/d/1HzuP0WSmKB8YYLYsuKJ5F50tnv8OecIEczfAEfrh3vM/edit) 
