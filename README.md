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
  "person": {
		"id":1
	},
	"branch": {
		"id":1
	},
	"user": {
    "id": 1
  },
	"discount":12.80,
  "itemsSale": [
    {
      "idProduct": 1,
      "amount": 2,
      "price": 5000.00
    },
		 {
      "idProduct": 2,
      "amount": 3,
      "price": 23.90
    },
		{
      "idProduct": 3,
      "amount": 2,
      "price": 500
    }
  ]
}

# Json para address isoladamente
{
  "id": 101,
  "street": "Av. Paulista",
  "city": "São Paulo",
  "state": "SP",
  "zipCode": "01310-100"
}

# Json para criar cities
{
  "name": "Campinas",
  "state": "SP",
  "country": {
    "name": "Brasil",
    "code": "BR"
  }
}

# Json para person
- Obs: `null para create e num do id para update`
- Obs: `o formato da data copiado do banco precisa adicionar o T`
{
	"id":null, 
	"branch": {
		"id":1
	},
	"user": {
    "id": 1
  },
	"createdAt":"2025-06-19T08:37:06.129426",
  "name": "Julio Nascimento",
  "dateOfBirth": "2006-03-02",
  "gender": "MASCULINO",
  "cpf": "12345678903",
	"personAddress":[
	{
		"idAddrees":2
	},
	{
		"idAddrees":2
	},
		{
		"idAddrees":2
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

POST /store/sales - Register of Sales.