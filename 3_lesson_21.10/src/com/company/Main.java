package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static int PrintNumberWorks(String File) {
        int i = 0;

        try (Scanner sc = new Scanner(new FileReader(File))){

            while (sc.hasNext()){
                i++;
                sc.next();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл с таким названием отсутствует в данной директории");
        }
    return i;

    }
    public static void main(String[] args){
        try {
            if (args.length != 0) {
                System.out.println(PrintNumberWorks(args[0]));
            }
            else {
                throw new IllegalArgumentException("Входной аргумент не задан!");
            }
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }


}
