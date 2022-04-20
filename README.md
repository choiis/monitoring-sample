# Monitoring sample

## Prometheus + Promtail + Loki + Grafana logs and metrics example

### Execution

* First, Build sample spring jar file

```bash
mvn clean package docker:build
```

* Run prometheus, promtail, loki, grafana, spring docker containers

```bash
docker-compose up
```

### Spring actuator
* You can check metric data of spring application at http://localhost:6070/actuator/prometheus

### Promtail
* promtail is reading spring application logs and push it to loki

### Loki
* loki is collecting logs from promtail and helps grafana visualize 
* You can check the loki operation at http://localhost:3100/metrics

### prometheus
* You can add monitoring targets on prometheus.yml file
* I added spring application metric path on prometheus.yml
* You can use prometheus ui at http://localhost:9090/
* You can see monitoring targets at http://localhost:9090/targets/

### grafana
* You can use grafana ui at http://localhost:3000/
* Enter account and password admin
* When the grafana container starts up, it creates a prometheus datasource by reading datasources1.yml datasources2.yml.


### Utilize and observe the grafana dashboard UI
* If you enter job name of spring application, You can see spring logs
![Grafana Logs](http://imageresizer-dev-serverlessdeploymentbucket-xapz1q6q9exe.s3-website-ap-northeast-1.amazonaws.com/gitpng/grafana_loki_logs.png)

* You can see spring application metric data and graphs
![Grafana Metrics](http://imageresizer-dev-serverlessdeploymentbucket-xapz1q6q9exe.s3-website-ap-northeast-1.amazonaws.com/gitpng/grafana_prometheus_metrics.png)
