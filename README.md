# Spring boot + Open Telemetry + Jaeger Demo

## Introduction
測試 spring boot 整合 Open Telemetry + Jaeger

## Commands
1. Docker:
    ```shell
    docker-compose up -d
    ```

2. Java:
  - online-shop
    ```shell
    mvn -f online-shop/pom.xml spring-boot:run
    ```
  - ms-product
    ```shell
    mvn -f ms-product/pom.xml spring-boot:run
    ```

3. 測試:
   - curl
     ```shell
     curl http://localhost:8080/categories
     ```
     ```shell
     curl http://localhost:8080/categories/1
     ```
     ```shell
     curl http://localhost:8080/categories/1/products
     ```
   - Talend: 請匯入 talend/talend-open-telemetry.json

4. 查詢結果:
  - [Jaeger](http://localhost:16686/)
  - [Zipkin](http://localhost:9411/zipkin/)