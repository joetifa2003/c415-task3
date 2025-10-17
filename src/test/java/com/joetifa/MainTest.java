package com.joetifa;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void add() {
        int res = Main.add(1, 3);
        assertEquals(4, res);
    }
}