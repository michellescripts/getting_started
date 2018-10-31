package com.gettingstarted.kitchen;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class InventoryTest {
    Inventory inventory;

    @Before
    public void initApp(){
         inventory = new Inventory();
    }

    @Test
    public void numberOfLaCroixInFebruary_returnsCorrectAmount() {
        assert(inventory.numberOfLaCroixInFebruary()).equals(75);
    }

    @Test
    public void numberOfPbCupsQ1_returnsCorrectAmount() {
        assert(inventory.numberOfPbCupsQ1()).equals(147);
    }

    @Test
    public void mostPopularItem_returnsMostOrderedItem() {
        assert(inventory.mostPopularItem()).equals("LaCroix");
    }

    @Test
    public void costOfLaCroixQ1_returnsTotalCost() {
        assert(inventory.costOfLaCroixQ1()).equals(453.72);
    }

    @Test
    public void mostExpensiveItem_returnsCorrectItem() {
        assert(inventory.mostExpensiveItem()).equals("Dried Mango");
    }
}
