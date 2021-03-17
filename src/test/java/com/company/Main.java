package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello word");
        Process process1 = Runtime.getRuntime().exec("ls -lah",null, new File("/home/oleh/phpProjects/gomer.splitter.base"));
       // printResults(process1);
        Process process  = Runtime.getRuntime().exec("./yii gomer/uploader/download-prices",null, new File("/home/oleh/phpProjects/gomer.splitter.base"));
        printResults(process);


	// write your code here
    }
    public static void printResults(Process process) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
