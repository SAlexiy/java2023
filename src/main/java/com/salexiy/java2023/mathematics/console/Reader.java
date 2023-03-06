package com.salexiy.java2023.mathematics.console;

import java.util.Scanner;

public class Reader {
    Scanner scanner;


    public Reader(Scanner scanner){
        this.scanner = scanner;
    }

    public String readName(){
        System.out.print("Введите своё имя: ");

        String str = scanner.nextLine();

        if(str.isEmpty()){
            str = "errorName";
        }

        return str;
    }
}
