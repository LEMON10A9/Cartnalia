@echo off
if exist gradle/wrapper/gradle-wrapper.jar (
  java -jar gradle/wrapper/gradle-wrapper.jar %*
) else (
  echo Gradle Wrapper not found!
  exit /b 1
)
