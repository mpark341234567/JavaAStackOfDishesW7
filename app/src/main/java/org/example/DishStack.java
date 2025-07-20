package org.example;

public class DishStack {
    private Dish[] dishes = new Dish[4];
    private int top = -1;
    private int capacity = 4;

    public void push(Dish dish) {
        if (isFull()) {//if the stack is full
            throw new IllegalStateException("Stack is full");
        }
        dishes[++top] = dish;//preincrement top and add dish
    }

    public Dish pop() {
        if (isEmpty()) {//if the stack is empty
            throw new IllegalStateException("Stack is empty");
        }
        return dishes[top--];//return the dish and decrement top
    }

    public Dish peek() {
        if (isEmpty()) {//if the stack is empty
            throw new IllegalStateException("Stack is empty");
        }
        return dishes[top];//return the dish at the top without removing it
    }

    public int size() {
        return top + 1; //return the number of dishes in the stack
    }

    public boolean isEmpty() {
        return top == -1;//check if the stack is empty
    }

    public boolean isFull() {
        return top == capacity - 1;//check if the stack is full
    }
}
