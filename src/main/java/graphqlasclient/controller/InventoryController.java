package graphqlasclient.controller;

import graphqlasclient.dto.Product;
import graphqlasclient.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/getAllProduct")
    public List<Product> viewProducts() {
        return inventoryService.viewProduct();

    }
    @GetMapping("/getAllProductByCategory/{category}")
    public List<Product> getAllProductByCate(@PathVariable String category){
 return inventoryService.getAllProductByCate(category);
    }
}
