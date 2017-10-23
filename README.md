# Building app
    mvn clean install
    Reference - https://github.com/spotify/dockerfile-maven

# Running the app
   ## run jar 
    java -jar target/spring-boot-embedded-tomcat-0.0.1-SNAPSHOT.jar
   
   ## run in docker
    docker run --name spring-boot-embedded-tomcat -it -d --rm -p=38080:38080 com-san/spring-boot-embedded-tomcat:0.0.1-SNAPSHOT  
    or 
    docker-compose -f 'docker-compose.yml' up -d

# Health check via actuator end-point
```code
curl -sk http://localhost:38080/internal/health | python -m json.tool
{
    "diskSpace": {
        "free": 189735989248,
        "status": "UP",
        "threshold": 10485760,
        "total": 499055067136
    },
    "status": "UP"
}
```

# API
## Request #1
    curl -sk http://localhost:38080/hello -H "Content-Type: application/json"
    hello there
    

## Request #2
```code
curl -sk http://localhost:38080/samplepost -H "Content-Type: application/json" -X POST -d "{\"greeting\": \"Hello\", \"name\": \"Cowie\"}" | python -m json.tool
{
   "sampleRequest": {
       "greeting": "Hello",
       "name": "Cowie"
   },
   "time": "2016/12/07 10:15:57"
}
```
