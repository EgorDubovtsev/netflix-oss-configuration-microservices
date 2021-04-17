This project has versions with kafka in 'kafka-version' branch and kubernetes version in 'kubernetes_version' branch.

## Microservice application

### Required:
    Elk: https://github.com/EgorDubovtsev/elk-for-netflix-oss-configuration
    Configuration server: https://github.com/EgorDubovtsev/configuration-config-server
### Run:
    1. Run elk docker-compose file
    2. Run config-server service
    3. Run eureka-server service 
    4. Run 2 instance of workspace-api service (`-Dserver.port=9090` and `-Dserver.port=9091`)
    5. Run 1 instance of employees-api service  on port 9092
    6. Run gateway service on port 9094
### Try to get access 
 ```
    http://localhost:9094/workspaces-service/workspaces/0000001
    http://localhost:9094/employees-service/employees/0000001
```
### Access without gateway

```
http://localhost:9090/workspaces/0000001
http://localhost:9091/workspaces/0000001
http://localhost:9092/employees/0000001
```
