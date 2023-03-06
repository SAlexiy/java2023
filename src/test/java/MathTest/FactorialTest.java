package MathTest;

import org.junit.jupiter.api.Test;
import com.salexiy.java2023.mathematics.math.Math;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {
    Math math = new Math();

    @Test
    void getFactorialForParamIsZero() {
        int param = 0;
        BigInteger result = BigInteger.ONE;

        assertEquals(result, math.getFactorial(param));
    }

    @Test
    void getFactorialForParamIsTen() {
        int param = 10;
        BigInteger result = BigInteger.valueOf(3628800);

        assertEquals(result, math.getFactorial(param));
    }

    @Test
    void getFactorialForParamLessThenZero() {
        int param = -1;

        assertThrows(RuntimeException.class, () -> {
            math.getFactorial(param);
        });
    }

    //уснул пока ждал
    @Test
    void getFactorialForParamIsMaxValue() {
        int param = Integer.MAX_VALUE;
        BigInteger result = BigInteger.ZERO;

        assertEquals(result, math.getFactorial(param));
    }

    @Test
    void getFactorialForParamIsMinValue() {
        int param = Integer.MIN_VALUE;

        assertThrows(RuntimeException.class, () -> {
            math.getFactorial(param);
        });
    }
}
