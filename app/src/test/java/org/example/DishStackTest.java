package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DishStackTest {
    @Test
    void testPush() {
        DishStack stack = new DishStack();
        Dish dish = new Dish("Pasta");
        stack.push(dish);
        assertEquals(1, stack.size());
        assertFalse(stack.isEmpty());
        stack.push(new Dish("Salad"));
        assertEquals(2, stack.size());
    }
    @Test
    void testPop() {
        DishStack stack = new DishStack();
        Dish dish = new Dish("Pasta");
        stack.push(dish);
        Dish poppedDish = stack.pop();
        assertEquals(dish, poppedDish);
        assertEquals(0, stack.size());
        assertTrue(stack.isEmpty());
    }
    @Test
    void testPeek() {
        DishStack stack = new DishStack();
        Dish dish = new Dish("Pasta");
        stack.push(dish);
        Dish peekedDish = stack.peek();
        assertEquals(dish, peekedDish);
        assertEquals(1, stack.size());
        assertFalse(stack.isEmpty());
    }
    @Test
    void testSize() {
        DishStack stack = new DishStack();
        assertEquals(0, stack.size());
        stack.push(new Dish("Pasta"));
        assertEquals(1, stack.size());
        stack.push(new Dish("Salad"));
        assertEquals(2, stack.size());
        stack.pop();
        assertEquals(1, stack.size());
    }   
}
