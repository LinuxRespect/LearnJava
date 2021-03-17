package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//добавить public in main

public class ExampleException {
     static void main(String[] args) {
        try {
            File file = new File("/home/oleh/Documents/t.txt");
            Scanner scan = new Scanner(file);
        } catch (FileNotFoundException ex) {
            System.out.println("2 ex");
        } catch (IOException ex) {
            System.out.println("1 ex");
        } finally {
            System.out.println("finally");
        }
    }
}
