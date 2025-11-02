hn369 categories implementation (JPA adapter)

Files provided under src/main/java/com/hn369/ecommerce/product/...

To integrate into your existing project:
1. Copy the java files into your project's src/main/java folder preserving package paths.
2. Add Spring Data JPA dependency if not present:
   <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-data-jpa</artifactId>
   </dependency>
3. Ensure you have the categories table created (Liquibase changelog provided under src/main/resources/db/changelog).
4. Restart application. Endpoint will be available at: GET /api/v1/categories
