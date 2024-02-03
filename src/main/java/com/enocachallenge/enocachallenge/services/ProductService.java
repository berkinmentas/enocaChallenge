package com.enocachallenge.enocachallenge.services;

import com.enocachallenge.enocachallenge.entities.Product;
import com.enocachallenge.enocachallenge.repos.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getOneProduct(int productId) {
        return productRepository.findById(productId).orElse(null);
    }

    public Product createNewProduct(Product newProduct) {
//        Optional<Product> thisProduct = productRepository.findByProduct_code(newProduct.getProduct_code());
//        if (thisProduct.isEmpty()) {
            return productRepository.save(newProduct);
//        } else {
//            return null;
//        }
    }

    public Product updateProduct(int product_id,Product productData) {
        Optional<Product> product = productRepository.findById(product_id);
        if(product.isPresent()){
            Product foundProduct = product.get();
            foundProduct.setProduct_code(productData.getProduct_code());
            foundProduct.setProduct_name(productData.getProduct_name());
            foundProduct.setProduct_desc(productData.getProduct_desc());
            foundProduct.setProduct_price(productData.getProduct_price());
            foundProduct.setProduct_stock(productData.getProduct_stock());
            productRepository.save(foundProduct);
            return foundProduct;
        }
            return null;


    }
    public void  deleteProduct(int productId) {
        productRepository.deleteById(productId);
    }
}

