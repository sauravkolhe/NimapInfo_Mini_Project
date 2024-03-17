#NimapInfo_Mini_Project

This repository contains code snippets that illustrate the structure and functionality of a Spring Boot application for managing products and categories. Here's a brief overview of the provided information:

**ProductCategoryApplication.java:**

Main class of the Spring Boot application. Specifies the package name and imports necessary Spring Boot classes. Annotated with @SpringBootApplication, indicating the main entry point and enabling auto-configuration. Contains the main method where application execution starts. Uses SpringApplication.run() to start the application.

**CategoryController.java:**

Handles category-related HTTP requests. Annotated with @RestController and @RequestMapping. Uses @Autowired to inject CategoryService dependency. Defines methods for CRUD operations on categories, mapping to HTTP endpoints.

**ProductController.java:**

Handles product-related HTTP requests. Similar to CategoryController, defines methods for CRUD operations on products.

**CategoryEntity.java and ProductEntity.java:**

Represent entities in the application, annotated with @Entity. Define fields for entity attributes and specify primary keys with @Id and @GeneratedValue. Establish a one-to-many relationship between categories and products.

**CategoryService.java and ProductService.java:**

Service interfaces for managing categories and products. Declare methods for CRUD operations and other functionalities.

**CatrgoryServiceImpl.java and ProductServiceImpl.java:**

Implement service interfaces, providing implementations for declared methods. Utilize repository classes (CatrgoryRepo and ProductRepo) to interact with the database.

**CatrgoryRepo.java and ProductRepo.java:**

Repository interfaces extending JpaRepository. Provide CRUD functionalities for categories and products. This repository serves as a practical example for understanding how to build a Spring Boot application with RESTful APIs for managing products and categories.
