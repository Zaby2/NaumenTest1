package main.testcases.Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    private int curPos = 15;
    public void contactChanger() throws InterruptedException {
        WebDriver wb = new ChromeDriver();
        wb.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html?locale=en#!CwCellTable");
        Thread.sleep(6000);
        WebElement firstName = wb.findElement(By.cssSelector("#gwt-debug-contentPanel > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(3) > div > div > div > table > tbody > tr:nth-child(1) > td > table > tbody:nth-child(3) > tr:nth-child(1) > td:nth-child(2)"));
        WebElement firstNameClicked = wb.findElement(new By.ByXPath("//*[@id=\"gwt-debug-contentPanel\"]/div[2]/div/div[2]/div/div[3]/div/div/div/table/tbody/tr[1]/td/table/tbody[1]/tr[1]/td[2]"));
        WebElement lastName = wb.findElement(By.cssSelector("#gwt-debug-contentPanel > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(3) > div > div > div > table > tbody > tr:nth-child(1) > td > table > tbody:nth-child(3) > tr:nth-child(1) > td:nth-child(3) > div"));
        WebElement category = wb.findElement(By.cssSelector("#gwt-debug-contentPanel > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(3) > div > div > div > table > tbody > tr:nth-child(1) > td > table > tbody:nth-child(3) > tr:nth-child(1) > td:nth-child(4)"));
        WebElement nextPage = wb.findElement(By.cssSelector("#gwt-debug-contentPanel > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(3) > div > div > div > table > tbody > tr:nth-child(2) > td > table > tbody > tr > td:nth-child(4) > img"));
        for (int i = 0; i < 250; i++) {
          // firstName.clear();
            //lastName.clear();
            firstNameClicked.click();
            Thread.sleep(2000);
            //firstNameClicked.clear();
            firstNameClicked.sendKeys("Bogdan");
            //lastName.click();
           // lastName.clear();

           // firstName.sendKeys("Bogdan");
          // lastName.sendKeys("Shitov");
          //  if (i == curPos) {
              //  curPos *= 2;
              //  nextPage.click();
           // }
        }
    }

}
