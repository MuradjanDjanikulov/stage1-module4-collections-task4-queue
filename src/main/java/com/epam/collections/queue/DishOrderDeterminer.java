package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> resultOrder = new ArrayList<>();

        // Initialize the queue with dish numbers
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.offer(i);
        }

        // Determine the dish order
        while (!queue.isEmpty()) {
            for (int i = 1; i <= everyDishNumberToEat; i++) {
                int dishNumber = queue.poll();
                if (i == everyDishNumberToEat) {
                    // Add the dish to the result order
                    resultOrder.add(dishNumber);
                } else {
                    // Requeue the dish for the next round
                    queue.offer(dishNumber);
                }
            }
        }

        return resultOrder;
    }
}
