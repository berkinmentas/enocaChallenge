package com.enocachallenge.enocachallenge.services;

import com.enocachallenge.enocachallenge.dto.CartRequestDto;
import com.enocachallenge.enocachallenge.entities.Cart;
import com.enocachallenge.enocachallenge.entities.Product;
import com.enocachallenge.enocachallenge.repos.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {
    private final CartRepository cartRepository;
    private final ProductService productService;

    private final CustomerService customerService;
    public CartService(CartRepository cartRepository, ProductService productService, CustomerService customerService) {
        this.cartRepository = cartRepository;
        this.productService = productService;
        this.customerService = customerService;
    }
    public Cart createNewCart(int userId) {
        Optional<Cart> cartControl = cartRepository.findByCustomerId(userId);
        if(customerService.findById(userId) == null){
            return null;
        } else if (cartControl.isPresent()) {
            return null;
        }
        Cart cart = new Cart();
        cart.setCustomer(customerService.findById(userId));
        return cartRepository.save(cart);
    }
    public Cart updateNewCart(int cartId){
        CartRequestDto cartRequestDto = new CartRequestDto();
        Optional<Cart> cartControl = cartRepository.findByCustomerId(cartId);
        if(cartControl.isEmpty()){
            Cart cart = createNewCart(cartId);
            cart.addProduct(productService.getOneProduct(Integer.parseInt(cartRequestDto.getProductId())));
            cart.getProducts().forEach(p -> cart.setTotalPrice(cart.getTotalPrice() + p.getProduct_price()));
            return cart;
        }
        return cartControl.orElse(null);
    }

    public void deleteAllCart(int cartId) {

        cartRepository.deleteById(cartId);
    }

    public Cart addProductToCart(int userId,int product_id) {
//        Optional<Cart> cart = cartRepository.findByCustomerId(userId);
        Cart cart = updateNewCart(userId);
        Product product = productService.getOneProduct(product_id);
        cart.addProduct(product);
        return cart;
    }

    public Product deleteProductToCart(int cartId, int productId) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        List<Product> prdcts = cart.getProducts();
        return prdcts.remove(productId);
    }
}
