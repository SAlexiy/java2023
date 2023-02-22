package console;

import java.util.Scanner;

public class Reader {
    Scanner scanner;

    public Reader(Scanner scanner){
        this.scanner = scanner;
    }

    public String readName(){
        System.out.print("Введите своё имя: ");

        String str = scanner.nextLine();

        if(str.isEmpty() || str.equals(null)){
            str = "errorName";
        }

        return str;
    }
}
