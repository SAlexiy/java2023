package mathematics.math;

import Mathematics.math.angle.AngleInterface;
import Mathematics.math.angle.Cos;
import Mathematics.math.angle.Sin;
import Mathematics.math.factorial.Factorial;
import Mathematics.math.factorial.FactorialInterface;
import Mathematics.math.sign.Sign;
import Mathematics.math.sign.SignInterface;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Math implements AngleInterface, FactorialInterface, SignInterface {

    Sin sin;
    Cos cos;
    Factorial factorial;
    Sign sign;

    public Math(){
        this.sin = new Sin();
        this.cos = new Cos();

        this.factorial = new Factorial();
        this.sign = new Sign();
    }

    /**
     * @return
     */
    @Override
    public double getSin(Double degrees) {
        return sin.getSin(degrees);
    }

    /**
     * @return
     */
    @Override
    public double getCos(Double degrees) {
        return cos.getCos(degrees);
    }

    /**
     * @return
     */
    @Override
    public Map<Double, Double> getSinInRange(Double startDegrees, Double endDegrees, Double stepDegrees) {
        Map<Double, Double> map = new HashMap<>();

        for (var degrees = startDegrees; degrees <= endDegrees; degrees += stepDegrees){
            map.put(degrees, sin.getSin(degrees));
        }

        return map;
    }


    /**
     * Возвращает факториал числа.
     *
     * Если num < 0, выбрасывает ислючение
     *
     * @param num
     * @return BigInteger
     */
    @Override
    public BigInteger getFactorial(int num) {
        return factorial.getFactorial(num);
    }


    /**
     * Если num > 0, возврашает 1,
     * Если num == 0,возвращает 0,
     * Если num < 0, возвращает -1.
     *
     * @param num
     * @return Integer
     */
    @Override
    public Integer getSign(int num) {
        return sign.getSign(num);
    }
}
