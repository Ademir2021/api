# API of Authentication users and WebToken

# API for Sales

   # O que será incluído:
    Entidades: Sale, ItemSale
    DTOs: SaleDTO, ItemSaleDTO
    Controller REST: SaleController
    Service: SaleService
    Repositórios: SaleRepository, ItemSaleRepository
    Banco: Postgres
    Dependências: Spring Web, Spring Data JPA, H2 Database

# Estruturas do projeto 
sales-api/
├── src/
│   └── main/
│       ├── java/com/example/salesapi/
│       │   ├── controller/salecontroller
│       │   │              └── SaleController.java
│       │   ├── dto/saleDTO
│       │   │       ├── SaleDTO.java
│       │   │       └── ItemSaleDTO.java
│       │   ├── entity/sale
│       │   │          ├── Sale.java
│       │   │          └── ItemSale.java
│       │   ├── repository/sale
│       │   │              ├── SaleRepository.java
│       │   │              └── ItemSaleRepository.java
│       │   └── service/sale
│       │               └── SaleService.java
│       └── resources/
│           └── application.properties
└── pom.xml

# Json para testes de sales
{
  "idPerson": 2,
	"idBranch":1,
	"idUser":1,
	"discount":2.50,
  "itemsSale": [
    {
      "idProduct": 1,
      "amount": 2,
      "price": 23.50
    },
		 {
      "idProduct": 2,
      "amount": 3,
      "price": 15.90
    },
		{
      "idProduct": 4,
      "amount": 3,
      "price": 165
    }
  ]
}

## Json para teste de Item
{
	"id":2,
	"createdAt":"2025-06-17T14:03:22.874630103",
  "name": "Notebook Lenovo Tela15 16RAM SSD512 CoreI5 12Ger",
  "priceMax": 5000.00,
  "priceMin": 4800.00,
  "brand": {
    "id": 1,
		"name":""
  },
  "sector": {
    "id": 1,
		"name":""
  },
  "barCode": "1234567890123",
  "imagem": "http://exemplo.com/imagem.jpg"
}



## API Endpoints
The API provides the following endpoints:

```markdown
GET /hello - Welcome for test of user authenticated (all authenticated users)

POST /product - Register a new product (ADMIN access required).

POST /auth/login - Login into the App

POST /auth/register - Register new users for next acess.

POST /store/sales - Register of Sales.