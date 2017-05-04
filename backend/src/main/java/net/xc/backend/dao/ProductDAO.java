package net.xc.backend.dao;

import java.util.List;

import net.xc.backend.dto.Product;

public interface ProductDAO {

Product get(int productId);
List<Product> list();
boolean add(Product product);
boolean update(Product product);
boolean delete(Product product);

//business methods
List<Product> listActiveProduct();
List<Product> listActiveProductsByCategory(int categoryId);
List<Product> getLatestActiveProducts(int Count);
List<Product> listActiveProducts();



}
