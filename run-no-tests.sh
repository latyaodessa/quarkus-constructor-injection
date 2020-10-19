#!/bin/sh
mvn --settings settings.xml -DskipTests -Dmaven.test.skip=true compile quarkus:dev -pl co2-service
