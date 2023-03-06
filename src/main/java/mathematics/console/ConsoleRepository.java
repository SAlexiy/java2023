package mathematics.console;

import java.util.Map;

public class ConsoleRepository implements ConsoleRepositoryInterface{

    Reader reader;
    Writer writer;

    public ConsoleRepository(Reader reader, Writer writer){
        this.reader = reader;
        this.writer = writer;
    }

    @Override
    public String readName() {
        return reader.readName();
    }

    @Override
    public void writeStr(String str) {
        writer.writeStr(str);
    }

    @Override
    public void writeMap(String column1, String column2, Map<Double, Double> map) {
        writer.writeMapDoubleDouble(column1, column2, map);
    }

    @Override
    public void writeMap(Map<Double, Double> map) {
        writer.writeMapDoubleDouble("key", "value", map);
    }


}
