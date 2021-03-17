package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InnerException {
    public static void main(String [] arqs){
        try{
            FileReader fr1 = new FileReader("/home/oleh/Documents/t.txt");
            try {
                FileReader fr2 = new FileReader("test2.txt");
            } catch (IOException e) {
                System.out.print("test2");
            }
            System.out.print("+");
        } catch (FileNotFoundException e) {
            System.out.print("test1");
        }
        System.out.print("+");

        Quest quest= new Quest();
        Float d =quest.inc();
        System.out.println(d);
    }
}
