package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode27Test {

    @Test
    void OutputIsTwo() {
        var removeElement = new Leetcode27();
        assertEquals(2, removeElement.removeElement(new int[]{3, 2, 2, 3}, 3));
    }
}