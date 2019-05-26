FROM ubuntu:cosmic as builder
ARG DEBIAN_FRONTEND=noninteractive

RUN apt-get update -q \
 && apt-get upgrade -q -y \
 && apt-get install -q -y binutils openjdk-11-jdk-headless

COPY ./src /src
COPY ./gradle /gradle
COPY ./gradlew /gradlew
COPY ./settings.gradle /settings.gradle
COPY ./build.gradle /build.gradle

RUN apt-get update && apt-get install -y dos2unix
RUN dos2unix gradlew && apt-get --purge remove -y dos2unix && rm -rf /var/lib/apt/lists/
RUN chmod a+x gradlew

RUN ./gradlew jlink && strip -p --strip-unneeded /build/image/lib/server/libjvm.so

#------------------------------------------------------------------------

FROM panga/alpine:3.8-glibc2.27

COPY --from=builder /build/image /hello

EXPOSE 8080

CMD [ "/hello/bin/hello" ]
