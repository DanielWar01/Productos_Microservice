package uptc.edu.co.api.Productos_Microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProductosMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductosMicroserviceApplication.class, args);
	}

}
