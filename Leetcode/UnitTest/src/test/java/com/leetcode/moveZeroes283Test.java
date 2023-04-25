package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class moveZeroes283Test {

    @Test
    void moveZeroes() {
        var moveZeroes283 = new moveZeroes283();
        int ints[] = new int[]{2,3,1,0,0};
        assertArrayEquals(ints,moveZeroes283.moveZeroes(new int[]{0,2,3,0,1}));
    }
}