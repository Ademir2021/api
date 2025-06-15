# API of Authentication users and WebToken


# API for Sales

   # O que será incluído:
    Entidades: Sale, ItemSale
    DTOs: SaleDTO, ItemSaleDTO
    Controller REST: SaleController
    Service: SaleService
    Repositórios: SaleRepository, ItemSaleRepository
    Banco: H2 em memória
    Dependências: Spring Web, Spring Data JPA, H2 Database

# Estruturas do projeto 
sales-api/
├── src/
│   └── main/
│       ├── java/com/example/salesapi/
│       │   ├── controller/
│       │   │   └── SaleController.java
│       │   ├── dto/
│       │   │   ├── SaleDTO.java
│       │   │   └── ItemSaleDTO.java
│       │   ├── model/
│       │   │   ├── Sale.java
│       │   │   └── ItemSale.java
│       │   ├── repository/
│       │   │   ├── SaleRepository.java
│       │   │   └── ItemSaleRepository.java
│       │   └── service/
│       │       └── SaleService.java
│       └── resources/
│           └── application.properties
└── pom.xml

# Json para testes
{
  "issueDate": "2025-06-15",
  "id_client": 1,
  "itemsSale": [
    {
      "idProduct": 1,
      "amount": 2,
      "price": 23.50
    }
  ]
}



## API Endpoints
The API provides the following endpoints:

```markdown
GET /hello - Welcome for test of user authenticated (all authenticated users)

POST /product - Register a new product (ADMIN access required).

POST /auth/login - Login into the App

POST /auth/register - Register new users for next acess.