package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> resultArrayDeque = new ArrayDeque<>();

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            resultArrayDeque.add(firstQueue.poll());
            resultArrayDeque.add(Objects.requireNonNull(secondQueue.poll()));
            resultArrayDeque.add(Objects.requireNonNull(firstQueue.poll()));
        }

        return resultArrayDeque;
    }
}
