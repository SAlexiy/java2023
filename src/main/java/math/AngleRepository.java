package math;

import java.util.HashMap;
import java.util.Map;

public class AngleRepository implements AngleRepositoryInterface{

    Sin sin;
    Cos cos;

    public AngleRepository(){
        this.sin = new Sin();
        this.cos = new Cos();
    }


    @Override
    public double getSin(Double degrees) {
        return sin.getSin(degrees);
    }

    @Override
    public double getCos(Double degrees) {
        return cos.getCos(degrees);
    }

    @Override
    public Map<Double, Double> getSinInRange(Double startDegrees, Double endDegrees, Double stepDegrees) {
        Map<Double, Double> map = new HashMap<>();

        for (var degrees = startDegrees; degrees <= endDegrees; degrees += stepDegrees){
            map.put(degrees, sin.getSin(degrees));
        }

        return map;
    }
}
