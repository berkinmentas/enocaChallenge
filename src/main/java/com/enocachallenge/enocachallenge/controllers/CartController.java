package com.enocachallenge.enocachallenge.controllers;

import com.enocachallenge.enocachallenge.entities.Cart;
import com.enocachallenge.enocachallenge.services.CartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.json.JSONObject;



//GetCart
//UpdateCart
//EmptyCart
@RestController
@RequestMapping("/carts")
public class CartController {
    CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @PostMapping
    public Cart createCart(@RequestBody String userId) {
        JSONObject jsonObject = new JSONObject(userId);
        String user = jsonObject.getString("userId");
        int usr = Integer.parseInt(user);
        return cartService.createNewCart(usr);
    }
    @PutMapping()
    public Cart updateNewCart(@RequestParam int cartId){
        return cartService.updateNewCart(cartId);
    }
    @DeleteMapping("{cart_id}")
    public ResponseEntity<String> deleteCart(@PathVariable("cart_id") int cartId){
        cartService.deleteAllCart(cartId);
        return ResponseEntity.ok("Cart deleted successfully!.");
    }
    @PostMapping("/add-product")
        public Cart addProductToCart(@RequestParam int userId,@RequestParam int product_id){
        return cartService.addProductToCart(userId, product_id);
    }
    @PostMapping()
        public ResponseEntity<String> deleteProductToCart( int productId, int cartId){
            cartService.deleteProductToCart(cartId,productId);
        return ResponseEntity.ok("Product deleted to cart successfully!.");
    }
}
