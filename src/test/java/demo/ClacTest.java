package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClacTest {
    @Test
    void add() {
          assertEquals(3,Clac.add(1,2));
    }

    @Test
    void subtract() {
        assertEquals(-1,Clac.subtract(1,2));
    }
}