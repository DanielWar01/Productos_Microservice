package uptc.edu.co.api.Productos_Microservice.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uptc.edu.co.api.Productos_Microservice.Model.Product;
import uptc.edu.co.api.Productos_Microservice.Repository.ProductsRepository;
import uptc.edu.co.api.Productos_Microservice.Service.ProductsService;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public List<Product> getProducts() {
        return productsRepository.findAll();
    }

    @Override
    public String DeleteProducts(Integer id) {
        productsRepository.deleteById(id);
        return "Producto eliminado exitosamente!";
    }

    @Override
    public String PostProducts(Product product) {
        productsRepository.save(product);
        return "Producto guardado exitosamente!";
    }

    @Override
    public String PutProducts(Product product, Integer id) {
        Product product1 = productsRepository.findById(id).get();
        if (product != null){
            product1.setName(product.getName());
            product1.setDescription(product.getDescription());
            product1.setPrice(product.getPrice());
        }else{
            return "El producto no se encuentra!";
        }
        return "Producto actualizado correctamente!";
    }
}
