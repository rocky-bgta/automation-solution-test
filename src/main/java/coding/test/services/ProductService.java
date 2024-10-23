package coding.test.services;

import coding.test.entity.Product;
import coding.test.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public Long deleteProduct(Integer productId) {
        long count = 0;
        productRepository.deleteById(productId);
        count = productRepository.count();
        return count;
    }

}
