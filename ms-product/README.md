# microservice product
提供商品資料

## 啟動
```bash
mvn spring-boot:run
```
port: 8081

## API
- GET /products?categoryId={categoryId}
  - 依據分類ID來取得商品列表
  - Request
    - Query
      - categoryId: Long
  - Response
    - Body
      - products: Product[]
  - Example
    - Request
      - GET /products?categoryId=1
    - Response
      - Body
        - products: [{id: 1, name: 'Apple', price: 30, description: '', categoryId: 1}, {id: 2, name: 'Banana', price: 10, description: '', categoryId: 2}]