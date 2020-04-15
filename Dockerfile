FROM adoptopenjdk:openj9 as builder

WORKDIR /app

COPY first/target/first-1.0-SNAPSHOT.jar .
COPY second/target/second-1.0-SNAPSHOT.jar .

RUN jlink --strip-java-debug-attributes \
            --compress 2 \
            --no-header-files \
            --no-man-pages \
            --output min-jdk \
            --add-modules second \ 
            --launcher run=second/com.rafabene.second.App \ 
            --module-path . 

FROM panga/alpine:3.7-glibc2.25

WORKDIR /app

COPY --from=builder /app/min-jdk/ /app/min-jdk/

ENTRYPOINT ["/app/min-jdk/bin/run"]