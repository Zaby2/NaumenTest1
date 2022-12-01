package main.testcases.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileNotFoundException;
import java.util.Random;

public class Test1 implements Runnable {
    private String[] voc;
    private int pos;
    private String startValue;
    public boolean destructiveTest() throws FileNotFoundException, InterruptedException {
        Random random = new Random();
        Scan sc = new Scan();
        WebDriver wb = new ChromeDriver();
        wb.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html?locale=en#!CwCellList");
        Thread.sleep(6500);
        WebElement firstName = wb.findElement(By.cssSelector("#gwt-debug-contentPanel > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(3) > div > div > div > table > tbody > tr:nth-child(1) > td.CMWVMEC-p-a > table > tbody > tr.middle > td.middleCenter > div > div > table > tbody > tr:nth-child(2) > td:nth-child(2) > input"));
        WebElement lastName = wb.findElement(By.cssSelector("#gwt-debug-contentPanel > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(3) > div > div > div > table > tbody > tr:nth-child(1) > td.CMWVMEC-p-a > table > tbody > tr.middle > td.middleCenter > div > div > table > tbody > tr:nth-child(3) > td:nth-child(2) > input"));
        WebElement address = wb.findElement(By.cssSelector("#gwt-debug-contentPanel > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(3) > div > div > div > table > tbody > tr:nth-child(1) > td.CMWVMEC-p-a > table > tbody > tr.middle > td.middleCenter > div > div > table > tbody > tr:nth-child(6) > td:nth-child(2) > textarea"));
        WebElement birthday = wb.findElement(By.cssSelector("#gwt-debug-contentPanel > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(3) > div > div > div > table > tbody > tr:nth-child(1) > td.CMWVMEC-p-a > table > tbody > tr.middle > td.middleCenter > div > div > table > tbody > tr:nth-child(5) > td:nth-child(2) > input"));
        WebElement loginBut = wb.findElement(By.cssSelector("#gwt-debug-contentPanel > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(3) > div > div > div > table > tbody > tr:nth-child(1) > td.CMWVMEC-p-a > table > tbody > tr.middle > td.middleCenter > div > div > table > tbody > tr:nth-child(7) > td > button:nth-child(2)"));
        WebElement startVal = wb.findElement(By.cssSelector("#gwt-debug-contentPanel > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(3) > div > div > div > table > tbody > tr:nth-child(1) > td:nth-child(1) > div.gwt-HTML"));
        WebElement generator = wb.findElement(By.cssSelector("#gwt-debug-contentPanel > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(3) > div > div > div > table > tbody > tr:nth-child(1) > td.CMWVMEC-p-a > button"));
        voc = sc.ScanRes();
        startValue = startVal.getText();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 20; j++) {
                generator.click();
           }
            pos = random.nextInt(voc.length);
            firstName.clear();
            lastName.clear();
            address.clear();
            birthday.clear();
            firstName.sendKeys(voc[pos]);
            pos = random.nextInt(voc.length);
            lastName.sendKeys(voc[pos]);
            pos = random.nextInt(voc.length);
            address.sendKeys(voc[pos]);
            pos = random.nextInt(voc.length);
            birthday.sendKeys("1111");
            birthday.sendKeys(Keys.TAB);
            loginBut.click();
            WebElement curVal = wb.findElement(By.cssSelector("#gwt-debug-contentPanel > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(3) > div > div > div > table > tbody > tr:nth-child(1) > td:nth-child(1) > div.gwt-HTML"));
            if ((curVal.getText()).equals(startValue)) {
                System.out.println(curVal.getText());
                System.out.println(startVal.getText());
                return false;
            } else {
                startValue = curVal.getText();
            }
        }
        return true;
    }
    @Override
    public void run() {
        try {
            if (destructiveTest()) {
                System.out.println(Thread.currentThread().getName() + " Test 1 Passed");
            } else {
                System.out.println(Thread.currentThread().getName() + " Test 1 Failed");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
