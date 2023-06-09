package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode933 {
    Queue<Integer> queue;
    public Leetcode933(){
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (!queue.isEmpty() && t - queue.peek() > 3000) {
            queue.poll();
        }
        return queue.size();
    }
}
