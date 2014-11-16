#!/bin/bash

echo "******CREATING DOCKER DATABASE******"
gosu postgres postgres --single <<- EOSQL
   CREATE DATABASE mydb;
   CREATE USER myuser;
   GRANT ALL PRIVILEGES ON DATABASE mydb to myuser;
EOSQL
echo ""
echo "******DOCKER DATABASE CREATED******"
