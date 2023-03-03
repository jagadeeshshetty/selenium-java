package com.jc.java8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo1 {

    public static void main(String[] args) {

        // set up
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.amazon.in");
        List<WebElement> list = driver.findElements(By.xpath("//a"));
        List<String> text = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String tmp = list.get(i).getText();
            text.add(tmp);
        }
        Set<String> removeDuplicates = new HashSet<String>(text);
        List<String> listAfterRemovingDuplicates = new ArrayList<>(removeDuplicates);

        for (int i = 0; i < listAfterRemovingDuplicates.size(); i++) {
            System.out.println(listAfterRemovingDuplicates.get(i));
        }

        // tear down
        driver.quit();
    }
}
