import Mathematics.console.ConsoleRepository;
import Mathematics.console.Reader;
import Mathematics.console.Writer;
import Mathematics.math.Math;

import java.util.Map;
import java.util.Scanner;

public class Application {
    static Scanner scanner = new Scanner(System.in);
    static Reader reader = new Reader(scanner);
    static Writer writer = new Writer();



    public static void main(String[] args) {
        ConsoleRepository consoleRepository = new ConsoleRepository(reader, writer);
        Math math = new Math();

        String name = consoleRepository.readName();
        consoleRepository.writeStr(String.format("Здравствуйте, %s", name));

        Map<Double, Double> mapOfSin = math.getSinInRange(0d,45d,5d);

        consoleRepository.writeMap("degrees", "sin",mapOfSin);
    }
}
