package by.mjc.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class StringUtilsTest {

    @Test
    public void isPositiveNumberTestCorrect() {
        assertTrue(new StringUtils().isPositiveNumber("29"));
    }

    @Test
    public void isPositiveNumberTestIncorrect() {
        assertFalse(new StringUtils().isPositiveNumber("-30"));
    }
}
