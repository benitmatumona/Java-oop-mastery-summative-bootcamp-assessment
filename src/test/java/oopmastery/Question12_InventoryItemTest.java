    package oopmastery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question12_InventoryItemTest {

    @Test
    void shouldStoreItemDetails() {

        Question12_InventoryItem item =
                new Question12_InventoryItem(
                        "Keyboard",
                        10
                );

        assertEquals(
                "Keyboard",
                item.getName()
        );

        assertEquals(
                10,
                item.getQuantity()
        );
    }

    @Test
    void shouldAddStock() {

        Question12_InventoryItem item =
                new Question12_InventoryItem(
                        "Keyboard",
                        10
                );

        item.addStock(5);

        assertEquals(
                15,
                item.getQuantity()
        );
    }

    @Test
    void shouldRemoveStock() {

        Question12_InventoryItem item =
                new Question12_InventoryItem(
                        "Keyboard",
                        10
                );

        assertTrue(
                item.removeStock(4)
        );

        assertEquals(
                6,
                item.getQuantity()
        );
    }

    @Test
    void shouldNotRemoveMoreThanAvailable() {

        Question12_InventoryItem item =
                new Question12_InventoryItem(
                        "Keyboard",
                        10
                );

        assertFalse(
                item.removeStock(20)
        );

        assertEquals(
                10,
                item.getQuantity()
        );
    }

    @Test
    void negativeQuantityShouldBecomeZero() {

        Question12_InventoryItem item =
                new Question12_InventoryItem(
                        "Keyboard",
                        -5
                );

        assertEquals(
                0,
                item.getQuantity()
        );
    }

    @Test
    void shouldIgnoreNegativeStockAdditions() {

        Question12_InventoryItem item =
                new Question12_InventoryItem(
                        "Keyboard",
                        10
                );

        item.addStock(-5);

        assertEquals(
                10,
                item.getQuantity()
        );
    }
}