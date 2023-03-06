package com.salexiy.java2023.mathematics;

import com.salexiy.java2023.mathematics.console.ConsoleRepository;
import com.salexiy.java2023.mathematics.console.Writer;
import com.salexiy.java2023.mathematics.math.Math;
import com.salexiy.java2023.mathematics.console.Reader;

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
