#!/bin/bash

cd ../../
mvn clean install
cp target/docker-stack*.war layers/app/app.war
