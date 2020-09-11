#  FROM gradle:jdk11 as builder

#  COPY --chown=gradle:gradle . /home/gradle/src
#  WORKDIR /home/gradle/src
#  RUN gradle build

#  FROM openjdk:11-jre-slim
#  EXPOSE 8080
# COPY --from=builder /Users/macbookpro/Dev/bmg/vault/repos/bmg-cloud-vault-backend/build/libs /app/
#  #COPY --from=builder  /Dev/bmg/vault/repos/ Dev/bmg/vault/repos/bmg-cloud-vault-backend

#  COPY --from=builder /Users/macbookpro/Dev/bmg/vault/repos/bmg-cloud-vault-backend/build/libsvault-0.0.1-SNAPSHOT.war /app/
# WORKDIR /app
#  RUN jar -xvf vault-0.0.1-SNAPSHOT.war

FROM openjdk:11 AS TEMP_BUILD_IMAGE
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY build.gradle settings.gradle gradlew $APP_HOME
 COPY gradle $APP_HOME/gradle
#  RUN ./gradlew build || return 0 
COPY . .
RUN ./gradlew clean build
FROM openjdk:11
ENV ARTIFACT_NAME=vault-0.0.1-SNAPSHOT.war
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY --from=TEMP_BUILD_IMAGE $APP_HOME/build/libs/$ARTIFACT_NAME .
EXPOSE 6060
CMD ["java","-jar",$ARTIFACT_NAME]



