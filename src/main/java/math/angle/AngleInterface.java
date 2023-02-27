package math.angle;

import java.util.Map;

public interface AngleInterface {
    double getSin(Double degrees);

    double getCos(Double degrees);

    Map<Double, Double> getSinInRange(Double startDegrees, Double endDegrees, Double stepDegrees);
}
