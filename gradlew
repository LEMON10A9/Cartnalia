#!/bin/bash
if [ -f gradle/wrapper/gradle-wrapper.jar ]; then
  java -jar gradle/wrapper/gradle-wrapper.jar "$@"
else
  echo "Gradle Wrapper not found!"
  exit 1
fi
