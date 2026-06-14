package oopmastery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question10_ShoppingCartTest {

    @Test
    void shouldAddSingleProduct() {

        Question10_ShoppingCart cart =
                new Question10_ShoppingCart();

        cart.addProduct(
                new Question10_Product(
                        "Laptop",
                        1000
                )
        );

        assertEquals(
                1000,
                cart.totalPrice()
        );
    }

    @Test
    void shouldCalculateTotalPrice() {

        Question10_ShoppingCart cart =
                new Question10_ShoppingCart();

        cart.addProduct(
                new Question10_Product(
                        "Laptop",
                        1000
                )
        );

        cart.addProduct(
                new Question10_Product(
                        "Mouse",
                        100
                )
        );

        assertEquals(
                1100,
                cart.totalPrice()
        );
    }

    @Test
    void emptyCartShouldTotalZero() {

        Question10_ShoppingCart cart =
                new Question10_ShoppingCart();

        assertEquals(
                0,
                cart.totalPrice()
        );
    }

    @Test
    void shouldStoreProductDetails() {

        Question10_Product product =
                new Question10_Product(
                        "Keyboard",
                        250
                );

        assertEquals(
                "Keyboard",
                product.getName()
        );

        assertEquals(
                250,
                product.getPrice()
        );
    }
}