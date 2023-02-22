import console.ConsoleRepository;
import console.Reader;
import console.Writer;
import math.AngleRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    static Scanner scanner = new Scanner(System.in);
    static Reader reader = new Reader(scanner);
    static Writer writer = new Writer();



    public static void main(String[] args) {
        ConsoleRepository consoleRepository = new ConsoleRepository(reader, writer);
        AngleRepository angleRepository = new AngleRepository();

        String name = consoleRepository.readName();
        consoleRepository.writeStr(String.format("Здравствуйте, %s", name));

        Map<Double, Double> mapOfSin = angleRepository.getSinInRange(0d,45d,5d);

        consoleRepository.writeMap("degrees", "sin",mapOfSin);
    }
}
