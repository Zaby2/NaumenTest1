package main.testcases.Test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scan {
    public String[] ScanRes() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("D:\\IdeaProjects\\NaumenTest1\\src\\main\\resources\\voc.txt"));
        StringBuffer sb = new StringBuffer();
        while(sc.hasNext()){
            sb.append(sc.nextLine());
        }
        sc.close();
        String[] str = sb.toString().split(" ");
        return str;
    }
}

