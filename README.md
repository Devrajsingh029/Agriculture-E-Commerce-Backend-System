🌾 Agriculture E-Commerce Backend System
A Spring Boot based RESTful backend application for an agriculture e-commerce platform where farmers can list products and users can browse and place orders.
The system provides APIs for user management, product management, and order processing, with secure authentication and database integration.

🚀 Features

•	User registration and authentication
•	Product management (Add, Update, Delete, View)
•	Order creation and order tracking
•	Secure API endpoints using JWT authentication
•	Relational database design using MySQL
•	API testing using Postman

🛠️ Tech Stack

Backend
•	Java
•	Spring Boot
•	Spring MVC
•	Spring Data JPA
•	Hibernate

Database

•	MySQL

Security

•	JWT Authentication

Tools

•	Maven
•	Git
•	Postman

📦 Project Modules
1️⃣ User Module
Handles:
•	User registration
•	Login authentication
APIs:
•	POST /api/users/register
•	POST /api/users/login

2️⃣ Product Module
Handles:
•	Add product
•	Update product
•	Delete product
•	View product list
APIs:
•	POST /api/products
•	GET /api/products
•	PUT /api/products/{id}
•	DELETE /api/products/{id}
•	
3️⃣ Order Module
Handles:
•	Create order
•	View orders
APIs:
•	POST /api/orders
•	GET /api/orders

🔐 Authentication

JWT-based authentication is implemented to secure API endpoints.

Users must authenticate before accessing protected routes.

▶️ How to Run the Project

1.	Clone the repository
•	git clone https://github.com/yourusername/agriculture-ecommerce-backend.git

2.	Navigate to the project folder
•	cd agriculture-ecommerce-backend

3.	Configure database in application.properties
•	spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
•	spring.datasource.username=root
•	spring.datasource.password=yourpassword

4.	Run the project
•	mvn spring-boot:run


📌 Future Improvements
•	Payment gateway integration
•	Product image upload
•	Order history tracking
•	Admin dashboard APIs

