package uptc.edu.co.api.Productos_Microservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uptc.edu.co.api.Productos_Microservice.Model.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
