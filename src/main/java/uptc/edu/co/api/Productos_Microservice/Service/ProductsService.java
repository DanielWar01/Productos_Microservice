package uptc.edu.co.api.Productos_Microservice.Service;

import uptc.edu.co.api.Productos_Microservice.Model.Product;

import java.util.List;

public interface ProductsService {

    List<Product> getProducts();

    String DeleteProducts(Integer id);

    String PostProducts(Product product);

    String PutProducts(Product product, Integer id);

}
