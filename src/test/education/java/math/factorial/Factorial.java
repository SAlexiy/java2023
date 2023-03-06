package mathematics.math.factorial;

import java.math.BigInteger;

public class Factorial {

    /**
     * Возвращает факториал числа.
     *
     * Если num < 0, выбрасывает ислючение
     *
     * @param num
     * @return BigInteger
     */
    public BigInteger getFactorial(int num){

        if(num < 0) throw new RuntimeException("Factorial.getFactorial: параметр меньше нуля");

        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= num; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}
