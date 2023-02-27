package MathTest;

import org.junit.jupiter.api.Test;
import math.Math;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SignTest {
    Math math = new Math();

    @Test
    void getSignForParamGreaterThenZero() {
        int param = 1;
        Integer result = 1;

        assertEquals(result, math.getSign(param));       
    }

    @Test
    void getSignForParamIsZero() {
        int param = 0;
        Integer result = 0;

        assertEquals(result, math.getSign(param));
    }

    @Test
    void getSignForParamLessThenZero() {
        int param = -1;
        Integer result = -1;

        assertEquals(result, math.getSign(param));
    }

    @Test
    void getSignForParamIsMaxValue() {
        int param = Integer.MAX_VALUE;
        Integer result = 1;

        assertEquals(result, math.getSign(param));
    }

    @Test
    void getSignForParamIsMinValue() {
        int param = Integer.MIN_VALUE;
        Integer result = -1;

        assertEquals(result, math.getSign(param));
    }

    @Test
    void getSignForParamIsMaxValuePlusOne() {
        int param = Integer.MAX_VALUE;
        Integer result = -1;

        assertEquals(result, math.getSign(param + 1));
    }

    @Test
    void getSignForParamIsMinValueMinesOne() {
        int param = Integer.MIN_VALUE;
        Integer result = 1;

        assertEquals(result, math.getSign(param - 1));
    }
}
