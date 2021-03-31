package com.example.assertions2assertj.nested;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NestedClassTest {

    @Test
    void someTest() {
        NestedClass sut = new NestedClass();

        final int result = sut.add(2, 2);

        assertEquals(4, result);
    }

    @Nested
    class NestedTest {

        @Test
        void nestedTest() {
            NestedClass sut = new NestedClass();

            final int result = sut.add(1, 1);

            assertEquals(2, result);
        }
    }
}
