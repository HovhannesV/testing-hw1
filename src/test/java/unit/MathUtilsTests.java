package unit;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import math.MathUtils;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.Assert.assertEquals;

public class MathUtilsTests {

    @Test
    @DisplayName("should return 1 for positive values")
    public void testSignumPositive() {
        assertEquals(MathUtils.signum(5.4), 1);
    }
    @Test
    @DisplayName("should return -1 for negative values")
    public void testSignumNegative() {
        assertEquals(MathUtils.signum(-4.6), -1);
    }

    @Test
    @DisplayName("should return 0 for 0")
    public void testSignumZero() {
        assertEquals(MathUtils.signum(0), -0);
    }

    @Test
    @DisplayName("should throw error when provided 0")
    public void testReciprocalZero() {
        assertThrows(Exception.class, () -> MathUtils.reciprocal(0), "Division by zero");
    }

    @Test
    @DisplayName("should return inverse of the number")
    public void testReciprocal() throws Exception {
        assertEquals(MathUtils.reciprocal(0.5), 2.0, 0.001);
    }


    @Test
    @DisplayName("should return the same number when its positive")
    public void testModulePositive() {
        assertEquals(MathUtils.module(1.0), 1.0, 0.001);
    }

    @Test
    @DisplayName("should return the same number when its 0")
    public void testModuleZero() {
        assertEquals(MathUtils.module(0.0), 0, 0.001);
    }

    @Test
    @DisplayName("should return the opposite number when its negative")
    public void testModuleNegative() {
        assertEquals(MathUtils.module(-1.0), 1.0, 0.001);
    }

    @Test
    @DisplayName("should return inside, when point is inside the circle")
    public void testPositionWithRespectToCircleInside() {
        assertEquals(MathUtils.positionWithRespectToCircle(0, 1, 3), "inside");
    }

    @Test
    @DisplayName("should return outside, when point is outside the circle")
    public void testPositionWithRespectToCircleOutside() {
        assertEquals(MathUtils.positionWithRespectToCircle(0, 10, 3), "outside");
    }

    @Test
    @DisplayName("should return on, when point is on the circle")
    public void testPositionWithRespectToCircleOn() {
        assertEquals(MathUtils.positionWithRespectToCircle(4, 3, 5), "on");
    }


}
