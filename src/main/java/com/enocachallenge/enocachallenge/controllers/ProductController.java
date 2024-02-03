package com.enocachallenge.enocachallenge.controllers;

import com.enocachallenge.enocachallenge.entities.Product;
import com.enocachallenge.enocachallenge.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//GetProduct
//CreateProduct
//UpdateProduct
//DeleteProduct

@SpringBootApplication
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{product_id}")
    public ResponseEntity<Product> getOneProduct(@PathVariable int product_id){
        return ResponseEntity.ok(productService.getOneProduct(product_id));
    }

    @PostMapping
    public Product createNewProduct(@RequestBody Product newProduct){
        return productService.createNewProduct(newProduct);
    }

    @PutMapping("{product_id}")
    public Product updateProduct(@PathVariable int product_id,@RequestBody Product productData){
        return productService.updateProduct(product_id,productData);
    }

    @DeleteMapping("/{product_id}")
    public void deleteProduct(@PathVariable int product_id){
        productService.deleteProduct(product_id);
    }

    // add product to cart
    // remove product to cart



}
