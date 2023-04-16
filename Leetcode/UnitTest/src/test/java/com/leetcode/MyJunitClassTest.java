package com.leetcode;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyJunitClassTest {
    @Test
    public void MaxConsecutiveOnesShouldBeThree(){
        var cal = new MyJunitClass.Solution();
        assertEquals(3, cal.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 1}));
    }
}