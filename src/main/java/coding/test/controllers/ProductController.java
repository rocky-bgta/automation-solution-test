package coding.test.controllers;


import coding.test.entity.Product;
import coding.test.models.UserModel;
import coding.test.services.LoginService;
import coding.test.services.ProductService;
import coding.test.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("product")
public class ProductController {


    @Autowired
    ProductService productService;


    @GetMapping("/get-all")
    public List<Product> getAllProducts() {
        return productService.findAll();
    }

    @PostMapping("/create-product")
    public Product saveProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/update-product")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }


    @DeleteMapping("delete-product/{productid}")
    public Long deleteProduct(@PathVariable("productid") Integer productId) {
        return productService.deleteProduct(productId);
    }
}
