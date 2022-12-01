package main.testcases;


import main.testcases.Test1.Test1;
import main.testcases.Test2.Test2;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        Test1 ts1 = new Test1();
        Thread thread1 = new Thread(ts1);
        Thread thread2 = new Thread(ts1);
        Thread thread3 = new Thread(ts1);
        thread1.start();
        thread1.join(2000);
        thread2.start();
        thread2.join(2000);
        thread3.start();
    }
}
