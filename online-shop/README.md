# Online Shop Backend
線上商店後端API

## 啟動
```bash
mvn spring-boot:run
```
port: 8080

## API
- GET /categories
  - 取得所有分類
  - Response
    - Body
      - categories: Category[]
  - Example
    - Request
      - GET /categories
    - Response
      - Body
        - categories: [{id: 1, name: 'Fruit'}, {id: 2, name: 'Vegetable'}]

- GET /categories/{categoryId}
  - 依據ID取得分類詳細內容
  - Request
    - Path
      - categoryId: Long
  - Response
    - Body
      - category: Category

- GET /categories/{categoryId}/products
  - 依據分類ID來取得商品列表
  - Request
    - Path
      - categoryId: Long
  - Response
    - Body
      - products: Product[]
  - Example
    - Request
      - GET /categories/1/products
    - Response
      - Body
        - products: [{id: 1, name: 'Apple', price: 30, description: '', categoryId: 1}, {id: 2, name: 'Banana', price: 10, description: '', categoryId: 2}]