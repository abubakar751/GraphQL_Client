package graphqlasclient.service;

import graphqlasclient.dto.Product;

import java.util.List;

public interface InventoryService {
   public List<Product> viewProduct();
   List<Product> getAllProductByCate(String category);

}
