package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator {

    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> resultDeque = new ArrayDeque<>();
        resultDeque.addLast(firstQueue.poll());
        resultDeque.addLast(firstQueue.poll());
        resultDeque.addLast(secondQueue.poll());
        resultDeque.addLast(secondQueue.poll());

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            firstQueue.add(resultDeque.pollLast());
            resultDeque.addLast(firstQueue.poll());
            if(!firstQueue.isEmpty()){
                resultDeque.addLast(firstQueue.poll());
            }
            secondQueue.add(resultDeque.pollLast());
            resultDeque.addLast(secondQueue.poll());
            if(!secondQueue.isEmpty()){
                resultDeque.addLast(secondQueue.poll());
            }
        }
        System.out.println(resultDeque);
        return resultDeque;
    }
}
