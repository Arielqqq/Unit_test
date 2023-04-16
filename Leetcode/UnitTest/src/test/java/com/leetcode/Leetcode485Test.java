package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class Leetcode485Test {

    @Test
    void MaxConsecutiveOnesShouldBeThree() {
        var cal = new Leetcode485();
        Assertions.assertEquals(3, cal.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 1}));
    }
}