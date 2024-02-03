
# # Endpoint'ler
# 1. Müşteri İşlemleri
   AddCustomer
   HTTP Metodu: POST
   Açıklama: Yeni bir müşteri ekler.
   Parametreler:

   String customer_name

   String customer_surname

   String customer_email

   String customer_password
# 2. Ürün İşlemleri
# GetProduct

HTTP Metodu: GET
Açıklama: Belirli bir ürünün detaylarını getirir.
Parametreler:

Path Variable

product_id

# CreateProduct


HTTP Metodu: POST
Açıklama: Yeni bir ürün oluşturur.
Parametreler:

String product_code

String product_name

String product_desc

int product_stock

double product_price

# UpdateProduct

HTTP Metodu: PUT
Açıklama: Belirli bir ürünün bilgilerini günceller.
Parametreler:

Path Variable: productId

# DeleteProduct

HTTP Metodu: DELETE
Açıklama: Belirli bir ürünü siler.
Parametreler:

Path Variable: productId
# 3. Alışveriş Sepeti İşlemleri
#   GetCart

HTTP Metodu: GET
Açıklama: Belirli bir alışveriş sepetinin detaylarını getirir.
Parametreler:

Path Variable: cartId

# UpdateCart

HTTP Metodu: PUT
Açıklama: Belirli bir alışveriş sepetinin içeriğini günceller.
Parametreler:

Path Variable: cartId

# EmptyCart

HTTP Metodu: DELETE
Açıklama: Belirli bir alışveriş sepetini boşaltır.
Parametreler:

Path Variable: cartId

# 4. Sipariş İşlemleri
#   PlaceOrder

HTTP Metodu: POST
Açıklama: Yeni bir sipariş oluşturur.
Parametreler:

int amount

double total_price

String status

# GetOrderForCode

HTTP Metodu: GET
Açıklama: Belirli bir siparişin detaylarını getirir.
Parametreler:

Path Variable: orderId

# GetAllOrdersForCustomer

HTTP Metodu: GET
Açıklama: Belirli bir müşteriye ait tüm siparişleri getirir.

Parametreler:

Path Variable: customerId

# 5. Alışveriş Sepeti Ürün İşlemleri
 #  AddProductToCart

HTTP Metodu: POST
Açıklama: Belirli bir kullanıcının alışveriş sepetine ürün ekler.
Parametreler:

RequestParam: int userId

RequestParam: int product_id

# RemoveProductFromCart

HTTP Metodu: POST
Açıklama: Belirli bir kullanıcının alışveriş sepetinden ürünü kaldırır.

Parametreler:

int productId

int cartId