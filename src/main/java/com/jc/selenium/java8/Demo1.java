package com.jc.selenium.java8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Demo1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.in");
        List<WebElement> list = driver.findElements(By.xpath("//a"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getText());
        }

        driver.close();
    }
}
