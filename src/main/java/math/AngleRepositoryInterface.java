package math;

import java.util.Map;

public interface AngleRepositoryInterface {
    double getSin(Double degrees);

    double getCos(Double degrees);

    Map<Double, Double> getSinInRange(Double startDegrees, Double endDegrees, Double stepDegrees);
}
