package mathematics.console;

import java.util.Map;

public interface ConsoleRepositoryInterface {
    String readName();

    void writeStr(String str);

    void writeMap(String column1, String column2, Map<Double, Double> map);

    void writeMap(Map<Double, Double> map);
}
