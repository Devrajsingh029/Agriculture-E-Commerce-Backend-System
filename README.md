# 🌾 Agriculture E-Commerce Backend

A complete e-commerce backend REST API for agricultural products — built with
Spring Boot, Spring Data JPA, Hibernate, MySQL, and JWT Authentication.

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java |
| Framework | Spring Boot |
| ORM | Spring Data JPA + Hibernate |
| Database | MySQL |
| Security | JWT Authentication |

---

## ✨ Features

- ✅ REST APIs for product listings, user registration, and order processing
- ✅ Full CRUD operations across 3 core modules — Products, Users, Orders
- ✅ Normalized MySQL schema with 4 related tables and foreign key constraints
- ✅ JWT Authentication securing all endpoints against unauthorized access
- ✅ Clean 4-module architecture for separation of concerns

---

## 🗂️ Modules

| Module | Responsibility |
|---|---|
| Products | Product listing, details, and management |
| Users | User registration and profile handling |
| Orders | Order creation and processing |
| Security | JWT auth and endpoint protection |

---

## 🗃️ Database Schema

- 4 related tables with **foreign key constraints**
- Normalized schema design to avoid data redundancy
- All database interactions handled via **Spring Data JPA and Hibernate**

---

## ⚙️ How to Run Locally

```bash
# Clone the repo
git clone https://github.com/Devrajsingh029/agri-ecommerce-backend

# Configure DB in application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/agridb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

# Run
mvn spring-boot:run
```

---

## 👤 Author
**Devraj Singh** — [LinkedIn](https://linkedin.com/in/devraj-singh01) |
[GitHub](https://github.com/Devrajsingh029)
