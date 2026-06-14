package oopmastery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question07_PaymentMethodTest {

    @Test
    void creditCardShouldPay() {

        Question07_PaymentMethod payment =
                new Question07_CreditCardPayment();

        assertEquals(
                "Paid with credit card",
                payment.pay(100)
        );
    }

    @Test
    void cashShouldPay() {

        Question07_PaymentMethod payment =
                new Question07_CashPayment();

        assertEquals(
                "Paid with cash",
                payment.pay(100)
        );
    }

    @Test
    void shouldSupportPolymorphism() {

        Question07_PaymentMethod payment;

        payment =
                new Question07_CreditCardPayment();

        assertEquals(
                "Paid with credit card",
                payment.pay(500)
        );

        payment =
                new Question07_CashPayment();

        assertEquals(
                "Paid with cash",
                payment.pay(500)
        );
    }
}