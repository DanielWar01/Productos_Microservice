package uptc.edu.co.api.Productos_Microservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uptc.edu.co.api.Productos_Microservice.Model.Product;
import uptc.edu.co.api.Productos_Microservice.Service.ProductsService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @GetMapping
    public ResponseEntity<List<Product>> GetProducts() {
        return ResponseEntity.ok(productsService.getProducts());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> DeleteProducts(@PathVariable Integer id) {
        return ResponseEntity.ok(productsService.DeleteProducts(id));
    }

    @PostMapping
    public ResponseEntity<?> PostProducts(@RequestBody Product product){
        return ResponseEntity.ok(productsService.PostProducts(product));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> PutProducts(@RequestBody Product product, @PathVariable Integer id) {
        return ResponseEntity.ok(productsService.PutProducts(product, id));
    }
}
